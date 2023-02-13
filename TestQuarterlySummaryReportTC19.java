package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestQuarterlySummaryReportTC19 {

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
		
		WebElement opportunities= driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		opportunities.click();
		Thread.sleep(2000);
		
		WebElement popUp = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
		popUp.click();
		Thread.sleep(2000);
		
		WebElement quarterlySummaryLink = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/h3"));
		quarterlySummaryLink.click();
		Thread.sleep(2000);
		
		WebElement currentFQInIntervalDropdown = driver.findElement(By.xpath("//*[@id=\"quarter_q\"]/option[1]"));
		currentFQInIntervalDropdown.click();
		Thread.sleep(4000);
	
		WebElement nextFQInIntervalDropdown = driver.findElement(By.xpath("//*[@id=\"quarter_q\"]/option[3]"));
		nextFQInIntervalDropdown.click();
		Thread.sleep(4000);
		
		WebElement openOppInIncludeDropdown = driver.findElement(By.xpath("//*[@id=\"open\"]/option[2]"));
		openOppInIncludeDropdown.click();
		Thread.sleep(4000);
		
		WebElement closedOppInIncludeDropdown = driver.findElement(By.xpath("//*[@id=\"open\"]/option[3]"));
		closedOppInIncludeDropdown.click();
		Thread.sleep(4000);
		
		WebElement runReport = driver.findElement(By.xpath("//*[@id=\"lead_summary\"]/table/tbody/tr[3]/td/input"));
		runReport.click();
		
		//driver.close();
	}

}
