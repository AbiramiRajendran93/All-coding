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
import org.openqa.selenium.interactions.Actions;

public class LearnAUISelect {

	public static void main(String[] args) {	
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://jqueryui.com/sortable/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.switchTo().frame(0);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement item1 = driver1.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item4 = driver1.findElementByXPath("//ol[@id='selectable']/li[4]");
		Actions builder = new Actions(driver1);
		builder.clickAndHold(item1).release(item4).perform();
		*/
		
		
		
		
		
		
		
		
		
		
	}
	

}
