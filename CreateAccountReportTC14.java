package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountReportTC14 {

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
		
		WebElement accLastActivity = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
		accLastActivity.click();
		
		WebElement dateField = driver.findElement(By.xpath("//*[@id=\"ext-gen152\"]"));
		dateField.click();
		Thread.sleep(4000);
		
		WebElement todaysdateFrom = driver.findElement(By.id("ext-gen276"));
		todaysdateFrom.click();
		Thread.sleep(6000);
	
		WebElement todaysDate = driver.findElement(By.id("ext-gen154"));
		todaysDate.click();
		Thread.sleep(2000);
		
		WebElement todaysDateclick = driver.findElement(By.id("ext-gen292"));
		todaysDateclick.click();
		Thread.sleep(6000);
		
		WebElement saveButton = driver.findElement(By.id("ext-gen49"));
		saveButton.click();
		Thread.sleep(4000);
		
		WebElement reportName = driver.findElement(By.id("saveReportDlg_reportNameField"));
		reportName.sendKeys("Financial");
		Thread.sleep(4000);
		
		WebElement reportUniqueName = driver.findElement(By.id("saveReportDlg_DeveloperName"));
		reportUniqueName.sendKeys("Financial123");
		Thread.sleep(4000);
		
		WebElement saveAndRunReport = driver.findElement(By.id("ext-gen312"));
		saveAndRunReport.click();
		Thread.sleep(4000);
		
	}

}
