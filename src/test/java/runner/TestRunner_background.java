package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/BackgroundDemo", 
glue= {"BackgroundSteps"},
monochrome=true,
dryRun=false,
//strict=false,

plugin= {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/cucumber-reports"
		}
//tags = " (@RegTest or @SmokeTest) and not @important"
//tags = "not @must"

		  )

//mvn test -Dcucumber.filter.tags="@smoke and @fast" (To run cucumber from maven
public class TestRunner_background {

}
