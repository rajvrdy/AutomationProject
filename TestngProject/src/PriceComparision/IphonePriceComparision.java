package PriceComparision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PriceComparision.AmazonPage;;

public class IphonePriceComparision {

	public WebDriver driver;
	AmazonPage amazonpage = new AmazonPage();
	FlipkartPage flipkartpage =new FlipkartPage();
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void comparePrice() throws InterruptedException {
		
		int amazonPrice = amazonpage.Amazon(driver);
		int flipkartPrice = flipkartpage.Flipkart(driver);

		if(flipkartPrice < amazonPrice){
			System.out.println(" The Price of iPhone XR 64GB is less than Flipkart Price when compared to Amazon price");
		}else{
			System.out.println("iPhone XR 64GB Price is less in Amazon when compared to Flipkart price");
		}
		driver.quit();
	}
}


