package com.tomoto.service;

import java.util.List;

import com.tomoto.pojo.TbItem;
import com.tomoto.utils.ACEResult;

public interface ItemService {

	List<TbItem> listAll();
	
	ACEResult pushItemToCache();
	
	ACEResult searchItem(String category, String press, Integer price, String pack, Integer grade);
}
