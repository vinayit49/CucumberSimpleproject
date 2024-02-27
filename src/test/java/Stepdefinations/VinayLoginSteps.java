package Stepdefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VinayLoginSteps {
	
	
	 WebDriver driver=null;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.gecko.driver","C:/Users/New/eclipse-workspace/Vinay/CucumberSimpleproject/driver/geckodriver.exe");
	     driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();	
	}
	@When("^user enter the(.*) and (.*)$")
	public void user_enter_the_username_and_password(String username,String password) throws InterruptedException  {
		
		//System.out.println("driver="+driver);
		driver.findElement(By.name("email")).sendKeys(username);
		
		driver.findElement(By.name("pass")).sendKeys(password);
		//Thread.sleep(2000);;
	}
	   
	@When("user click on login button")
	public void user_click_on_login_button() {
		
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		
		System.out.println("user navigated to the home page");
		
	    



}
}
