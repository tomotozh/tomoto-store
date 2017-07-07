package com.tomoto.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class APIUtil {

	public static APIResult getWords(String word){
//		try {
//			System.out.println("word1:"+word);
//			word = java.net.URLEncoder.encode(word, "UTF-8");
//			System.out.println("word2:"+word);
//			word = new String(word.getBytes(), "UTF-8");
//			System.out.println("word3:"+word);
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		String url = String.format("https://route.showapi.com/269-1?showapi_appid=41788&showapi_test_draft=false&showapi_sign=5bbbbf50d32a46ae90dec53a720fefcc&text="+word);
		System.out.println("url:"+url);
		URL myUrl = null;
		URLConnection httpsConn = null;
		try {
			myUrl = new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		try {
			httpsConn = (URLConnection)myUrl.openConnection();
			if(httpsConn != null){
				InputStreamReader insr = new InputStreamReader(httpsConn.getInputStream(), "UTF-8");
				BufferedReader br = new BufferedReader(insr);
				String data = null;
				if((data = br.readLine()) != null){
					System.out.println("data:"+data);
					APIResult result = JsonUtils.jsonToPojo(data, APIResult.class);
					System.out.println(result);
					return result;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
}
