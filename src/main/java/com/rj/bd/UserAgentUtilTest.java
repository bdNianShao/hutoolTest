package com.rj.bd;

import cn.hutool.http.useragent.UserAgent;
import cn.hutool.http.useragent.UserAgentUtil;

/**
* @desc 测试服务器能够识别客户使用的操作系统及版本、浏览器及版本、浏览器渲染引擎等。
* @author TianShuo
* @version 2021年2月19日 下午12:26:36
*/
public class UserAgentUtilTest {

	public static void main(String[] args) {
		String uaStr = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36";
		UserAgent ua = UserAgentUtil.parse(uaStr);
		//浏览器类型
		System.out.println(ua.getBrowser().toString());
		//浏览器版本
		System.out.println(ua.getVersion());
		//引擎类型
		System.out.println(ua.getEngine().toString());
		//引擎版本
		System.out.println(ua.getEngineVersion());
		//操作系统
		System.out.println(ua.getOs().toString());
		//平台类型
		System.out.println(ua.getPlatform().toString());

		//判断终端是否为移动终端
		System.out.println(ua.isMobile());
	}

}
