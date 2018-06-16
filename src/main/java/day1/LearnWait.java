package week4.day1;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.WebDriverListener;

public class LearnWait
{
	@Test
	public void main() throws InterruptedException {
		// Launch Chrome
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		// Load URL
		driver1.get("http://leaftaps.com/opentaps/");
		// maximize browser
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter user name
		driver1.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password
		driver1.findElementById("password").sendKeys("crmsfa");
		// Click Login
		driver1.findElementByClassName("decorativeSubmit").click();
		// Click Crmsfa link
		driver1.findElementByLinkText("CRM/SFA").click();
		driver1.findElementByLinkText("Leads").click();
		driver1.findElementByLinkText("Find Leads").click();
		driver1.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("b");
		driver1.findElementByXPath("//button[text()='Find Leads']").click();
		//Thread.sleep(3000);
		WebElement leadID = driver1.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		WebDriverWait wait = new WebDriverWait(driver1, 10);
		wait.until(ExpectedConditions.elementToBeClickable(leadID));
		leadID.click();
		
		
		
		
		
		
		
		
		
		
		

	}
}




