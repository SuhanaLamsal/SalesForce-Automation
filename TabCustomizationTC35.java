package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabCustomizationTC35 {

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
		
		WebElement allTabs= driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a"));
		allTabs.click();
		Thread.sleep(2000);
		
		WebElement customizeMyTabs= driver.findElement(By.name("customize"));
		customizeMyTabs.click();
		Thread.sleep(2000);
		
		WebElement selectLeadsTab= driver.findElement(By.xpath("//*[@id=\"duel_select_1\"]/option[8]"));
		selectLeadsTab.click();
		Thread.sleep(2000);
		
		WebElement removeLeadsTab= driver.findElement(By.xpath("//*[@id=\"duel_select_0_left\"]/img"));
		removeLeadsTab.click();
		Thread.sleep(2000);
		
		WebElement save= driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		save.click();
		Thread.sleep(2000);
		
		WebElement userMenuDropdown= driver.findElement(By.id("userNavLabel"));
		userMenuDropdown.click();
		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		logout.click();
		Thread.sleep(2000);
		
		WebElement username1= driver.findElement(By.id("username"));
		WebElement password1= driver.findElement(By.id("password"));
		
		username1.sendKeys("suhana7@tekarch.com");
		Thread.sleep(2000);
		password1.sendKeys("United@0304");
		Thread.sleep(2000);

		WebElement loginAccount1= driver.findElement(By.id("Login"));
		loginAccount1.click();
		
		
		

	}

}
