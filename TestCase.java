import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase {
	public WebDriver driver;

	public void openApplication(String browser, String appURL) {

		if (browser.equalsIgnoreCase("chrome")) {
			// path of chrome browser driver
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			// open the chrome browser
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Firefox") || browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			//open the FF browser
			 driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
			//open the IE browser
			 driver = new InternetExplorerDriver();
		}

		// hit application url on browser
		driver.get(appURL);
		// maximize browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void getScreenshot(String imgName) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		System.out.println("current time -->"+timeStamp);
		TakesScreenshot cap = (TakesScreenshot)driver;
		File srcScreenshot = (File) cap.getScreenshotAs(OutputType.FILE);
		//File destScreenshot = new File("Screenshots\\test_"+randomValues+".png");
		File destScreenshot = new File("Screenshots\\"+imgName+timeStamp+".png");
		//FileUtils.copyFile(srcScreenshot, new File("Screenshots\\test_"+randomValues+".png"));
		FileUtils.copyFile(srcScreenshot, destScreenshot);
		
	}
	
	public void getScreenshot() throws IOException {
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		System.out.println("current time -->"+timeStamp);
		TakesScreenshot cap = (TakesScreenshot)driver;
		File srcScreenshot = (File) cap.getScreenshotAs(OutputType.FILE);
		//File destScreenshot = new File("Screenshots\\test_"+randomValues+".png");
		File destScreenshot = new File("Screenshots\\"+this.getClass().getName()+timeStamp+".png");
		//FileUtils.copyFile(srcScreenshot, new File("Screenshots\\test_"+randomValues+".png"));
		FileUtils.copyFile(srcScreenshot, destScreenshot);
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
}


