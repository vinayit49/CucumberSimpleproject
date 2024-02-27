package Stepdefinations;
import org.junit.runner.*;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Vinay.feature",
    glue= {"Stepdefinations"},monochrome=true 
      )

public class Runner {

}
