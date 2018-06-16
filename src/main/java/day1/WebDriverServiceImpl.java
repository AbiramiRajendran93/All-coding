package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import lib.listeners.WebDriverListener;
import lib.selenium.WebDriverService;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id": return driver.findElement(By.id(locValue));
			case "class": return driver.findElement(By.className(locValue));
			case "link" : return driver.findElement(By.linkText(locValue));
			case "partialLink" : return driver.findElement(By.partialLinkText(locValue));
			case "xpath" : return driver.findElement(By.xpath(locValue));
			case "name" : return driver.findElement(By.name(locValue));

			case "tagname" : return driver.findElement(By.tagName(locValue));

			case "css" : return driver.findElement(By.cssSelector(locValue));
			default:
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element not found with locator "+locator +" and the value is "+locValue);
			throw new RuntimeException("Element not found");
		}
		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
		} catch (InvalidElementStateException e) {
			System.err.println("The ele "+ele+ " is not ready for typing");
		}		
	}

	public void clear(WebElement ele) {
		driver.unregister(this);
		ele.clear();
		driver.register(this);
	}

	public void click(WebElement ele) {
		ele.click();	

	}

	public String getText(WebElement ele) {
		return ele.getText();
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		new Select(ele).selectByVisibleText(value);
	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		new Select(ele).selectByValue(value);

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		new Select(ele).selectByIndex(index);
	}

	public boolean verifyExactTitle(String expectedTitle) {
		if (driver.getTitle().equals(expectedTitle)) {
			System.out.println("Title is matched");
		} else {
			System.out.println("Title does not matched");
		}
		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		if (driver.getTitle().contains(expectedTitle)) {
			System.out.println("Title is matched");
		} else {
			System.out.println("Title does not matched");
		}
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		if (ele.getText().equals(expectedText)) {
			System.out.println("Text match Exactly");
		} else {
			System.out.println("Text does not matched");
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		if (ele.getText().contains(expectedText)) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if (ele.getAttribute(value).equals(attribute)) {
			System.out.println("Attribute value matched");
		} else {
			System.out.println("Attribute value does not matched");
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if (ele.getAttribute(value).contains(attribute)) {
			System.out.println("Attribute value matched");
		} else {
			System.out.println("Attribute value does not matched");
		}

	}

	public void verifySelected(WebElement ele) {
		if(ele.isSelected()) {
			System.out.println("The element "+ele+" is selected");
		} else {
			System.err.println("The element "+ele+" is not selected");
		}

	}

	public void verifyDisplayed(WebElement ele) {
		if(ele.isDisplayed()) {
			System.out.println("The element "+ele+" is Displayed in DOM");
		} else {
			System.err.println("The element "+ele+" is not Displayed in DOM");
		}

	}

	public void switchToWindow(int index) {
		Set<String> all = driver.getWindowHandles();
		List<String> each = new ArrayList<>();
		each.addAll(all);
		driver.switchTo().window(each.get(index));
	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		System.out.println("Switched into frame");

	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
		System.out.println("Alert is accepted");
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
		System.out.println("Alert is dismissed");
	}

	public String getAlertText() {
		String text = driver.switchTo().alert().getText();
		return text;
	}

	public void closeActiveBrowser() {
		driver.quit();
		System.out.println("Browser closed");
	}

	public void closeAllBrowsers() {
		driver.close();
		System.out.println("All the browsers are closed");
	}

}
