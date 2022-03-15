@tag 
Feature: Excersice Page 
	navigate throug practice page to verify that its functions are working correctly

@validCredentials 
Scenario: Verify functions of Practice Page 
	Given User should be in "https://rahulshettyacademy.com/AutomationPractice/" 
	When User should be able to click a radio button and it should be clicked correctly 
	When User should be able to write and select a country 
	When User dropdown example should be able to see Options 
	When User dropdown example should be able to select the desired option 
	When User select any checkbox it should be correctly checked 
	When User should be able to click on open window button 
	When User should be able to open a new window and see the correct title 
	When User should be able to click on open tab button and should be able to see Rahul Sheety Academy title
	When User should be able to enter name as "Vero" in Switch to Alert Example and click Allert button 
	When User should be able to see pop up message "Hello Vero, share this practice page and share your knowledge"
	When User should be able to click on confirm button and cancel alert
	When User should be able to see "Rahul Shetty" in all rows as instructor
	When User should be able to see that the amounts are greater than zero on web table fixed header
	When User should be able to verify that the sum is correct	
	When User should be able to click hide button and validate text box is hidden
	When User should be able to click show button and validate text box is displayed
	When User should be able to see options when mouse hover on mouse hover button
	When User should be able to scroll down into iframe example and click Join Now button