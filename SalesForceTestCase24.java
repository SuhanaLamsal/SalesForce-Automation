package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTestCase24 {

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
		
		WebElement leads= driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		leads.click();
		Thread.sleep(2000);
		
		WebElement popUp = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
		popUp.click();
		Thread.sleep(2000);
		
		WebElement newButton= driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		newButton.click();
		Thread.sleep(2000);
		
		WebElement lastName= driver.findElement(By.id("name_lastlea2"));
		lastName.sendKeys("ABCD");
		Thread.sleep(2000);
		
		WebElement companyName= driver.findElement(By.id("lea3"));
		companyName.sendKeys("ABCD");
		Thread.sleep(2000);
		
		WebElement saveButton= driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		saveButton.click();
		Thread.sleep(2000);

	}

}
