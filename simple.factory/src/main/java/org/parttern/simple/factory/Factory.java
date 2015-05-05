package org.parttern.simple.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
	
	public static API createAPI() {
		API api = null;
		
		Properties properties = new Properties();
		
		InputStream in = null;
		try {
			in = Factory.class.getResourceAsStream("/factory.properties");
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			api = (API)Class.forName(properties.getProperty("impl.class")).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return api;
	}

}
