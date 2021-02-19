package com.rj.bd;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.StreamProgress;
import cn.hutool.core.lang.Console;
import cn.hutool.http.HttpUtil;

/**
* @desc 文件的下载
* @author TianShuo
* @version 2021年2月19日 上午11:55:52
*/
public class FileGetTest {

	public static void main0(String[] args) {
		//1.网络资源的地址
		String url = "https://img-operation.csdnimg.cn/csdn/silkroad/img/1607569674685.png";
		//2.进行下载   
		//第一个参数为地址  第二参数为我们需要存放的计算机地址【就是你自己的电脑】
		long size = HttpUtil.downloadFile(url, FileUtil.file("F:/"));
		//3.打印一下文件长度
		System.out.println("下载文件的长度"+size);
		

		
	}
	public static void main(String[] args) {
		//1.网络资源的地址
				String url = "https://img-operation.csdnimg.cn/csdn/silkroad/img/1607569674685.png";
				
				//带进度显示的文件下载	
				HttpUtil.downloadFile(url, FileUtil.file("F:/"), new StreamProgress(){
						    
						    public void start() {
						        Console.log("开始下载。。。。");
						    }
						    
						    public void progress(long progressSize) {
						        Console.log("已下载：{}", FileUtil.readableFileSize(progressSize));
						    }
						    
						    public void finish() {
						        Console.log("下载完成！");
						    }
						});
	}

}
