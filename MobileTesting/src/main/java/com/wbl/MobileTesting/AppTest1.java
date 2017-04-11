package com.wbl.MobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTest1 {
@Test
//public static void main(String args[]) throws MalformedURLException{
	public void nativeAndroidApp() throws MalformedURLException{
		String apkFilePath = System.getProperty("user.dir")+"/resource/yelp.apk";
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.VERSION, "5.1.1");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "22");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ed08ab78");
		dc.setCapability(MobileCapabilityType.APP, apkFilePath);
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.yelp.android");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.yelp.android.ui.activities.RootActivity");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		driver.unlockDevice();
	}
}
	