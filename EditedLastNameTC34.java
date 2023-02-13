package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditedLastNameTC34 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		Thread.sleep(2000);
		
		WebElement username= driver.findElement(By.id("username"));
		WebElement password= driver.findElement(By.id("password"));
		
		username.sendKeys("suhana7@tekarch.com");
		Thread.sleep(2000);
		password.sendKeys("United@0304");
		Thread.sleep(2000);

		WebElement loginAccount= driver.findElement(By.id("Login"));
		loginAccount.click();
		
		WebElement home= driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		home.click();
		Thread.sleep(2000);
		
		WebElement popUp = driver.findElement(By.id("tryLexDialogX"));
		popUp.click();
		Thread.sleep(4000);
		
		WebElement clickFLName= driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
		clickFLName.click();
		Thread.sleep(2000);
		
		WebElement editProfile= driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		editProfile.click();
		Thread.sleep(5000);
		
		WebElement contact= driver.findElement(By.id("contactInfoContentId"));
		driver.switchTo().frame(contact);
		
		WebElement aboutTab= driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		aboutTab.click();
		Thread.sleep(2000);
		
		WebElement editLastName= driver.findElement(By.id("lastName"));
		editLastName.clear();
		Thread.sleep(2000);
		editLastName.sendKeys("ABCD");
		Thread.sleep(2000);
		
		WebElement saveAll= driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
		saveAll.click();
		Thread.sleep(2000);
	}

}
