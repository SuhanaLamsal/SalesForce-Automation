package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewOptyTC16 {

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
		
		WebElement newButton = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		newButton.click();
		
		WebElement opportunityName = driver.findElement(By.xpath("//*[@id=\"opp3\"]"));
		opportunityName.sendKeys("Chance");
		
		WebElement accountName = driver.findElement(By.id("opp4"));
		accountName.sendKeys("Prabhu Bank");
		Thread.sleep(2000);
		
		WebElement closeDate = driver.findElement(By.id("opp9"));
		closeDate.click();
		
		WebElement closeDateToday = driver.findElement(By.xpath("//*[@id=\"datePicker\"]/div[2]/div/a"));
		closeDateToday.click();
		Thread.sleep(5000);
		
		WebElement clickOutside= driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[3]/table/tbody/tr[2]/td[3]/label"));
		clickOutside.click();
		Thread.sleep(6000);
		
		WebElement stageDropDown = driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[3]/table/tbody/tr[4]/td[3]/label"));
		stageDropDown.click();
		
		WebElement stage = driver.findElement(By.id("opp11"));
		stage.click();
		Thread.sleep(3000);
		
		WebElement prospecting = driver.findElement(By.xpath("//*[@id=\"opp11\"]/option[2]"));
		prospecting.click();
		Thread.sleep(2000);
		
		WebElement probability = driver.findElement(By.id("opp12"));
		probability.sendKeys("0");
		Thread.sleep(2000);
		
		WebElement leadSource = driver.findElement(By.xpath("//*[@id=\"opp6\"]/option[2]"));
		leadSource.click();
		Thread.sleep(2000);
		
		WebElement primaryCampaignSource = driver.findElement(By.id("opp17"));
		primaryCampaignSource.sendKeys("Add");
		Thread.sleep(2000);
		
		WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		saveButton.click();
		Thread.sleep(2000);
		
		// driver.close();
		
		
		
		
		   
		
		
		
		
	}

}
