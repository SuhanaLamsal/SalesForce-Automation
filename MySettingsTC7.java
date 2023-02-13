package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MySettingsTC7 {
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
	
	WebElement userMenuDropdown= driver.findElement(By.id("userNavLabel"));
	userMenuDropdown.click();
	Thread.sleep(2000);
	
	WebElement mySettings= driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[2]"));
	mySettings.click();
	Thread.sleep(3000);
	
	WebElement personalLink= driver.findElement(By.id("PersonalInfo_font"));
	personalLink.click();
	Thread.sleep(2000);
	
	WebElement historyLink= driver.findElement(By.id("LoginHistory_font"));
	historyLink.click();
	Thread.sleep(2000);
	
	WebElement downloadLoginHlink= driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
	downloadLoginHlink.click();
	
	WebElement displayAndLayoutLink= driver.findElement(By.xpath("//*[@id=\"DisplayAndLayout_font\"]"));
	displayAndLayoutLink.click();
	Thread.sleep(2000);
	
	WebElement CustomizeMyTabs= driver.findElement(By.xpath("//*[@id=\"CustomizeTabs_font\"]"));
	CustomizeMyTabs.click();
	Thread.sleep(2000);
	
	WebElement salesForceChatter= driver.findElement(By.xpath("//*[@id=\"p4\"]/option[9]"));
	salesForceChatter.click();
	Thread.sleep(2000);
	
	WebElement report= driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]/option[90]"));
	report.click();
	Thread.sleep(2000);
	
	WebElement addButton= driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img"));
	addButton.click();
	Thread.sleep(2000);

	WebElement saveButton= driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	saveButton.click();
	Thread.sleep(2000);
	
	WebElement emailLink= driver.findElement(By.xpath("//*[@id=\"EmailSetup\"]/a"));
	emailLink.click();
	Thread.sleep(2000);
	
	WebElement myEmailSettings= driver.findElement(By.id("EmailSettings_font"));
	myEmailSettings.click();
	Thread.sleep(2000);
	
	WebElement calendarAndRemainders= driver.findElement(By.id("CalendarAndReminders_font"));
	calendarAndRemainders.click();
	Thread.sleep(2000);
	
	WebElement activityRemainders= driver.findElement(By.id("Reminders_font"));
	activityRemainders.click();
	Thread.sleep(2000);
	
	WebElement remaindersPageLink= driver.findElement(By.id("testbtn"));
	remaindersPageLink.click();
	Thread.sleep(2000);
	
	}
}
