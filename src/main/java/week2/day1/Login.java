package week2.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("http://leaftaps.com/opentaps/");
		// maximize browser
		driver.manage().window().maximize();
		
		/*Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();*/
		//Enter user name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		// Click Crmsfa link
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		// dropdown
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		//source.sendKeys("Conference");
		Select dd = new Select(source);
		// Select by VisibleText
		//dd.selectByVisibleText("Direct Mail");
		// Select By Value
		//dd.selectByValue("LEAD_PARTNER");
		List<WebElement> options = dd.getOptions();
		int size = options.size();
		System.out.println(size);
		dd.selectByIndex(size-2);
		// Print options
		for (WebElement eachOpt : options) {
			System.out.println(eachOpt.getText());
		}
		
		driver.findElementById("createLeadForm_companyName")
		.sendKeys("Testleaf", Keys.TAB);
		Thread.sleep(5000);
		
		driver.findElementById("createLeadForm_firstName")
		.sendKeys("koushik");
		
		
		// Close
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
















