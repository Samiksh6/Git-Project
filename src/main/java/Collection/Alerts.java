package Collection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Alerts {

	@Test
	public void test() throws InterruptedException {
		// TODO Auto-generated method stub

        String configpath ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",configpath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 150)", "");
				
		driver.findElement(By.id("alertButton")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmButton")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		driver.findElement(By.id("promtButton")).click();
		
		driver.switchTo().alert().sendKeys("Samiksha");
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		driver.close();

		
	}

}
