package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DefaultViewTestCase22 {

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
		
		WebElement todaysLeads= driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[4]"));
		todaysLeads.click();
		Thread.sleep(2000);
		
		/*WebElement unreadLeads= driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[2]"));
		unreadLeads.click();
		Thread.sleep(2000);
		
		WebElement unreadLeadsGo= driver.findElement(By.name("go"));
		unreadLeadsGo.click();
		Thread.sleep(5000);*/
		
		WebElement userMenuDropdown= driver.findElement(By.id("userNavLabel"));
		userMenuDropdown.click();
		Thread.sleep(2000);
		
		WebElement logOut = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		logOut.click();
		Thread.sleep(5000);

		WebElement username1= driver.findElement(By.id("username"));
		WebElement password1= driver.findElement(By.id("password"));
		
		username1.sendKeys("suhana7@tekarch.com");
		Thread.sleep(2000);
		password1.sendKeys("United@0304");
		Thread.sleep(2000);
		
		WebElement loginAccount1= driver.findElement(By.id("Login"));
		loginAccount1.click();
		
		WebElement leadstab= driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		leadstab.click();
		Thread.sleep(2000);
		
		WebElement go= driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[1]/input"));
		go.click();
		Thread.sleep(2000);
		
	}

}
