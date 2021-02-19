package com.rj.bd;

import java.util.HashMap;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;

/**
* @desc 文件的上传
* @author TianShuo
* @version 2021年2月19日 上午11:52:00
*/
public class FileOutTest {

	public static void main(String[] args) {
		//1. 定义一个参数的MAP
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		
		//2.拿到文件并存到参数map中
		paramMap.put("file", FileUtil.file("F:\\11111.txt"));
		
		//3.请求并传入参数
		String result = HttpUtil.post("https://www.baidu.com", paramMap);
		
		System.out.println(result);
		
		
	}

}
