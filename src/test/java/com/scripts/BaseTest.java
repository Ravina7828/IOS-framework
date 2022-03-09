package com.scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	public static DesiredCapabilities dc;
	public static URL url;
	public static IOSDriver<IOSElement> driver;
	
	public static void main(String args[]) throws MalformedURLException {
		dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		dc.setCapability(CapabilityType.PLATFORM_NAME, "iOS");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.2");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 mini");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 500);
		dc.setCapability(MobileCapabilityType.APP, "/Users/apple/eclipse-workspace/ios_insta/src/main/resources/App/IOS/plusforinsta.ipa");
//		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY ,"in.app.myeventgofer.permissions.RunTimePrmsn");
//		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "in.app.myeventgofer");
//		dc.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
		url = new URL("http:0.0.0.0:4723/wd/hub");
		driver = new IOSDriver<IOSElement>(url, dc);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    	driver.quit();
	}

}
