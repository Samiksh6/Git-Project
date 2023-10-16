import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class calendar {
    WebDriver driver;
	@Test
	public void test() throws InterruptedException
	{
		    String configpath ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver",configpath);
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/automation-practice-form");
			
			driver.findElement(By.id("dateOfBirthInput")).click();
			
			Thread.sleep(1000);
			
			this.SelectDate("6","March","2000");
			
	}
	 
	public void SelectDate(String day, String month, String year)
	{
		Select mon = new Select(driver.findElement(By.xpath("//*[contains(@class,\"month-select\")]")));
				
		mon.selectByVisibleText(month);	
		
		Select yr = new Select(driver.findElement(By.xpath("//*[contains(@class,\"year-select\")]")));
		
		yr.selectByValue(year);
		
		List<WebElement> days = driver.findElements(By.xpath("//*[contains(@aria-label,\"month\")]/div/div"));
		
		Iterator<WebElement> itr = days.iterator();
		
		while(itr.hasNext())
		{
			WebElement date = itr.next();
					
			if(date.getText().equals(day))
			{
				date.click();
				break;
			}
		}
		
		
		
	}
}
