package com.rj.bd;

import cn.hutool.http.HtmlUtil;

/**
* @desc HtmlUtil的测试类
* @author TianShuo
* @version 2021年2月19日 下午12:07:21
*/
public class HtmlTest {
	/**
	 * 转义HTML特殊字符
	 */
	public static void main0(String[] args) 
	{
		String html = "<html><body>123'123'</body></html>"
				;
		// 结果为：&lt;html&gt;&lt;body&gt;123&#039;123&#039;&lt;/body&gt;&lt;/html&gt;
		
		String escape = HtmlUtil.escape(html);
		
		System.out.println(escape);
	}
	/**
	 * 还原被转义的HTML特殊字符
	 */
	public static void main1(String[] args) 
	{
		String escape = "&lt;html&gt;&lt;body&gt;123&#039;123&#039;&lt;/body&gt;&lt;/html&gt;";
		// 结果为：<html><body>123'123'</body></html>
		String unescape = HtmlUtil.unescape(escape);
		System.out.println(unescape);
	}
	/**
	 * 清除指定HTML标签和被标签包围的内容
	 */
	public static void main2(String[] args) {
		String str = "pre<img src=\"xxx/dfdsfds/test.jpg\">";
		// 结果为：pre
		String result = HtmlUtil.removeHtmlTag(str, "img");
		System.out.println(result);
	}
	
	/**
	 * 清除所有HTML标签，但是保留标签内的内容
	 */
	public static void main3(String[] args) 
	{
		String str = "pre<div class=\"test_div\">\r\n\t\tdfdsfdsfdsf\r\n</div><div class=\"test_div\">BBBB</div>";
		// 结果为：pre\r\n\t\tdfdsfdsfdsf\r\nBBBB
		String result = HtmlUtil.cleanHtmlTag(str);
		System.out.println(result);
	}
	
	/**
	 * 去除HTML标签中的指定属性，如果多个标签有相同属性，都去除
	 */
	public static void main4(String[] args) 
	{
		String html = "<div class=\"test_div\"></div><span class=\"test_div\" id=\"test_div\"></span>";
		// 结果为：<div></div><span></span>
		String result = HtmlUtil.removeHtmlAttr(html, "class");
		System.out.println(result);
	}
	
	/**
	 * 去除指定标签的所有属性
	 */
	public static void main5(String[] args) 
	{
		String html = "<div class=\"test_div\" width=\"120\">你好</div>";
		// 结果为：<div></div>
		String result = HtmlUtil.removeAllHtmlAttr(html, "div");
		System.out.println(result);
	}
	

}
