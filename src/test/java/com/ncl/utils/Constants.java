package com.ncl.utils;

public class Constants {

	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe";
    
    public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/geckodriver.exe";
    
    public static final int PAGE_LOAD_TIME=30;
    
    public static final int IMPLICIT_LOAD_TIME=10;

    public static final int EXPLICIT_LOAD_TIME=30;

    public static final String CREDENTIALS_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/configs/configs.properties";

    public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"/target/report/Hrms.html";
    
    public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"/target/screenshots/";
    
    
	
}
