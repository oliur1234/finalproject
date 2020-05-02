package runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources",

                  glue = {"stepdef"},
                  
                  tags = {"@test001"},
                  
                  plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/report/report.html"},

                  monochrome = true
		
		)
public class Junit {


}