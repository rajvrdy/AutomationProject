package TripAdvisor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SiteNavigation {

	WebDriver driver;

	SiteNavigation(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(d, this);
	}
	ClubMahindraReview Review=new ClubMahindraReview();

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void comparePrice() throws InterruptedException {
	}
	String TripAdvisorySite = "https://www.tripadvisor.in/";
	
	//TripAdvisory Xpaths
	@FindBy(className = "brand-global-nav-action-search-Search__label--3PRUD")
	WebElement SearchBox;
	
	@FindBy(id = "mainSearch")
	WebElement HotelSearch;
	
	@FindBy(xpath = "//*[@id='BODY_BLOCK_JQUERY_REFLOW']/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]/span")
	WebElement ClickOnMatchingResult;
	
	@FindBy(xpath = "//*[text()='Write a review']")
	WebElement Write_A_Review;

	@FindBy(id = "bubble_rating")
	WebElement clickOnRating;
	
	@FindBy(id = "ReviewTitle")
	WebElement ReviewTitle;
	
	@FindBy(id = "ReviewText")
	WebElement ReviewDescription;
	
	@FindBy(xpath = "//*[@id='trip_type_table']/div[1]")
	WebElement ReviewSort;

	@FindBy(xpath = "//*[@id='trip_date_month_year']/option[2]")
	WebElement Date;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[3]/div[1]/div[1]")
	WebElement ShoeShine;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[4]/div[1]/div[1]")
	WebElement RoomClean;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[5]/div[1]/div[1]")
	WebElement modernhotel;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[6]/div[1]/div[1]")
	WebElement roomTheme;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[7]/div[1]/div[1]")
	WebElement weddingDestination;
	
	@FindBy(xpath = "//*[@id='DQ_TAGYESNO']/div[8]/div[1]/div[1]")
	WebElement safeStaying;
	
	@FindBy(xpath =  "//*[text()='Hotel Ratings']/following-sibling::div[1]/child::div[1]/child::div[2]/child::div/span")
	WebElement serviceRating;
	
	@FindBy(xpath = "//*[text()='Hotel Ratings']/following-sibling::div[1]/child::div[2]/child::div[2]/child::div/span")
	WebElement cleanliness;
	
	@FindBy(xpath = "//*[text()='Hotel Ratings']/following-sibling::div[1]/child::div[3]/child::div[2]/child::div/span")
	WebElement RoomValue;
	
	@FindBy(xpath = "//*[@id='DQ_TAGRADIO']/div[2]/div[1]")
	WebElement expensive;
	
	@FindBy(id = "ROOM_TIP")
	WebElement roomTip;
	
	@FindBy(id = "noFraud")
	WebElement terms;

}
