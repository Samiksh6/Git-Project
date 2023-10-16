import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     String configpath ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",configpath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/checkbox");
		
		driver.findElement(By.xpath("//button[@title=\"Toggle\"]")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"rct-checkbox\"])[2]")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"rct-checkbox\"])[3]")).click();
		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.close();
		
	}

}
