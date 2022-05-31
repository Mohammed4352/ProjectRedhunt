import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JseTESTING {
  static String app_url ="https://www.flipkart.com/";
	
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

		ChromeDriver web = new ChromeDriver();
		
		web.get(app_url);
		
		web.manage().window().maximize();
		web.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9346887565");
		web.findElement(By.xpath("//input[@type='password']")).sendKeys("New@4352");
		
		web.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(3000);
		WebElement em = web.findElement(By.xpath("//a[normalize-space()='Payments']"));
	JavascriptExecutor js = (JavascriptExecutor)web;
	js.executeScript("arguments[0].scrollIntoView(true)", em);
	js.executeScript("arguments[0].click()",em);
		
	//it is refresh method
//	js.executeScript("history.go(0);");
	
		/*
	String title = web.getTitle();
	System.out.println("page title--->"+title);
	
	String cur_url = web.getPageSource();
	System.out.println("page source--->"+cur_url);
	
	String url = web.getCurrentUrl();
	System.out.println("current url--->"+url);
	
	if(url.contains("google")){
		System.out.println("current url having google");
	}
	else { 
		System.out.println("current url not having google");
	}
	
	*/
	
	//web.close();
	}
	
	}
	
