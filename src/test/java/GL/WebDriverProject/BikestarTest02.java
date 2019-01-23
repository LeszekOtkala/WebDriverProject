/*
 * 1. Go to page: www.bikestar.pl
 * 2. Move mouse over menu item "Kaski"
 * 3. Click on item:"Kaski szczękowe i modułowe"
 * 4. Find product: "KASK OZONE FLIP UP czarny" an click on it
 * 5. Select size "XL" (value 226)
 * 6. Click button "Dodaj do koszyka"
 * 7. Check if this product is added to cart
 * 8. Click button "Opróżnij koszyk"
 * 9. Check if cart is empty
 */

package GL.WebDriverProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BikestarTest02 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\DANE\\Sem 4\\zzProjektowanie aplikacji\\eclipse-java-oxygen-2-win32-x86_64\\eclipse\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.bikestar.pl/");
			
			BikestarHomePage bikestarPage = new BikestarHomePage(driver);
			
			bikestarPage.mouseOverKaski();
			bikestarPage.goToKaskiSzczekowe();
			driver.getCurrentUrl();
			Thread.sleep(2000);
			BikestarKaskiSzczekowePage kaskiSzczekowe=new BikestarKaskiSzczekowePage(driver);
			kaskiSzczekowe.goToMyHelmet();
			Thread.sleep(1000);
			driver.getCurrentUrl();
			Thread.sleep(1000);
			BikestarKaskiProductPage myHelmetPage=new BikestarKaskiProductPage(driver);
			myHelmetPage.selectSize("226");
			
			myHelmetPage.addMyHelmetToCart();
			Thread.sleep(1000);
			driver.getCurrentUrl();
			BikestarCartPage cartPage=new BikestarCartPage(driver);
			cartPage.emptyCart();
			
			Thread.sleep(5000);
			
			driver.close();
			
		
		}

	}



