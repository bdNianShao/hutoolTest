package com.rj.bd;

import java.util.HashMap;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.HttpUtil;

/**
* @desc 测试get
* @author TianShuo
* @version 2021年2月19日 上午11:38:10
*/
public class GetTest {

	public static void main3(String[] args) {
		//1.定义一个网络地址
		String url = "https://www.baidu.com";
		//2.请求并拿到结果
		
		String  result = HttpUtil.get(url);
		//3.打印结果
		System.out.println(result);
	}
	public static void main2(String[] args) {
		//1.定义一个网络地址
		String url = "https://www.baidu.com";
		
		//2.请求并拿到结果
		// 当无法识别页面编码的时候，可以自定义请求页面的编码
		
		String  result = HttpUtil.get("https://www.baidu.com", CharsetUtil.CHARSET_UTF_8);
		//3.打印结果
		System.out.println(result);

	}
	public static void main(String[] args) {
		//1.定义一个网络地址
				String url = "https://www.baidu.com";
		//可以单独传入Http参数  这样参数会自动做URL转码  拼接在uRL中
		
				//2.定义一个参数的Map
				HashMap<String, Object> paramMap = new HashMap<String, Object>();
				//3. 赋值
				
				paramMap.put("city", "北京");
				//4，请求  
				String result1 = HttpUtil.get(url,paramMap);
				//本质上 https://www.baidu.com?city=北京
				//当然这个北京是已经被转码
				System.out.println(result1);
	}
	
}
