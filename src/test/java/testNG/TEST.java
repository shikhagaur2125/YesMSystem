package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST {
	
	@Test
	public void register() {
		
		
	WebDriverManager.chromedriver().setup();	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,30);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://amazon.com");

	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"))).perform();
	
	driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
	
driver.findElement(By.id("ap_customer_name")).sendKeys("shikha");
driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
driver.findElements(By.id("ap_password")).clear();
driver.findElement(By.id("ap_password")).sendKeys("welcome");
driver.findElement(By.id("ap_password_check")).sendKeys("welcome");

driver.findElement(By.className("a-button-input")).click();

String msg = driver.findElement(By.className("a-alert-content")).getText();
System.out.println(msg);




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}
