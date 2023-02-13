package SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyProfileTC6 {

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
		
		WebElement myprofile = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
		myprofile.click();
		
		WebElement editProfile= driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		editProfile.click();
		Thread.sleep(2000);
		
		WebElement contact= driver.findElement(By.id("contactInfoContentId"));
		driver.switchTo().frame(contact);
		
		WebElement aboutTab= driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		aboutTab.click();
		Thread.sleep(2000);
		
		WebElement enterLastName = driver.findElement(By.id("lastName"));
		enterLastName.clear();
		enterLastName.sendKeys("Lamsal");
		Thread.sleep(2000);
		
		WebElement saveAll = driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
		saveAll.click();
		
		driver.switchTo().defaultContent();
		
		/*WebElement post= driver.findElement(By.xpath("//*[@id=\"publisherAttachTextPost\"]/span[1]"));
		post.click();
		
		WebElement postFrame= driver.findElement(By.xpath("//*[@id=\"cke_30_contents\"]/iframe"));
		driver.switchTo().frame(postFrame);
		
		WebElement frameBody = driver.findElement(By.xpath("/html/body"));
		frameBody.click();
		frameBody.sendKeys("Hy World");
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(5000);
		
		WebElement shareButton = driver.findElement(By.xpath("//*[@id=\"publishersharebutton\"]"));
		shareButton.click();
		Thread.sleep(3000);*/
		
		WebElement file = driver.findElement(By.xpath("//*[@id=\"publisherAttachContentPost\"]/img"));
		file.click();
		Thread.sleep(2000);
		
		WebElement uploadFile = driver.findElement(By.id("chatterUploadFileAction"));
		uploadFile.click();
		Thread.sleep(2000);
		
		// Select the file path
		WebElement chooseFile = driver.findElement(By.id("chatterFile"));
		chooseFile.sendKeys("C:\\Users\\Ashish\\Desktop");
		Thread.sleep(4000);
		chooseFile.click();
		Thread.sleep(4000);
			
		// Locate the "Open" button on the page
        WebElement openButton = driver.findElement(By.id("openButton"));
        openButton.click();
        Thread.sleep(6000);
        
        WebElement shareButton = driver.findElement(By.id("publishersharebutton"));
        shareButton.click();
		Thread.sleep(10000);
          
        WebElement moderator = driver.findElement(By.id("uploadLink"));
        moderator.click();
		Thread.sleep(2000);
		
		 WebElement clickLinkAndChooseImg = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
		 clickLinkAndChooseImg.sendKeys("C:\\Users\\Ashish\\Desktop");
		 Thread.sleep(4000);
		 clickLinkAndChooseImg.click();
		 Thread.sleep(4000);
		 
		 /*clickLinkAndChooseImg.click();
		 Thread.sleep(2000);
		 
	     WebElement chooseFile = driver.findElement(By.id(""));
	     chooseFile.sendKeys("C:\\Users\\Ashish\\Desktop");
		 Thread.sleep(4000);
		 chooseFile.click();
		 Thread.sleep(4000);*/
		
        
		
		
       
	}
	
}
