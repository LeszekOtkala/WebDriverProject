package GL.WebDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BikestarHomePage {
	
	WebDriver driver;
	
	By kaski=By.cssSelector(".nav-10 > a:nth-child(1) > span:nth-child(1)");
	By kaskiIntegralne= By.cssSelector(".nav-10-1 > a:nth-child(1)");
	By kaskiSzczekowe = By.cssSelector(".nav-10-2 > a:nth-child(1)");
	//...
	
	By odziez = By.cssSelector(".nav-11");
	By kurtkiTekstylne = By.cssSelector(".nav-11-1-1");
	By kurtkiSkorzane = By.cssSelector(".nav-11-1-2");
	
	//By name0 = By.name("name");
	//By name1 = By.id("ID");
	//By name2 = By.className("className");
	//By name3=By.cssSelector("cssSelector");
	//By name4= By.xpath("xpath");
	
	public BikestarHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void mouseOverKaski() {
		Actions builder=new Actions(driver);
		WebElement WEkaski=driver.findElement(kaski);
		Actions actionMouseOverKaski=builder.moveToElement(WEkaski);
		actionMouseOverKaski.perform();
	}
	
	public void mouseOverOdziez() {
		Actions builder=new Actions(driver);
		WebElement WEodziez=driver.findElement(odziez);
		Actions actionMouseOverKaski=builder.moveToElement(WEodziez);
		actionMouseOverKaski.perform();
	}
	
	
	public void goToKaskiSzczekowe() {
		driver.findElement(kaskiSzczekowe).click();
	}
	
	public void goToKaskiIntegralne() {
		driver.findElement(kaskiIntegralne).click();
	}
	
	//...
	
	
	public void goToKurtkiTekstylne() {
		driver.findElement(kurtkiTekstylne).click();
	}
	
	public void goToKurtkiSkorzane() {
		driver.findElement(kurtkiSkorzane).click();
	}
	
}

