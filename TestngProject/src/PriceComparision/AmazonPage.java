package PriceComparision;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import PriceComparision.PageNavigation;

public class AmazonPage {

	String driverPath = "E:\\chromedriver.exe";
	WebDriver driver;


	public int Amazon(WebDriver driver) {
		
		PageNavigation page =new PageNavigation(driver);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		//Amazon
		driver.get(page.amazonSite);
		page.A_SearchBox.sendKeys("iPhone XR 64GB yellow");
		
		action.sendKeys(Keys.ENTER).perform();
		
		String AmazonSearchResult = page.A_MatchingResult.getCssValue(driverPath);
		System.out.println("Search Result Matched"+ AmazonSearchResult);
		String AmazonPrice= page.A_MatchingResultPrice.getText();
		System.out.println("iPhone XR 64GB Price in Amazon - "+ AmazonPrice);
		String[] split = AmazonPrice.split(",");
		String PhonePrice = split[0] + "" + split[1];
		int AmazonPhoneCost = Integer.parseInt(PhonePrice);
		System.out.println("Amazon Price for iPhone XR 64GB - "+ AmazonPhoneCost);
		return AmazonPhoneCost;

}
	
}