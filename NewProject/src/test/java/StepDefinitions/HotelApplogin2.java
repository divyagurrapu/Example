package StepDefinitions;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	 
	public class HotelApplogin2 {
		WebDriver driver;
		@Given("I am on Hotel App Login Page")
		public void i_am_on_hotel_app_login_page() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
				driver= new ChromeDriver();
			   driver.get("https://adactinhotelapp.com/");
		}
	 
		@When("I enter username as {string}")
		public void i_enter_username_as(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			driver.findElement(By.id("username")).sendKeys(string);
		}
	 
		@When("I enter password as {string}")
		public void i_enter_password_as(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			driver.findElement(By.id("password")).sendKeys(string);
		}
	 
		@When("I click Login")
		public void i_click_login() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			driver.findElement(By.id("login")).click();
		}
	 
	@Then("I am Logged in Successfully")
	public void i_am_logged_in_successfully() {
		    //Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			

	}
	 
		@When("I select the location as {string}")
		public void i_select_the_location_as(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			WebElement el=driver.findElement(By.id("location"));
			Select drop=new Select(el);
			drop.selectByVisibleText(string);
		}
	 
		@When("I click Search")
		public void i_click_Search() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			driver.findElement(By.id("Submit")).click();
		}
	 
		/*
		 * @Then("I can go to hotel page") public void i_can_go_to_hotel_page() { //
		 * Write code here that turns the phrase above into concrete actions //throw new
		 * io.cucumber.java.PendingException(); }
		 */
	}



