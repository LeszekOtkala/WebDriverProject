package GL.WebDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BikestarKaskiSzczekowePage {
	
	WebDriver driver;
	
	By myHelmet = By.cssSelector("div.span2:nth-child(11) > div:nth-child(2) > h3:nth-child(1) > a:nth-child(1)");
	
	public BikestarKaskiSzczekowePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goToMyHelmet() {
		driver.findElement(myHelmet).click();
	}
}	