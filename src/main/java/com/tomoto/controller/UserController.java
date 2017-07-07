package com.tomoto.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tomoto.pojo.TbItem;
import com.tomoto.service.ItemService;
import com.tomoto.utils.ACEResult;
import com.tomoto.utils.APIResult;
import com.tomoto.utils.APIUtil;

@RestController
@RequestMapping(value="/item")
public class UserController {
	
	@Autowired
	private ItemService service;

	
	@RequestMapping(value="/list")
	public ACEResult listAll(){
		List<TbItem> data = service.listAll();
		if(null != data){
			return ACEResult.ok(data);
		}else{
			return ACEResult.build(500, "查询失败");
		}
	}
	
	//测试分词接口
	@RequestMapping(value="/word")
	public ACEResult getWords(@RequestParam(value="text") String text) throws UnsupportedEncodingException{
		System.out.println("param:"+text);
		if(null != text){
			text = new String(text.getBytes("iso8859-1"), "utf-8");
			System.out.println("text:"+text);
		}
		if(null == text){
			return ACEResult.build(400, "参数不完整");
		}
		APIResult data = APIUtil.getWords(text);
		System.out.println("分词结果："+data.getShowapi_res_body().getList());
		return ACEResult.ok(data);
	}
	
	
	//导入数据到redis
	@RequestMapping(value="/push")
	public ACEResult pushItemToCache(){
		return service.pushItemToCache();
	}
	
	@RequestMapping(value="/q")
	public ACEResult search(@RequestParam(value="category", required=false) String category, 
			@RequestParam(value="press", required=false) String press, @RequestParam(value="price", required=false) Integer price, 
			@RequestParam(value="pack", required=false) String pack, @RequestParam(value="grade", required=false) Integer grade) throws UnsupportedEncodingException{
		if(category != null){
			category = dealCode(category);
		}
		if(press != null){
			press = dealCode(press);
		}
		if(pack != null){
			pack = dealCode(pack);
		}
		
		return service.searchItem(category, press, price, pack, grade);
	}
	
	private static String dealCode(String code) throws UnsupportedEncodingException{
		return new String(code.getBytes("iso8859-1"), "utf-8");
	}
	
	
}
