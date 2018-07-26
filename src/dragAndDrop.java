import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.AndroidKeyCode;
public class dragAndDrop extends base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException { 
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		TouchAction t=new TouchAction(driver);
		ElementOption dragDopOption = ElementOption
				.element(driver.findElementById("io.appium.android.apis:id/drag_dot_1"));
		ElementOption pointto = ElementOption 
				.element(driver.findElementById("io.appium.android.apis:id/drag_dot_3"));
		LongPressOptions timeLongPressOption =LongPressOptions.longPressOptions()
				.withDuration(Duration.ofMillis(4000))
				.withElement(dragDopOption);
		t.longPress(timeLongPressOption).perform().moveTo(dragDopOption) .release().perform();
		//From here these are less use elements
		//getContext use for finding the type of application like native, ionic, hybrid
		driver.getContext();
		//get orientation
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		
		driver .pressKeyCode(AndroidKeyCode.HOME);
		
	}

}
