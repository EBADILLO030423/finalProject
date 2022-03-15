package stepsDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import excerciseMap.ExcerciseMap;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ExcercisePage {
	WebDriver driver = SetupClass.driver;
	ExcerciseMap ex;

	@Given("User should be in {string}")
	public void user_should_be_in(String page) {
		driver.get(page);
		ex = new ExcerciseMap(driver);

	}

	@When("User should be able to click a radio button and it should be clicked correctly")
	public void user_should_be_able_to_click_a_radio_button_and_it_should_be_clicked_correctly() {
		ex.radio1.click();
		Assert.assertTrue(ex.radio1.isSelected());
		Assert.assertFalse(ex.radio2.isSelected());
		Assert.assertFalse(ex.radio3.isSelected());

	}

	@When("User should be able to write and select a country")
	public void user_should_be_able_to_write_and_select_a_country() {
		ex.autoCompleteImput.sendKeys("Mexico");
		new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOf(ex.autoCompleteSelection));
		ex.autoCompleteImput.sendKeys(Keys.ARROW_DOWN);
		Assert.assertEquals("Mexico", ex.autoCompleteSelection.getText());
	}

	@When("User dropdown example should be able to see Options")
	public void user_dropdown_example_should_be_able_to_see_options() {
			Assert.assertTrue(ex.dropDown1.isDisplayed());
			Assert.assertTrue(ex.dropDown2.isDisplayed());
			Assert.assertTrue(ex.dropDown3.isDisplayed());
	}

	@When("User dropdown example should be able to select the desired option")
	public void user_dropdown_example_should_be_able_to_select_the_desired_option() {
		ex.dropDown1.click();
		Assert.assertTrue(ex.dropDown1.isSelected());
		
	}

	@When("User select any checkbox it should be correctly checked")
	public void user_select_any_checkbox_it_should_be_correctly_checked() {
		ex.checkBoxOp1.click();
		Assert.assertTrue(ex.checkBoxOp1.isSelected());
		ex.checkBoxOp2.click();
		Assert.assertTrue(ex.checkBoxOp2.isSelected());
		ex.checkBoxOp3.click();
		Assert.assertTrue(ex.checkBoxOp3.isSelected());

	}

	@When("User should be able to click on open window button")
	public void user_should_be_able_to_click_on_open_window_button() {
		String parentHandle = driver.getWindowHandle();
		ex.openWindowButton.click();
		Set<String> otherHandles = driver.getWindowHandles();
		otherHandles.forEach(x -> { if(!x.equals(parentHandle)) driver.switchTo().window(x);});
		Assert.assertEquals(driver.getCurrentUrl(), "http://www.qaclickacademy.com/");
		driver.close();
		driver.switchTo().window(parentHandle);
	}

	@When("User should be able to open a new window and see the correct title")
	public void user_should_be_able_to_open_a_new_window_and_see_the_correct_title() {
		driver.getTitle();
		Assert.assertEquals(driver.getTitle(), "Practice Page");
		System.out.println(driver.getTitle());
	}
	
	@When("User should be able to click on open tab button and should be able to see Rahul Sheety Academy title")
	public void user_should_be_able_to_click_on_open_tab_button() {
		String parentHandle = driver.getWindowHandle();
		ex.openTabButton.click();
		Set<String> otherHandles = driver.getWindowHandles();
		otherHandles.forEach(x -> { if(!x.equals(parentHandle)) driver.switchTo().window(x);});
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.rahulshettyacademy.com/#/index");
		driver.close();
		driver.switchTo().window(parentHandle);
	}
	@When("User should be able to enter name as {string} in Switch to Alert Example and click Allert button")
	public void user_should_be_able_to_enter_name_in_switch_to_alert_example_and_click_allert_button(String name) {
		ex.alertLabel.sendKeys(name);
		ex.alertButton.click();
	}
	@When("User should be able to see pop up message {string}")
	public void user_should_be_able_to_see_pop_up_message(String text) {
		driver.switchTo().alert().getText();
		Assert.assertEquals(text, driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	@When("User should be able to click on confirm button and cancel alert")
	public void user_should_be_able_to_click_on_confirm_button_and_cancel_alert() {
		ex.confirmButton.click();
		driver.switchTo().alert().dismiss();
	}
	@When("User should be able to see {string} in all rows as instructor")
	public void user_should_be_able_to_see_in_all_rows_as_instructure(String instructor) {
		ex.instructors.forEach(ins -> {
			Assert.assertEquals(ins.getText(), instructor);	
		});
	}
	@When("User should be able to see that the amounts are greater than zero on web table fixed header")
	public void user_should_be_able_to_see_that_the_amounts_are_greater_than_zero_on_web_table_fixed_header() {
		ex.tableAmounts.forEach(amount -> {
			Assert.assertTrue(Integer.parseInt(amount.getText())>0);			
		});
	}
	@When("User should be able to verify that the sum is correct")
	public void user_should_be_able_to_verify_that_the_sum_is_correct() {
		int sum=0;
		for(int i = 0; i < ex.tableAmounts.size(); i++){
			sum = sum +Integer.parseInt(ex.tableAmounts.get(i).getText());
		}
		String totalAmountString= ex.totalAmount.getText().split(" ")[3];
		Assert.assertTrue(sum == Integer.parseInt(totalAmountString));
	}
	@When("User should be able to click hide button and validate text box is hidden")
	public void user_should_be_able_to_click_hide_button_and_validate_text_box_is_hidden() {
	    ex.hideButton.click();
	    Assert.assertFalse(ex.displayText.isDisplayed());
	    
	}
	@When("User should be able to click show button and validate text box is displayed")
	public void user_should_be_able_to_click_show_button_and_validate_text_box_is_displayed() {
	  ex.showButton.click();
	  Assert.assertTrue(ex.displayText.isDisplayed());
	}
	@When("User should be able to see options when mouse hover on mouse hover button")
	public void user_should_be_able_to_see_options_when_mouse_hover_on_mouse_hover_button() {
		Actions action = new Actions(driver);
	    action.moveToElement(ex.mouseHover).perform();
	    Assert.assertTrue(ex.mouseHoverTop.isDisplayed());
	    Assert.assertTrue(ex.mouseHoveReload.isDisplayed());
	}
	@When("User should be able to scroll down into iframe example and click Join Now button")
	public void user_should_be_able_to_scroll_down_into_iframe_example_and_click_join_now_button() {
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath("//a[text()='JOIN NOW']")).isDisplayed();
		driver.switchTo().defaultContent();
	}
	


}
