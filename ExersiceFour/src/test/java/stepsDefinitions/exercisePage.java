package stepsDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.exersiceMap;

public class exercisePage {
	WebDriver driver = setupClass.driver;
	exersiceMap exc;

	@Given("The user is in login page")
	public void the_user_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/feature/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://practice.automationbro.com/");
	}

	@When("User should be able to click on shop button")
	public void user_should_be_able_to_click_on_shop_button() {
		exc.shopButton.click();
	}

	@When("The user should be able to find all products containing the keyword in the product title using search bar")
	public void the_user_should_be_able_to_find_all_products_containing_the_keyword_in_the_product_title_using_search_bar() {
		exc.searchButton.sendKeys("Canon");
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(exc.searchButton));
		exc.searchButton.sendKeys(Keys.ARROW_DOWN);
		Assert.assertEquals("Canon", exc.searchButton.getText());
	}

	@When("The user should be able to sort by popularity, average rating, latest and price")
	public void the_user_should_be_able_to_sort_by_popularity_average_rating_latest_and_price() {
		Assert.assertTrue(exc.dropDown1.isDisplayed());
		Assert.assertTrue(exc.dropDown2.isDisplayed());
		Assert.assertTrue(exc.dropDown3.isDisplayed());
		Assert.assertTrue(exc.dropDown4.isDisplayed());
		Assert.assertTrue(exc.dropDown5.isDisplayed());
		Assert.assertTrue(exc.dropDown6.isDisplayed());
		Assert.assertTrue(exc.dropDown1.isSelected());

	}

	@When("User should be able to see only nine items")
	public void user_should_be_able_to_see_only_nine_items() {
		Assert.assertTrue(exc.primary.isEnabled());
		Assert.assertTrue(exc.buttonOne.isDisplayed());
		Assert.assertTrue(exc.buttonTwo.isDisplayed());
		Assert.assertTrue(exc.buttonNext.isDisplayed());
		Assert.assertTrue(exc.buttonOne.isSelected());
		Assert.assertTrue(exc.buttonTwo.isSelected());
		Assert.assertTrue(exc.buttonNext.isSelected());
	}

	@When("User should be able to find products by categories")
	public void user_should_be_able_to_find_products_by_categories() {
		exc.categorias.isDisplayed();
		exc.clothesButton.click();
		Assert.assertTrue(exc.clothesButton.isSelected());
		exc.shoesButton.click();
		Assert.assertTrue(exc.shoesButton.isSelected());
		exc.uncategorizedButton.click();
		Assert.assertTrue(exc.uncategorizedButton.isSelected());
		exc.watchButton.click();
		Assert.assertTrue(exc.watchButton.isSelected());
	}

	@When("User should be able to see Last item viewed by user should be displayed on “Recently viewed products”")
	public void user_should_be_able_to_see_last_item_viewed_by_user_should_be_displayed_on_recently_viewed_products() {
		exc.viewRecently.isDisplayed();
		exc.viewRecently1.isDisplayed();
		exc.viewRecently1.click();
		Assert.assertTrue(exc.viewRecently1.isSelected());

	}

	@When("User should be able to click on contact button")
	public void user_should_be_able_to_click_on_contact_button() {
		exc.buttonContact.isSelected();
		exc.buttonContact.click();

	}

	@When("User should be able to see address, email, phone and time information of store.")
	public void user_should_be_able_to_see_address_email_phone_and_time_information_of_store() {
		exc.displayedContactInfo.isDisplayed();
		
	}

	@When("User should be able to see the contact information when the mouse stay over button")
	public void user_should_be_able_to_see_the_contact_information_when_the_mouse_stay_over_button() {
		Actions action = new Actions(driver);
	    action.moveToElement(exc.callUsButton).perform();
	    Assert.assertTrue(exc.callUsButton.isDisplayed());
	    Assert.assertTrue(exc.callUsButton.isDisplayed());
	}

	@When("User should be able to verify if all the information is correct before send the credentials")
	public void user_should_be_able_to_verify_if_all_the_information_is_correct_before_send_the_credentials() {
		Assert.assertTrue(exc.cartShowing.isEnabled());
	}

	@When("User should be able to click on cart button")
	public void user_should_be_able_to_click_on_cart_button() {
		exc.cartButton.click();
	}

	@When("User should be able to add products from category sections and search results")
	public void user_should_be_able_to_add_products_from_category_sections_and_search_results() {
		exc.cartShowing.isDisplayed();
		
	}

	@When("User should be able to see the cart icon in the header must reflect all products added by the user")
	public void user_should_be_able_to_see_the_cart_icon_in_the_header_must_reflect_all_products_added_by_the_user() {
		exc.addToCartBtn.isDisplayed();
		Assert.assertTrue(exc.addToCartBtn.isSelected());
	}

	@When("User should have ability to remove item from cart on the header")
	public void user_should_have_ability_to_remove_item_from_cart_on_the_header() {
		exc.deleteOrAdd.isDisplayed();
		exc.deleteOrAdd.click();
		
	}

	@When("User should have ability to checkout")
	public void user_should_have_ability_to_checkout() {
		exc.checkoutButton.click();
		exc.checkoutButton.isSelected();
		exc.checkoutBox.isDisplayed();
	}

}
