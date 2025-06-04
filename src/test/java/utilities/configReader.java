package utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configReader 
{
	private static Properties properties;
	private final static String propertyFilePath = ".\\config\\config.properties";
	public static void readConfig() throws Throwable {

	    InputStream fis;
	    fis = configReader.class.getClassLoader().getResourceAsStream(propertyFilePath);
	    properties = new Properties();
	    if (fis == null) {
	        throw new FileNotFoundException("Property file '" + propertyFilePath + "' not found in the classpath");
	    }
	    try {
	        properties.load(fis);
	        fis.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	}
	public static String browserType() 
	{
		String browser=properties.getProperty("browser");
		return browser;
	}
	

}
