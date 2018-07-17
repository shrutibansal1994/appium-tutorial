import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class gesture extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		TouchAction t = new TouchAction(driver);
		// action.tap(Expandable Lists).action
		// action.perform();
		driver.findElementByXPath("//android.widget.TextView[@index='8']").click();

		ElementOption elementOption = ElementOption.element(driver.findElementById("android:id/text1"));
		t.press(elementOption).perform();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		
		//long Press
		//Action Performed Wait
		ElementOption customAdapterItemOption = ElementOption
				.element(driver.findElementByAndroidUIAutomator("text(\"People Names\")"));
		LongPressOptions peopleNameLongPressOption =LongPressOptions.longPressOptions()
				.withDuration(Duration.ofMillis(3000))
				.withElement(customAdapterItemOption);
		t.longPress(peopleNameLongPressOption).perform();
		
		//Run Get text command
		
		System.out.println(driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").getText());
		
	}
}
