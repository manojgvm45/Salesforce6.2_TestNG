package com.framework.selenium.api.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInstance  {

	
	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<WebDriverWait> wait = new  ThreadLocal<WebDriverWait>();

	public void setWait() {
		wait.set(new WebDriverWait(getDriver(), Duration.ofSeconds(30)));
	}

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setDriver(String browser, boolean headless) throws MalformedURLException {		
		switch (browser) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			if(headless) { chromeOptions.addArguments("--headless=new"); }
			chromeOptions.addArguments("--start-maximized"); 
			chromeOptions.addArguments("--disable-notifications"); 
			//chromeOptions.addArguments("--incognito");
			remoteWebdriver.set(new RemoteWebDriver(new URL("http://192.168.1.9:4444/"), chromeOptions));
			break;
		case "firefox":
			FirefoxOptions fireFoxoptions = new FirefoxOptions();
			remoteWebdriver.set(new FirefoxDriver(fireFoxoptions));
			break;
		case "edge":
			EdgeOptions edgeOptions = new EdgeOptions();
			remoteWebdriver.set(new EdgeDriver(edgeOptions));
		default:
			break;
		}
	}
	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}
	
}
