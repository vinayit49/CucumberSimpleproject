package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Background/Baground.feature",
    glue= {"abcd"},monochrome=true,
    plugin={"pretty","html:target/HtmlReports"}  )
public class TestRunnerBagrondDemo {

}
