package StepsforHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	WebDriver driver=null;
	
	@Before
     public void browserSetup()
     {
    	 System.setProperty("webdriver.gecko.driver","C:/Users/New/eclipse-workspace/Vinay/CucumberSimpleproject/driver/geckodriver.exe");
	     driver = new FirefoxDriver();
	     driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 driver.manage().window().maximize();
     }
     
     
     @Before(order=1)
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		driver.get("https://www.facebook.com");
			
		
	}
     @After(order=2)
	@When("user enter the username and password")
	public void user_enter_the_username_and_password()
	
	{
        driver.findElement(By.name("email")).sendKeys("vinayit49");
		driver.findElement(By.name("pass")).sendKeys("123456");
		
	}
     @Before
	@When("user click on login button")
	public void user_click_on_login_button() {
		
		driver.findElement(By.name("login")).click();
		
	}
     @After
	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		
		System.out.println("user navigated to the home page");
	}
     @After
    public void teardown()
    {
    	driver.close();
    	driver.quit();
    }


}
