package Search;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchproductSteps {
	@Before("@Smoke")
	public void setupBrowser(Scenario sc)
	{
		System.out.println("......>The lunch the browser");
		System.out.println(sc.getName());
	}
     @Before("@Regression")
	public void Setup_Url()
	{
		System.out.println("......>The lunch the url");
	}
     @After("@Smoke")
 	public void tearDown_close(Scenario sc)
 	{
 		System.out.println("......>The close the browser");
 		System.out.println(sc.getName());
 	}
      @After("@Regression")
 	public void teardown_logout()
 	{
 		System.out.println("......>The logout the Application");
 	}
     
    
     


}
