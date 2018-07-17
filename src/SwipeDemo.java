import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwipeDemo extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		//use * as a tag name in xpath because  xpath doesn't accept special characters.
		driver.findElementByXPath("//*[@content-desc='9']").click();
		//Tap,Press and release, scroll,Swipe,Drap and drop
		TouchAction t=new TouchAction(driver);
		
		//d2 is for moving the clock
		//tWidgetOption for assigning waiting time;				
		ElementOption WidgetOption = ElementOption
				.element(driver.findElementByXPath("//*[@content-desc='15']"));
		ElementOption d2 = ElementOption 
				.element(driver.findElementByXPath("//*[@content-desc='45']"));
		LongPressOptions timeLongPressOption =LongPressOptions.longPressOptions()
				.withDuration(Duration.ofMillis(2000))
				.withElement(WidgetOption);
		t.longPress(timeLongPressOption).perform().moveTo(d2).release().perform();
		
	}

}
