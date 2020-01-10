package PriceComparision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageNavigation {

	WebDriver driver;

	PageNavigation(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(d, this);
	}

	String amazonSite = "https://www.amazon.in/";
	String flipkartSite = "https://www.flipkart.com/";
	
	//Amazon Xpaths
	@FindBy(id = "twotabsearchtextbox")
	WebElement A_SearchBox;
	
	@FindBy(xpath = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	WebElement A_MatchingResult;
	
	@FindBy(className="a-price-whole")
	WebElement A_MatchingResultPrice;

	//Flipkart Xpaths
	@FindBy(className = "LM6RPg")
	WebElement F_SearchBox;
	
	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div/div/div")
	WebElement F_MatchingResultPrice;
}
