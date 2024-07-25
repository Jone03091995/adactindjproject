package org.stepdef;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Test_Runner;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def {
	
	 public static  WebDriver driver = Test_Runner.driver;
	
	@Given("User Launch The Adactin Webpage")
	public void user_launch_the_adactin_webpage() {
	   driver.get("https://adactinhotelapp.com");
	}
	@When("User Enters The Username In The Username Field")
	public void user_enters_the_username_in_the_username_field() {
	    driver.findElement(By.id("username")).sendKeys("Admin1122");
	}
	@When("User Enters The Password In The Password Field")
	public void user_enters_the_password_in_the_password_field() {
	  driver.findElement(By.id("password")).sendKeys("Bgopi@2109");
	}
	@Then("User Clicks The Login Button And It Navigates To Search Hotel Page")
	public void user_clicks_the_login_button_and_it_navigates_to_search_hotel_page() {
	    driver.findElement(By.id("login")).click();
	}


	@When("User Select The location In The Search Hotel Field")
	public void user_select_the_location_in_the_search_hotel_field() {
	    WebElement singledrop = driver.findElement(By.xpath("//select[@id='location']"));
	     Select s = new Select(singledrop);
	     s.selectByIndex(5);
		
	}
	
	@When("User Select The Number Of Rooms In The The Search Hotel Field")
	public void user_select_the_number_of_rooms_in_the_the_search_hotel_field() {
		WebElement roomnos = driver.findElement(By.xpath("//select[@id='room_nos']"));
	     Select s = new Select(roomnos);
	     s.selectByIndex(5);	
		
	}
	@When("User Select The Adults Per Room In The The Search Hotel Field")
	public void user_select_the_adults_per_room_in_the_the_search_hotel_field() {
		WebElement singledrop = driver.findElement(By.xpath("//select[@id='adult_room']"));
	     Select s = new Select(singledrop);
	     s.selectByIndex(3);
		
	}
	@When("User Clicks  The Search Button And It Navigates To Select Hotel Page")
	public void user_clicks_the_search_button_and_it_navigates_to_select_hotel_page() {
		driver.findElement(By.id("Submit")).click();
	
	}
	@When("User Select The Hotel In The The Select Hotel Field")
	public void user_select_the_hotel_in_the_the_select_hotel_field() {
		driver.findElement(By.id("radiobutton_3")).click();
		
		
	}
	@When("User Clicks  The Continue Button And It Navigates To  Hotel Book   Page")
	public void user_clicks_the_continue_button_and_it_navigates_to_hotel_book_page() {
		driver.findElement(By.id("continue")).click();
		
		
	}
	@When("User Enters The Name In First Name Field")
	public void user_enters_the_name_in_first_name_field() {
		driver.findElement(By.id("first_name")).sendKeys("jone");
		
		
	}
	@When("User Enters The Last Name In First Name Field")
	public void user_enters_the_last_name_in_first_name_field() {
		driver.findElement(By.id("last_name")).sendKeys("dj");
		
	}
	@When("User Enters The  Address In Billing Address Field")
	public void user_enters_the_address_in_billing_address_field() {
		driver.findElement(By.id("address")).sendKeys("ambattur");
	}
	@When("User Enters The  Credit No In Card No Field")
	public void user_enters_the_credit_no_in_card_no_field() {
		driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		
	
	}
	@When("User Select The  Card Type  In The Credit  Card Type Field")
	public void user_select_the_card_type_in_the_credit_card_type_field() {
		WebElement singledrop = driver.findElement(By.xpath("//select[@id='cc_type']"));
	     Select s = new Select(singledrop);
	     s.selectByIndex(3);
		
		
		
	}
	@When("User Select Month  In The Expiry Date Field")
	public void user_select_month_in_the_expiry_date_field() {
		WebElement singledrop = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	     Select s = new Select(singledrop);
	     s.selectByIndex(9);
		
				
		
	}
	@When("User Select Year  In The Expiry Date Field")
	public void user_select_year_in_the_expiry_date_field() {
		WebElement singledrop = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	     Select s = new Select(singledrop);
	     s.selectByIndex(10);  
	}
	@When("User Enters The  Cvv No In Cvv Number Field")
	public void user_enters_the_cvv_no_in_cvv_number_field() {
		driver.findElement(By.id("cc_cvv")).sendKeys("215");
		
		
	}
	@When("User click The   Book Now Button In Book Now Field")
	public void user_click_the_book_now_button_in_book_now_field() {
		driver.findElement(By.id("book_now")).click();
	}

	
    @Then("User Take Screenshot The Hotel Confirmation Page And Report")
	 public void user_take_screenshot_the_hotel_confirmation_page_and_report() throws IOException {
	       
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\Djeno\\eclipse-workspace\\Cucumberproject\\src\\test\\java\\Adactinscreenshot\\adactin.png");
		    FileHandler.copy(src, des);
	        
		    driver.get(" Keep reports forever: https://reports.cucumber.io/profile  ");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
			TakesScreenshot ts1=(TakesScreenshot) driver;
			File src1 = ts1.getScreenshotAs(OutputType.FILE);
			File des1 = new File("C:\\Users\\Djeno\\eclipse-workspace\\Cucumberproject\\src\\test\\java\\Adactinscreenshot\\adactin.png1");
		    FileHandler.copy(src1, des1);
	    
		    
		    
		    
		    
		    
		    
	    
	    }


	
	
	
	
	}




