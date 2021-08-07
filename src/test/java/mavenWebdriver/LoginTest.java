package mavenWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
		
		public static WebDriver driver;
		
		@BeforeSuite
		public void setup() {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		
		@Test
		public void doLogin() {
			
			driver.get("http://gmail.com");
			driver.findElement(By.id("identifierId")).sendKeys("vamshi1608@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("vamshi1608");
		}
		
		@AfterSuite
		public void tearDown() {
			
			driver.quit();
		}
	

}
