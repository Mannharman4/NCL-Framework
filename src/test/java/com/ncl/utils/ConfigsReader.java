package com.ncl.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	private static Properties pro;

	public static Properties readProperties(String filePath) {

		try {
			FileInputStream file = new FileInputStream(filePath);
			pro = new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return pro;

	}

	public static String getProperty(String key) {
		return pro.getProperty(key);

	}

}
