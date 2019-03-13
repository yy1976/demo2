package com.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class util {
 public static WebDriver driver;
 public static String url="http://localhost:8080/examsys/login.thtml";
	@BeforeMethod
	public void openfirefox(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
}
	

