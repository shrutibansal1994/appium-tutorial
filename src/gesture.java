import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class gesture extends base {

	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();	
		TouchAction t =new TouchAction(driver);
		//action.tap(Expandable Lists).action
		//action.perform();
		driver.findElementByXPath("//android.widget.TextView[@index='8']").click();

		ElementOption elementOption = ElementOption
				.element(driver.findElementById("android:id/text1"));
		t.press(elementOption).perform();
		
	}
	
	/*public void longpress() {
	TouchAction ac = new TouchAction(driver);
	MobileElement ele = (MobileElement) driver.findElementsById("android:id/text1"));
	
	
	}*/
}
