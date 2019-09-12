package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import widgets.SearchResults;

public class Page {
// Page object model design pattern -
	protected WebDriver webDriver;

	//locators
	private By account				= By.id("account");
	private By cart					= By.id("header_cart");
	private String menuItem_Format	= ".//li[contains(@class, 'menu-item') and text() = '%s']";
	private By searchField			= By.name("s");

	//constructor
	public Page(WebDriver webDriver){
		this.webDriver = webDriver;
	}

	//Methods
	public CartPage clickCart(){
		webDriver.findElement(cart).click();
		return new CartPage(webDriver);
	}

	public AccountPage clickMyAccount(){
		webDriver.findElement(account).click();
		return new AccountPage(webDriver);
	}

	public Page clickMenuItem(String menuItem){
		findMenuItem(menuItem).click();
		return new Page(webDriver);
	}

	public Page clickMenuItem(String menuItem, String submenuItem){
		Actions actions = new Actions(webDriver);
		actions.moveToElement(findMenuItem(menuItem)).perform();
		return clickMenuItem(submenuItem);
	}

	public SearchResults search(String text){
		WebElement field = webDriver.findElement(searchField);
		field.sendKeys(text);
		field.sendKeys(Keys.ENTER);
		return new SearchResults(webDriver);
	}

	private WebElement findMenuItem(String menuItem){
		String xpath = String.format(menuItem_Format, menuItem);
		return webDriver.findElement(By.xpath(xpath));
	}

	public Page goTo(String postUrl) {
		webDriver.get(postUrl);
		return new Page(webDriver);
	}


}
