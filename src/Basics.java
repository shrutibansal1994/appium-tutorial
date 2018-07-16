import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Basics extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@index='8']").click();
		driver.findElementByXPath("//android.widget.TextView[@index='2']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath(" (//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		driver.findElementByXPath("//android.widget.Button[@index='1']").click();	
	}

}
