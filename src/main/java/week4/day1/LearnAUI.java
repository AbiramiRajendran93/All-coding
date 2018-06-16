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

public class LearnAUI {

	public static void main(String[] args) {	
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://jqueryui.com/droppable/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.switchTo().frame(0);
		WebElement draggable = driver1.findElementById("draggable");
		WebElement droppable = driver1.findElementById("droppable");
		
		Actions builder = new Actions(driver1);
		builder.dragAndDrop(draggable, droppable).perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
