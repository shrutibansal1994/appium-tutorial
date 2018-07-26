import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browser extends Chromebasemobile {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://m.facebook.com/");
		// driver.findElementByXPath(" //input[@id='m_login_email']").sendKeys("hello");
		// driver.findElementById("m_login_password").sendKeys("OKTESTIT");
		driver.get("https://www.cricbuzz.com/");
		driver.findElementByXPath("//*[@id=\'top\']/div/div[3]/div[2]/a").click();
		driver.findElementByXPath("//*[@id=\'top\']/div/div[16]/table/tbody/tr[1]/td[1]/a").click();
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,480)","");
		driver.findElementByXPath("//*[@id=\'top\']/div/div[10]/h4").click();
	}

}
