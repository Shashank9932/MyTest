package autoapp.automation.utility;

import java.io.IOException;

import enums.DriverType;
import enums.EnvironmentType;
import java.util.Properties;

public class configFileReader {

	private Properties config;

	public void loadData() throws IOException {
		config = new Properties();
		config.load(this.getClass().getResourceAsStream("/src/test/resources/config.properties"));
	}
//
//	public String getProperty(String key) {
//		String value = null;
//		try {
//			if (config == null) {
//				loadData();
//			}
//			value = config.getProperty(key);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return value;
//	}
	
	 public String getDriverPath(){
		 String driverPath = config.getProperty("driverPath");
		 if(driverPath!= null) return driverPath;
		 else throw new RuntimeException("Driver Path not specified in the Configuration.properties file for the Key:driverPath"); 
		 }
		 

	public DriverType getBrowser() {
		String browserName = config.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equals("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else
			throw new RuntimeException(
					"Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}

	public String getApplicationUrl() {
		String url = config.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
	}

	public EnvironmentType getEnvironment() {
		String environmentName = config.getProperty("environment");
		if (environmentName == null || environmentName.equalsIgnoreCase("local"))
			return EnvironmentType.LOCAL;
		else if (environmentName.equals("remote"))
			return EnvironmentType.REMOTE;
		else
			throw new RuntimeException(
					"Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}
}
