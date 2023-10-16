import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MMT {

	WebDriver driver;
	@Test
	public void test() throws InterruptedException
	{
		    String configpath ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver",configpath);
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!%27makemytrip&ef_id=69270dbf58d1153cd92a68becf392190:G:s&msclkid=69270dbf58d1153cd92a68becf392190");
			
			driver.findElement(By.id("fromCity")).sendKeys("Bangkok");
			
			Select fr = new Select(driver.findElement(By.xpath("//p[@title=\"BKK, Bangkok Thailand\"]")));
			
			fr.selectByVisibleText("BKK, Bangkok Thailand");
			
			List<WebElement> days = driver.findElements(By.xpath("//div[@class= \"DayPicker-Body\"]/div/div/div"));
			
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
