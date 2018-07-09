import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Base {

			
	public static AndroidDriver<AndroidElement> Appon() throws MalformedURLException {
	
	
	
	AndroidDriver<AndroidElement> driver;
	 // Create object of DesiredCapabilities class                             
	 
	DesiredCapabilities capabilities = new DesiredCapabilities();
	 		 
	 // Optional
	
	 
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	 
	 		// Specify the device name (any name)
	 
	capabilities.setCapability("deviceName", "emulator-5554");
	 		 
	// Platform version
	 
	capabilities.setCapability("platformVersion", "6.0");
	 
	 
	// platform name
	 
	capabilities.setCapability("platformName", "Android");
	 		 
	// specify the application package that we copied from appium                
	 
	capabilities.setCapability("appPackage", "com.example.android.apis");
	 
	 		// specify the application activity that we copied from appium                   
	 
	capabilities.setCapability("appActivity", "ApiDemos t59");
	 		 
	 driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 
	 return driver;
}
}