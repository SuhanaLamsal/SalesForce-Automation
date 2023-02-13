package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditViewTC12 {

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
		
		WebElement viewName = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
		viewName.click();
		Thread.sleep(2000);
		
		WebElement editLink = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[1]"));
		editLink.click();
		
		WebElement change= driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		change.sendKeys("new view name");
		
		WebElement accountName = driver.findElement(By.xpath("//*[@id=\"fcol1\"]"));
		accountName.click();
		
		WebElement contains = driver.findElement(By.id("fop1"));
		contains.click();
		
		WebElement value = driver.findElement(By.xpath("//*[@id=\"fval1\"]"));
		value.sendKeys("a");
		
		WebElement save = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
	    save.click();

	}

}
