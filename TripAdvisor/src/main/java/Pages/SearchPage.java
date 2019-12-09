package Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest;

public class SearchPage extends BaseTest {
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how=How.XPATH, using="//*[contains(@class,\"brand-global-nav-action-search-Search__searchButton--b9-IK\") ]")public WebElement searchBox;
	 @FindBy(how=How.XPATH, using="//input[@id=\"mainSearch\"]") WebElement searchInput;
	 @FindBy(how=How.XPATH, using="//*[@class=\"first-row\"]//span[@class=\"poi-name primaryText\" and contains(text(), \" Madikeri, Coorg\")]")private List<WebElement> searchClubMahindra;	
	 @FindBy(how=How.XPATH, using="//*[@id=\"component_12\"]/div/div[2]/div/div[2]/div/div[1]/a")WebElement clickWriteReviews;	
	 
	 public void searchClub() {

		 searchBox.click();		 
		 searchInput.sendKeys("club mahindra");
		 searchClubMahindra.get(0).click();
		 		 
	 }
	 
	 public void writeReview() {
		 
		 clickWriteReviews.click();
		 	 
	 }	 	 	 	 	 	 	 	 	 
	
}
