package com.ict.tests;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	private WebDriver driver;
	public static Properties properties;
	
	@BeforeTest
	public void onSetup() throws Exception
	{
		properties=new Properties();
		FileInputStream inputstream=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		properties.load(new InputStreamReader(inputstream));
		
		if(properties.getProperty("browser").equals("chrome"))
		{
			setDriver(new ChromeDriver());
		}
		else if(properties.getProperty("browser").equals("ff"))
		{
			setDriver(new FirefoxDriver());
		}
		if(properties.getProperty("browser").equals("chrome"))
		{
			setDriver(new EdgeDriver());
		}
		
		getDriver().get(properties.getProperty("url"));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().window().maximize();
		System.out.println("Successfull");
		
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void setDriver(WebDriver driver)
	{
		this.driver=driver;
	}

}
