package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountTC10 {

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
		
		WebElement createAccount= driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
		createAccount.click();
		Thread.sleep(2000);
		
		WebElement popUp = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
		popUp.click();
		
		WebElement newButton = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		newButton.click();
		Thread.sleep(2000);
		
		WebElement accountName = driver.findElement(By.xpath("//*[@id=\"acc2\"]"));
		accountName.sendKeys("Prabhu Bank");
		Thread.sleep(2000);
		
		WebElement selectTechnologyPartner= driver.findElement(By.xpath("//*[@id=\"acc6\"]/option[7]"));
		selectTechnologyPartner.click();
		Thread.sleep(2000);
	
		WebElement CustomerPrioritydropdown = driver.findElement(By.xpath("//*[@id=\"00NDn00000Sjosk\"]/option[2]"));
		CustomerPrioritydropdown.click();
		Thread.sleep(2000);
		
		WebElement save = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	    save.click();
	    
	    driver.close();
	}
}
