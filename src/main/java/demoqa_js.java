import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa_js {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        String configpath ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",configpath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 350)", "");
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, 100)", "");
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, 100)", "");
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, -100)", "");
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, -100)", "");
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		driver.close();;
	}

}
