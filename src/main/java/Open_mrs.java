import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Open_mrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String configpath ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",configpath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("Admin123");
		
		driver.findElement(By.id("Outpatient Clinic")).click();
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//a[contains(@id,\"register\")]")).click();
		
		driver.findElement(By.name("givenName")).sendKeys("Samiksha");
		
		driver.findElement(By.name("familyName")).sendKeys("Bansod");
		
		driver.findElement(By.id("next-button")).click();
		
		Select gender = new Select(driver.findElement(By.id("gender-field")));
		
		gender.selectByValue("F");
		
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.id("birthdateDay-field")).sendKeys("11");
		
		Select month = new Select(driver.findElement(By.id("birthdateMonth-field")));
		
		month.selectByIndex(11);
		
		driver.findElement(By.id("birthdateYear-field")).sendKeys("1997");
		
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.id("address1")).sendKeys("Hinjewadi phase 3");
		
		driver.findElement(By.id("cityVillage")).sendKeys("Pune");
		
		driver.findElement(By.id("stateProvince")).sendKeys("Maharashtra");
		
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("7559360355");
		
		driver.findElement(By.id("next-button")).click();
		
		Select relation = new Select(driver.findElement(By.id("relationship_type")));
		
		relation.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Person Name\"]")).sendKeys("Samiksha");
		
		driver.findElement(By.id("next-button")).click();
		
		driver.close();
		
		
		
		
		
		
		
	}

}
