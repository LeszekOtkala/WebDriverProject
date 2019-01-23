package GL.WebDriverProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BikestarKaskiProductPage {


	
	WebDriver driver;
	public BikestarKaskiProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By selectSize= By.xpath("//*[@id=\"attribute134\"]");
	By addToCart = By.className("add-to-cart");
	
	
	public void addMyHelmetToCart() {
		driver.findElement(addToCart).click();
	}
	public void selectSize(String size) {
		Select drpSize=new Select(driver.findElement(selectSize));
		drpSize.selectByValue(size);
		
	}	
	
}	