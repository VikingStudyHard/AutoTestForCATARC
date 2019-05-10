package cn.edu.tju.scs.seql.ELV.common;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;

/**
 * 使用单例模式实现读取系统配置的类
 *
 */
public class ReadProperties {
	
	private static Properties prop = null;
	
	public static Properties getSystemProperties(){
		if(prop == null){
			ReadProperties p = new ReadProperties();
			prop = p.readProperties("configuration.properties");
		}
		return prop;
	}
	
	/**
	 * 测试读取的配置信息是否正确
	 */
	public static void main(String[] args) {
		ReadProperties.getSystemProperties();
		Iterator<String> it = prop.stringPropertyNames().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + prop.getProperty(key));
		}
	}


	private Properties readProperties(String propertyFilePath) {
		Properties prop = new Properties();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(propertyFilePath));
			prop.load(in);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;

	}

}
