package excerciseMap;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcerciseMap {
	WebDriver driver;

	public ExcerciseMap(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='radio1']")
	public WebElement radio1;
	@FindBy(xpath = "//input[@value='radio2']")
	public WebElement radio2;
	@FindBy(xpath = "//input[@value='radio3']")
	public WebElement radio3;
	@FindBy(id = "autocomplete")
	public WebElement autoCompleteImput;
	@FindBy(xpath = "//div[text() ='Mexico']")
	public WebElement autoCompleteSelection;
	@FindBy(xpath = "//select[@id='dropdown-class-example']//option[@value='option1']")
	public WebElement dropDown1;
	@FindBy(xpath = "//select[@id='dropdown-class-example']//option[@value='option2']")
	public WebElement dropDown2;
	@FindBy(xpath = "//select[@id='dropdown-class-example']//option[@value='option3']")
	public WebElement dropDown3;
	@FindBy(xpath = "//input[@id = 'checkBoxOption1']")
	public WebElement checkBoxOp1;
	@FindBy(xpath = "//input[@id = 'checkBoxOption2']")
	public WebElement checkBoxOp2;
	@FindBy(xpath = "//input[@id = 'checkBoxOption3']")
	public WebElement checkBoxOp3;
	@FindBy(xpath = "//button[@id='openwindow']")
	public WebElement openWindowButton;
	@FindBy(id = "opentab")
	public WebElement openTabButton;
	@FindBy(id = "name")
	public WebElement alertLabel;
	@FindBy(id = "confirmbtn")
	public WebElement confirmButton;
	@FindBy(id = "alertbtn")
	public WebElement alertButton;
	@FindBy(xpath = "//table[@id ='product' and @name='courses']//tr/td[1]")
	public List <WebElement> instructors;
	@FindBy(xpath = "//div[@class='tableFixHead']//table//td[4]")
	public List <WebElement> tableAmounts;
	@FindBy(xpath = "//div[@class='totalAmount']")
	public WebElement totalAmount;
	@FindBy(id = "hide-textbox")
	public WebElement hideButton;
	@FindBy(id = "show-textbox")
	public WebElement showButton;
	@FindBy(id = "displayed-text")
	public WebElement displayText;
	@FindBy(id = "mousehover")
	public WebElement mouseHover;
	@FindBy(xpath = "//a[contains(text(),'Top')]")
	public WebElement mouseHoverTop;
	@FindBy(xpath = "//a[contains(text(),'Reload')]")
	public WebElement mouseHoveReload;
	@FindBy(xpath = "//a[text()='JOIN NOW']")
	public WebElement joinNowIframe;
}
