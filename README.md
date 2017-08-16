# tomoto-store
Search services based on Redis

基于Redis的一个小型搜索服务

需求：
	1，查询商品时可以通过过滤条件进行查询，查询条件有：分类category、出版社press、价格price、包装pack、评分grade
	
	2，目前只能子类单选，即分类只能选择一种，后期会做到子类多选，即每一类型可以多个选项。
	

构思：
	1，利用Redis的多种数据结构，根据商品的不同特点，存储商品的对应关系
	
	2，通过对搜索条件的处理，从Redis中取出相应的结果集
	
	3，主要用到Redis中String、Set、ZSet、Sort等
	
	4，搜索原理为倒排索引。


目前：
	1，已完成子类单选，无排序；暂无排序条件，后期会加。
	
	2，分词接口基本完善

下一步：
	1，导入原始数据，
