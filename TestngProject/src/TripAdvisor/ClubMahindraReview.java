package TripAdvisor;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TripAdvisor.SiteNavigation;

public class ClubMahindraReview{

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void HotelRating() throws InterruptedException {
		SiteNavigation site =new SiteNavigation(driver);
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		//Amazon
		driver.get(site.TripAdvisorySite);
		site.SearchBox.click();
		Thread.sleep(3000);
		site.HotelSearch.sendKeys("Club Mahindra");
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		site.ClickOnMatchingResult.click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(4000);
		site.Write_A_Review.click();
		Thread.sleep(3000);
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		action.moveToElement(site.clickOnRating).moveByOffset(50, 0).click().build().perform();
		site.ReviewTitle.sendKeys("Super location and View");
		System.out.println(" Super location and View ");
		site.ReviewDescription.sendKeys("Really clean! Stopped here over night on the way to Seattle. The hotel smells fresh and clean. The room was spotless and fresh also. The pool area is hot as a sauna. We are very pleased with our hotel choice and look forward to a nice night. We would stay here again if in the area.Great value We stayed here at the end of our 10-day trip through North Dakota, Wyoming, Montana and South Dakota during 4th of July week. It was one of the most comfortable and least expensive in our journey. It slept our family of four comfortably and the staff was extremely friendly! Would definitely stay again if we came back this way.");
		System.out.println(" Really clean! Stopped here over night on the way to Seattle. The hotel smells fresh and clean. The room was spotless and fresh also. The pool area is hot as a sauna. We are very pleased with our hotel choice and look forward to a nice night. We would stay here again if in the area.Great value We stayed here at the end of our 10-day trip through North Dakota, Wyoming, Montana and South Dakota during 4th of July week. It was one of the most comfortable and least expensive in our journey. It slept our family of four comfortably and the staff was extremely friendly! Would definitely stay again if we came back this way.");
		site.ReviewSort.click();
		site.Date.click();
		site.ShoeShine.click();
		site.RoomClean.click();
		site.modernhotel.click();
		site.roomTheme.click();
		site.weddingDestination.click();
		site.safeStaying.click();
		action.moveToElement(site.serviceRating).moveByOffset(50, 0).click().build().perform();
		site.expensive.click();
		Thread.sleep(3000);
		action.moveToElement(site.cleanliness).moveByOffset(50, 0).click().build().perform();
		site.roomTip.sendKeys("Rooms on the south side are quieter");
		System.out.println(" Rooms on the south side are quieter ");
		Thread.sleep(3000);
		action.moveToElement(site.RoomValue).moveByOffset(50, 0).click().build().perform();
		Thread.sleep(3000);
		site.terms.click();
		driver.quit();
	}

}
