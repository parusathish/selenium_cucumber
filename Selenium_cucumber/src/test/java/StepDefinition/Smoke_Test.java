package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoke_Test 
{
	WebDriver driver;
@Given("^Open firefox and start application$")
public void open_Firefox_and_start_application() throws Throwable
{
	 driver=new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com/");
    
}

@When("^I enter valid username \"(.*?)\" and valid password \"(.*?)\"$")
public void i_provide_valid_username_and_valid_password(String uname, String pwd) throws Throwable
{
	driver.findElement(By.name("userName")).sendKeys(uname);
	
	driver.findElement(By.name("password")).sendKeys(pwd);
   
}

@Then("^user should be able to login successfully$")
public void user_should_be_able_to_login() throws Throwable 
{
	driver.findElement(By.name("login")).click();
	
	
}

}
 