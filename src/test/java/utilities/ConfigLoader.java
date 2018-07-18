package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	private static Properties prop;
static
	{
		String path= "C:\\Users\\ajigu\\eclipse-workspace\\pageObjectModel\\Config.properties";
		try {
			FileInputStream file= new FileInputStream(path);
			prop= new Properties();
			prop.load(file);
			file.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
   public static String getValue( String key) {
	  
	   return prop.getProperty(key);
   }

}
