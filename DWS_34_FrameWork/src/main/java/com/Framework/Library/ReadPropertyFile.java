package com.Framework.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile  implements FrameworkConstants {
	
	public static String readPropFile(String key) throws IOException {
	
	FileInputStream fis = new FileInputStream(Config_File);
	Properties property = new Properties();
	property.load(fis);
	return property.getProperty(key);
}
}
