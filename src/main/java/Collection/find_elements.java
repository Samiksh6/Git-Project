package Collection;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String configpath ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",configpath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"card-body\"]")).getText());
				
	    List<WebElement> tabs = driver.findElements(By.xpath("//div[@class=\"card-body\"]"));	
				
	    System.out.println(tabs.size());
	    
	    Iterator<WebElement> itr = tabs.iterator();
	    
	    while(itr.hasNext())
	    {
	    	WebElement tab = itr.next();
	    	System.out.println(tab.getText());
	    }

	}

}
