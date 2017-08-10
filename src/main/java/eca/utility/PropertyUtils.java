package eca.utility;

/* * Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * QA Url : http://shredit-qa.ecentricarts.com/en-us/secure-shredding-services/hard-drive-destruction
 * */
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class PropertyUtils {
	public PropertyUtils xpathFile;
	public String workingDir;

	Properties properties;
	 
	public PropertyUtils(String FilePath) {
 
		try {
			FileInputStream Locator = new FileInputStream(FilePath);
			properties = new Properties();
			properties.load(Locator);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	}
	
	public String getProperty(String ElementName) throws Exception {
		// Read value using the logical name as Key
		String data = properties.getProperty(ElementName);
		return data;
	}
 
	
	public void loadProperties(Method m) throws Exception {
		 
		// Get current working directory and load data file
		workingDir = System.getProperty("user.dir");
		xpathFile = new PropertyUtils(workingDir + "\\src\\main\\xpath\\"+m.getName()+"Xpath.properties");
 
		
	}
 

}
