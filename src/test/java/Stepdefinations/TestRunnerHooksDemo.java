package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/SearchProduct.feature",
    glue= {"Search"},monochrome=true,
    plugin={"pretty","html:target/HtmlReports"}  )

public class TestRunnerHooksDemo {
	
	
	

}
