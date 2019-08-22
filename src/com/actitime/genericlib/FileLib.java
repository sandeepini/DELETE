package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
public String getPropertyData(String key) throws Exception {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String value=p.getProperty(key);
	return value;
}
//public String getExcelData(String sheetName,int row,int cell) throws Exception {
//	FileInputStream fis=new FileInputStream("./data/commondata.properties");
////	workbook w=workbook
////	String value=p.getProperty(key);
//	return value;
//}
}
