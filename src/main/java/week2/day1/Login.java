package week2.day1;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.WebDriverListener;

public class Login extends WebDriverListener{

	@Test
	public void main() throws InterruptedException {
		// Launch Chrome
	/*	System.setProperty("webdriver1.chrome.driver", 
				"./drivers/chromedriver1.exe");
		ChromeDriver driver = new ChromeDriver();*/
		// Load URL
		driver1.get("http://leaftaps.com/opentaps/");
		
	//	driver1.findElement(By.id("username1")).sendKeys("Demo");
		// maximize browser
	//	driver1.manage().window().maximize();
		
		
		//Enter user name
	/*	driver1.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password
		driver1.findElementById("password").sendKeys("crmsfa");
		// Click Login
		driver1.findElementByClassName("decorativeSubmit").click();
		// Click Crmsfa link
		driver1.findElementByLinkText("CRM/SFA").click();
		driver1.findElementByLinkText("Create Lead").click();
		// dropdown
		WebElement source = driver1.findElementById("createLeadForm_dataSourceId");
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
		
		driver1.findElementById("createLeadForm_companyName")
		.sendKeys("Testleaf", Keys.TAB);
		Thread.sleep(5000);
		
		driver1.findElementById("createLeadForm_firstName")
		.sendKeys("koushik");
		
		
		// Close
		//driver1.close();
		
	*/	
	}
}




