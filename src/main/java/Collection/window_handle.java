package Collection;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String configpath ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",configpath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		String currentTab = driver.getWindowHandle();
		
		System.out.println("Title : "+driver.getTitle());
		
		System.out.println(currentTab);
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> tabs = driver.getWindowHandles();
		
		System.out.println(tabs.size());
		
		Iterator<String> itr = tabs.iterator();
		
		String tab = itr.next();
		
		if(currentTab.equals(tab))
		{
			tab = itr.next();
			driver.switchTo().window(tab);
		}
		else
		{
			driver.switchTo().window(tab);
		}
		
		System.out.println("Title : "+driver.getTitle());
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.switchTo().window(currentTab);
		
	}
	
}
