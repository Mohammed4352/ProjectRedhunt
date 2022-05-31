import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryThisTest extends TestCase {

public static String app = "https://trytestingthis.netlify.app/";

public void testing() {
	

	openApplication("chrome", app);
	
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Mohammed Basha");
	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Shaik");
	
}

}
