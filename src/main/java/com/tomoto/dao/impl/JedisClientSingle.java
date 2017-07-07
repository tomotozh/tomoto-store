package com.tomoto.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tomoto.dao.JedisClient;
import com.tomoto.pojo.TbItem;
import com.tomoto.utils.JsonUtils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * 单机版Jedis Dao
 */
//这里可以设置首选，但是在xml中配置了这里就不用声明了！
//@Primary
public class JedisClientSingle implements JedisClient {

	@Autowired
	private JedisPool jedisPool;
	
	@Override
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		try {
			String string = jedis.get(key);
			jedis.close();
			jedis = null;
			return string;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public String set(String key, String value) {
		Jedis jedis = jedisPool.getResource();
		try {
			String string = jedis.set(key, value);
			jedis.close();
			jedis = null;
			return string;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long hset(String hkey, String key, String value) {
		Jedis jedis = jedisPool.getResource();
		try {
			Long result = jedis.hset(hkey, key, value);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public String hget(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		try {
			String string = jedis.hget(hkey, key);
			jedis.close();
			jedis = null;
			return string;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	/**
	 * 自增
	 */
	@Override
	public Long incr(String key) {
		Jedis jedis = jedisPool.getResource();
		try {
			Long result = jedis.incr(key);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	/**
	 * 设置过期时间，单位秒
	 */
	@Override
	public Long expire(String key, int second) {
		Jedis jedis = jedisPool.getResource();
		try {
			long result = jedis.expire(key, second);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	/**
	 * 查看过期时间，单位秒
	 */
	@Override
	public Long ttl(String key) {
		Jedis jedis = jedisPool.getResource();
		try {
			Long result = jedis.ttl(key);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	/**
	 * 删除
	 */
	@Override
	public Long del(String key) {
		Jedis jedis = jedisPool.getResource();
		try {
			Long result = jedis.del(key);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long hdel(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		try {
			Long result = jedis.hdel(hkey, key);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Set<String> zrevrange(String key, long start, long end) {
		Jedis jedis = jedisPool.getResource();
		try {
			Set<String> set = jedis.zrevrange(key, start, end);
			jedis.close();
			jedis = null;
			return set;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long zcard(String key) {
		Jedis jedis = jedisPool.getResource();
		try {
			long card = jedis.zcard(key);
			jedis.close();
			jedis = null;
			return card;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long zadd(String key, double score, String member) {
		Jedis jedis = jedisPool.getResource();
		try {
			long result = jedis.zadd(key, score, member);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Double zscore(String key, String member) {
		Jedis jedis = jedisPool.getResource();
		try {
			double score = jedis.zscore(key, member);
			jedis.close();
			jedis = null;
			return score;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long zrem(String key, String member) {
		Jedis jedis = jedisPool.getResource();
		try {
			long result = jedis.zrem(key, member);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	
	@Override
	public List<String> lrange(String key, long start, long end) {
		Jedis jedis = jedisPool.getResource();
		try {
			List<String> result = jedis.lrange(key, start, end);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long lpush(String key, String...strings) {
		Jedis jedis = jedisPool.getResource();
		try {
			long result = jedis.lpush(key, strings);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long rpush(String key, String... strings) {
		Jedis jedis = jedisPool.getResource();
		try {
			long result = jedis.rpush(key, strings);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long llen(String key) {
		Jedis jedis = jedisPool.getResource();
		try {
			long result = jedis.llen(key);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long lrem(String key, long count, String value) {
		Jedis jedis = jedisPool.getResource();
		try {
			long result = jedis.lrem(key, count, value);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public String rpop(String key) {
		Jedis jedis = jedisPool.getResource();
		try {
			String result = jedis.rpop(key);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public String ltrim(String key, long start, long end) {
		Jedis jedis = jedisPool.getResource();
		try {
			String result = jedis.ltrim(key, start, end);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public void test() {
		Jedis jedis = jedisPool.getResource();
		try {
//			jedis.sunion(keys);
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long sadd(String key, String... strings) {
		Jedis jedis = jedisPool.getResource();
		try {
			Long result = jedis.sadd(key, strings);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Set<String> smembers(String key) {
		Jedis jedis = jedisPool.getResource();
		try {
			Set<String> result = jedis.smembers(key);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Set<String> sinter(String... keys) {
		Jedis jedis = jedisPool.getResource();
		try {
			Set<String> result = jedis.sinter(keys);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long sinterstore(String dstkey, String... keys) {
		Jedis jedis = jedisPool.getResource();
		try {
			Long result = jedis.sinterstore(dstkey, keys);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Set<String> sunion(String... keys) {
		Jedis jedis = jedisPool.getResource();
		try {
			Set<String> result = jedis.sunion(keys);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Long sunionstore(String deskey, String... keys) {
		Jedis jedis = jedisPool.getResource();
		try {
			Long result = jedis.sunionstore(deskey, keys);
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public Integer set(List<TbItem> items) {
		Jedis jedis = jedisPool.getResource();
		try {
			String key = "";
			Integer result = 0;
			for (TbItem tbItem : items) {
				String json = JsonUtils.objectToJson(tbItem);
				key = "item_msg_" + tbItem.getItemId();
				jedis.set(key, json);
				result++;
			}
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}

	@Override
	public List<TbItem> get(Set ids) {
		Jedis jedis = jedisPool.getResource();
		try {
			String key = "";
			String json = "";
			List<TbItem> result = new ArrayList<>();
			Iterator<String> it = ids.iterator();
			while(it.hasNext()){
				String id = it.next();
				key = "item_msg_" + id;
				json = jedis.get(key);
				if(null != json){
					result.add((TbItem)JsonUtils.jsonToPojo(json, TbItem.class));
				}
			}
			jedis.close();
			jedis = null;
			return result;
		} catch (Exception e){
			if (jedis != null) {
			    jedis.close();
			}
			e.printStackTrace();
			return null;
		}finally {
			if (jedis != null) {
			    jedis.close();
			}
		}
	}
	
	

}
