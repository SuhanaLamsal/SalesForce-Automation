package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTestCase37 {

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
		
		WebElement currentDateLink= driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
		currentDateLink.click();
		Thread.sleep(2000);
		
		WebElement fourPMLink= driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a"));
		fourPMLink.click();
		Thread.sleep(2000);
		
		WebElement subComboIcon= driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
		subComboIcon.click();
		Thread.sleep(2000);
		
		WebElement clickOther= driver.findElement(By.id("evt5"));
		clickOther.sendKeys("Other");
		Thread.sleep(6000);

		//WebElement clickEnd= driver.findElement(By.xpath("//*[@id=\"EndDateTime_time\"]"));
		//clickEnd.click();
		//Thread.sleep(4000);
		
		WebElement checkRecurrence= driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[8]/table/tbody/tr[1]/td/div/label"));
		checkRecurrence.click();
		Thread.sleep(4000);
		
		WebElement weeklyRadioButton= driver.findElement(By.xpath("//*[@id=\"recpat\"]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[1]/div/div[2]/label"));
		weeklyRadioButton.click();
		Thread.sleep(4000);
	
		
		WebElement endDate= driver.findElement(By.xpath("//*[@id=\"recpat\"]/table/tbody/tr[3]/td[1]/label"));
		endDate.click();
		Thread.sleep(4000);
		
		WebElement date= driver.findElement(By.xpath("//*[@id=\"calRow5\"]/td[3]"));
		date.click();
		Thread.sleep(4000);
		
		WebElement save= driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		save.click();
		Thread.sleep(2000);
		

		WebElement monthViewIcon= driver.findElement(By.xpath("//*[@id=\"bCalDiv\"]/div/div[2]/span[2]/a[3]/img"));
		monthViewIcon.click();
		Thread.sleep(2000);
	
	}

}
