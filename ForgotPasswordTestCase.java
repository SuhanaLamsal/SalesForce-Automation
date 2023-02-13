package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPasswordTestCase {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com");
	Thread.sleep(2000);
	
	WebElement forgotPassword = driver.findElement(By.id("forgot_password_link"));
	forgotPassword.click();
	Thread.sleep(3000);
	
	WebElement username= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/input[1]"));
	Thread.sleep(2000);
	//WebElement password= driver.findElement(By.id("password"));
	
	username.sendKeys("suhana7@tekarch.com");
	Thread.sleep(2000);
	
	WebElement continuebtn= driver.findElement(By.id("continue"));
	continuebtn.click();
	
	driver.close();
   }
}
