package com.tomoto.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomoto.dao.JedisClient;
import com.tomoto.mapper.TbItemMapper;
import com.tomoto.pojo.TbItem;
import com.tomoto.pojo.TbItemExample;
import com.tomoto.pojo.TbItemExample.Criteria;
import com.tomoto.service.ItemService;
import com.tomoto.utils.ACEResult;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper mapper;
	@Autowired
	private JedisClient jedisClient;
	
	public final static String REDIS_BASE_URL = "item_";
	
	@Override
	public List<TbItem> listAll() {
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemIdIsNotNull();
		List<TbItem> result = mapper.selectByExample(example);
		return result;
	}

	@Override
	public ACEResult pushItemToCache() {
		List<TbItem> list = this.listAll();
		jedisClient.set(list);
		for(TbItem item : list){
			//category
			String ckey = REDIS_BASE_URL + item.getItemCatogery();
			jedisClient.sadd(ckey, item.getItemId().toString());
			
			//press
			String presskey = REDIS_BASE_URL + item.getItemPress();
			jedisClient.sadd(presskey, item.getItemId().toString());
			
			//price
			String pkey = "";
			int price = item.getItemPrice();
			if(price <= 29){
				pkey = REDIS_BASE_URL + "30";
			}else if(price <= 59){
				pkey = REDIS_BASE_URL + "60";
			}else if(price <= 89){
				pkey = REDIS_BASE_URL + "90";
			}else if(price <= 199){
				pkey = REDIS_BASE_URL + "200";
			}else{
				pkey = REDIS_BASE_URL + "201";
			}
			jedisClient.sadd(pkey, item.getItemId().toString());
			
			//pack
			String packkey = REDIS_BASE_URL + item.getItemPack();
			jedisClient.sadd(packkey, item.getItemId().toString());
			
			//grade
			String key = REDIS_BASE_URL + "grade_" + item.getItemGrade();
			jedisClient.sadd(key, item.getItemId().toString());
			
		}
		return ACEResult.ok();
	}

	@Override
	public ACEResult searchItem(String category, String press, Integer price, String pack, Integer grade) {
		List<String> keys = new ArrayList<>();
		String ckey = null;
		if(null != category && "" != category){
			ckey = REDIS_BASE_URL + category;
			keys.add(ckey);
		}
		String presskey = null;
		if(null != press && "" != press){
			presskey = REDIS_BASE_URL + press;
			keys.add(presskey);
		}
		String pkey = null;
		if(null != price){
			pkey = "";
			if(price <= 29){
				pkey = REDIS_BASE_URL + "30";
			}else if(price <= 59){
				pkey = REDIS_BASE_URL + "60";
			}else if(price <= 89){
				pkey = REDIS_BASE_URL + "90";
			}else if(price <= 199){
				pkey = REDIS_BASE_URL + "200";
			}else{
				pkey = REDIS_BASE_URL + "201";
			}
			keys.add(pkey);
		}
		String packkey = null;
		if(null != pack && "" != pack){
			packkey = REDIS_BASE_URL + pack;
			keys.add(packkey);
		}
		String gkey = null;
		if(null != grade){
			gkey = REDIS_BASE_URL + "grade_" + grade;
			keys.add(gkey);
		}

		String[] ks = new String[keys.size()];
		for (int i=0; i<keys.size(); i++) {
			System.out.println(i + ":" + keys.get(i));
			ks[i] = keys.get(i);
		}
		
		long t3 = System.currentTimeMillis();
		Set<String> set = jedisClient.sinter(ks);
		
		long t4 = System.currentTimeMillis();
		System.out.println("取交集并集用时：" + (t4-t3));
		
		int count = set.size() > 10 ? 10 : set.size();
		Set<String> s = new HashSet<>();
		int i = 0;
		Iterator<String> it = set.iterator();
		while(i < count && it.hasNext()){
			s.add(it.next());
			i++;
		}
		
		long time1 = System.currentTimeMillis();
		List<TbItem> list = jedisClient.get(s);
		long time2 = System.currentTimeMillis();
		System.out.println("查询商品用时："+(time2-time1));
		return ACEResult.ok(list);
	}

	
	
}
