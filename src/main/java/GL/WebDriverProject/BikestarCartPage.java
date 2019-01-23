package GL.WebDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BikestarCartPage {
	WebDriver driver;
	
	By checkout= By.cssSelector(".right-button");
	By continueShoping=By.xpath("/html/body/div[3]/section/div/div[1]/div/form/div/div/div/div[1]/a");
	//By continueShoping=By.cssSelector("a.button-2x");
	By emptyCart = By.cssSelector("#empty_cart_button");
	
	public BikestarCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goToCheckout() {
		driver.findElement(checkout).click();
	}
	
	public void continueShoping() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		/*
		WebElement element = driver.findElement(continueShoping);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();*/
		driver.findElement(continueShoping).click();
	}
	
	public void emptyCart() {
		driver.findElement(emptyCart).click();
	}
}
