package com.tomoto.dao;

import java.util.List;
import java.util.Set;

import com.tomoto.pojo.TbItem;


public interface JedisClient {
	
	Integer set(List<TbItem> items);
	List<TbItem> get(Set ids);
	String set(String key, String value);
	String get(String key);
	Long hset(String hkey, String key, String value);
	String hget(String hkey, String key);
	Long incr(String key);//自增
	Long expire(String key, int second);//设置过期时间
	Long ttl(String key);//查看过期时间，单位秒
	Long del(String key);//删除
	Long hdel(String hkey, String key);
	
	//对新闻的操作：list
	List<String> lrange(String key, long start, long end);
	Long lpush(String key, String...strings);
	Long rpush(String key, String...strings);
	
	Long llen(String key);
	Long lrem(String key, long count, String value);
	String rpop(String key);
	String ltrim(String key, long start, long end);
	
	//对ideal的操作：sort set
	Set<String> zrevrange(String key, long start, long end);
	Long zcard(String key);
	Long zadd(String key, double score, String member);
	Double zscore(String key, String member);
	Long zrem(String key, String member);
	
	Long sadd(String key, String...strings);
	Set<String> smembers(String key);
	Set<String> sinter(String...strings);
	Long sinterstore(String dstkey, String...keys);
	Set<String> sunion(String...keys);
	Long sunionstore(String deskey, String...keys);
	
	
	void test();
}
