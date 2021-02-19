package com.rj.bd;

import java.util.HashMap;

import cn.hutool.http.HttpUtil;

/**
* @desc Post例子
* @author TianShuo
* @version 2021年2月19日 上午11:47:07
*/
public class PostTest {



	public static void main(String[] args) {
		//1，定义一个URL
		String url = "https://www.baidu.com";
		
		//2, 定义一个参数的map
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		
		//3,将参数存入到map中
		paramMap.put("city", "北京");
		
		//4, 请求
		String  result = HttpUtil.post(url, paramMap);
		
		//5，打印结果
		System.out.println(result);
	}

}
