package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUIMouseOver {

	public static void main(String[] args) throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.flipkart.com/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.getKeyboard().sendKeys(Keys.ESCAPE);
		WebElement electronics = driver1.findElementByXPath("//span[text()='Electronics']");
		WebElement apple = driver1.findElementByXPath("//span[text()='Apple']");
		Actions builder = new Actions(driver1);
		builder.moveToElement(electronics).perform();
		Thread.sleep(2000);
		builder.click(apple).perform();
		
		
		
		
		
		
		
	}
	

}
