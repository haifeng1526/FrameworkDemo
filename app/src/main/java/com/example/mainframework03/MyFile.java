/*
 * 文件名：MyFile.java
 * 类型：实体类
 * 功能：定义了MyFile实体�?
 */

package com.example.mainframework03;

public class MyFile {
	public String FileName;		//文件名称属�??
	public int ImgId;			//文件的类型缩略图
	
	//MyFile的构造方�?
	public MyFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	//MyFile带参数的构�?�方�?
	public MyFile(String fileName, int imgId) {
		super();
		FileName = fileName;
		ImgId = imgId;
	}	
}
