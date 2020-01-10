package PriceComparision;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartPage {

	String driverPath = "E:\\chromedriver.exe";
	WebDriver driver;

	public int Flipkart(WebDriver driver) throws InterruptedException{
		
		PageNavigation page =new PageNavigation(driver);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		//Amazon
		driver.get(page.flipkartSite);
		action.sendKeys(Keys.ESCAPE).perform();
		page.F_SearchBox.sendKeys("iPhone XR 64GB yellow");
		
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		String FlipkartPrice= page.F_MatchingResultPrice.getText();
		System.out.println("Flipkart Price for iPhone XR 64GB  - "+ FlipkartPrice);
		String[] split = FlipkartPrice.split(",|\\₹");
		String PhonePrice = split[1] + "" + split[2];
		int FlipkartPhoneCost = Integer.parseInt(PhonePrice);
		System.out.println("Flipkart Price for iPhone XR 64GB - "+ FlipkartPhoneCost);
		return FlipkartPhoneCost;

}

}