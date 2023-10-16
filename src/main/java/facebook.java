import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String configpath ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",configpath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("samikshbansod6@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("sam@1111");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.close();
		
	}

}
