package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Hooks", 
glue= {"HooksSteps"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtlmlReports"
		},
//tags = " (@RegTest or @SmokeTest) and not @important"
tags = "not @must"

		  )

//mvn test -Dcucumber.filter.tags="@smoke and @fast" (To run cucumber from maven
public class Runner_Hooks2 {

}
