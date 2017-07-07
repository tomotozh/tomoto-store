package com.tomoto.utils;

import java.util.List;

public class APIBody {

	private int ret_code;
	private List<String> list;
	public int getRet_code() {
		return ret_code;
	}
	public void setRet_code(int ret_code) {
		this.ret_code = ret_code;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "APIBody [ret_code=" + ret_code + ", list=" + list + "]";
	}
	
	
	
}
