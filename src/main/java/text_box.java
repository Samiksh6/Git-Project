import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String configpath ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",configpath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.id("userName")).sendKeys("Samiksha Bansod");
		
		driver.findElement(By.id("userEmail")).sendKeys("samikshbansod6@gmail.com");
		
		driver.findElement(By.id("currentAddress")).sendKeys("Hinjewadi phase 3");
		
		driver.findElement(By.id("permanentAddress")).sendKeys("Hinjewadi phase 3");
				
		driver.findElement(By.id("submit")).click();
		
	}

}
