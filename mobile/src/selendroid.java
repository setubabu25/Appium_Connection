import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class selendroid extends Base{
	
	public static void main(String[]args) throws MalformedURLException{

	AndroidDriver<AndroidElement> driver=Appon();
		
		 
		 //TouchAction t=new TouchAction(driver);
//		 driver.findElementById("io.selendroid.testapp:id/startUserRegistration").click();
//		 driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("setu");
//		 driver.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys("mmrashid@gmail.com");
//		 driver.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys("14sept");
//		 driver.findElementById("io.selendroid.testapp:id/input_adds").click();
//		 
		 

		 
driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
driver.findElementById("android:id/checkbox").click();
driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
driver.findElementByClassName("android.widget.EditText").sendKeys("babu");
///Elements 
driver.findElementsByClassName("android.widget.Button").get(1).click();

		

	}

}
