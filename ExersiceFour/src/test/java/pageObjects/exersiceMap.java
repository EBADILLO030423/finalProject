package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class exersiceMap {
	WebDriver driver;

	public exersiceMap(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(xpath = "//li[@id='menu-item-567']//a[@href='https://practice.automationbro.com/shop/']")
		public WebElement shopButton;
		@FindBy(xpath= "//input[@class='search-field']")
		public WebElement searchButton;
		@FindBy(xpath= "//option[contains(text(),'Default sorting')]")
		public WebElement dropDown1;
		@FindBy(xpath= "//option[contains(text(),'Sort by popularity')]")
		public WebElement dropDown2;
		@FindBy(xpath= "//option[contains(text(),'Sort by average rating')]")
		public WebElement dropDown3;
		@FindBy(xpath= "//option[contains(text(),'Sort by latest')]")
		public WebElement dropDown4;
		@FindBy(xpath= "//option[contains(text(),'Sort by price: low to high')]")
		public WebElement dropDown5;
		@FindBy(xpath= "//option[contains(text(),'Sort by price: high to low')]")
		public WebElement dropDown6;
		@FindBy(xpath= "//div[@id='primary']")
		public WebElement primary; 
		@FindBy(xpath= "//span[contains(text(),'1')]")
		public WebElement buttonOne;
		@FindBy(xpath= "//span[contains(text(),'2')]")
		public WebElement buttonTwo;
		@FindBy(xpath= "//a[contains(text(),'→')]")
		public WebElement buttonNext;
		@FindBy(xpath= "//h2[contains(text(),'Product categories')]")
		public WebElement categorias;
		@FindBy(xpath= "//a[contains(text(),'Clothes')]")
		public WebElement clothesButton;
		@FindBy(xpath= "//a[contains(text(),'Shoes')]")
		public WebElement shoesButton;
		@FindBy(xpath= "//a[contains(text(),'Uncategorized')]")
		public WebElement uncategorizedButton;
		@FindBy(xpath= "//a[contains(text(),'Watch')]")
		public WebElement watchButton;
		@FindBy(xpath= "//ul[@class='product_list_widget']")
		public WebElement viewRecently;
		@FindBy(xpath= "//body/div[@id='page']/main[@id='main']/div[@id='content']/div[1]/aside[1]/section[2]/ul[1]/li[1]/a[1]")
		public WebElement viewRecently1;
		@FindBy(css= "body.archive.post-type-archive.post-type-archive-product.wp-custom-logo.theme-zakra.everest-forms-js.woocommerce-shop.woocommerce.woocommerce-page.woocommerce-js.hfeed.tg-site-layout--right.tg-container--wide.has-page-header.has-breadcrumbs.woocommerce-active.elementor-default.elementor-kit-556:nth-child(2) div.site.tg-site:nth-child(9) header.site-header.tg-site-header.tg-site-header--left div.tg-site-header-bottom div.tg-header-container.tg-container.tg-container--flex.tg-container--flex-center.tg-container--flex-space-between div.tg-block.tg-block--two:nth-child(2) nav.main-navigation.tg-primary-menu.tg-primary-menu--style-none div.menu ul.menu-primary.nav-menu li.menu-item.menu-item-type-post_type.menu-item-object-page.menu-item-493:nth-child(5) > a:nth-child(1)")
		public WebElement buttonContact;
		@FindBy(xpath= "//div[@id='primary']")
		public WebElement displayedContactInfo;
		@FindBy(xpath= "//a[@role='button']")
		public WebElement callUsButton;
		@FindBy(xpath= "//i[@class='tg-icon tg-icon-shopping-cart']")
		public WebElement cartButton;
		@FindBy(xpath= "//article[@id='post-7']")
		public WebElement articleShowed;
		@FindBy(xpath= "//button[@name='add-to-cart']")
		public WebElement addToCartBtn;
		@FindBy(xpath= "//table[@cellspacing='0']")
		public WebElement cartShowing;
		@FindBy(xpath= "//input[@id='quantity_6234e2e721b4d']")
		public WebElement deleteOrAdd;
		@FindBy(xpath= "//a[contains(text(),'Proceed to checkout')]")
		public WebElement checkoutButton;
		@FindBy(xpath= "//div[@id='customer_details']")
		public WebElement checkoutBox;
}

	
