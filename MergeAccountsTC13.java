package SalesForceAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeAccountsTC13 {

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
		
		WebElement mergeAccount = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
		mergeAccount.click();
		Thread.sleep(2000);
		
		WebElement accName= driver.findElement(By.id("srch"));
		accName.sendKeys("atr");
		
		WebElement findAcc= driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]"));
		findAcc.click();
		Thread.sleep(2000);
		
		WebElement clickButton= driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[1]"));
		clickButton.click();
		Thread.sleep(2000);
		
		WebElement clickButton1= driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[2]"));
		clickButton1.click();
		Thread.sleep(2000);
		
		WebElement nextButton= driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]"));
		nextButton.click();
		Thread.sleep(2000);
		
		WebElement mergeButton= driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[2]"));
		mergeButton.click();
		Thread.sleep(2000);
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		//driver.close();
		
	}
}
