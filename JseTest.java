import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JseTest {
 WebDriver driver;
	//public static String app = "https://www.flipkart.com/";
 
 public void JseOperation() {
	 
	 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 //driver.manage().window().maximize();
	// driver.get(app);
 }
	
}
