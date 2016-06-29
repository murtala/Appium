package appium.Samples;

import java.net.URL;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SampleTest {

	static AppiumDriver<WebElement> driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("deviceName", "N1");
		capabilities.setCapability("androidPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", ".HomeScreenActivity");
		capabilities.setCapability("app", "G:\\Users\\Moortala\\EclipseProjects\\appium\\src\\main\\resources\\selendroid-test-app-0.17.0.apk");
		//URL remoteAddress =new URL("http://127.0.0.1:4723/wd/hub");
		URL remoteAddress =new URL("http://127.0.0.1:4444/wd/hub");
		
		//driver = new Android
		driver = new AndroidDriver<WebElement>(remoteAddress, capabilities);
		
	
	//URL url = new URL("https://app.testobject.com:443/api/appium/wd/hub");
       // driver = new AppiumDriver(url, capabilities);        
        
	//	driver = new AndroidDriver<WebElement>("http://192.168.1.100/wd/hub", capabilities);
		//AndroidDriver("http://192.168.1.100/wd/hub");
		//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.id("showToastButton")).click();

	}

}
