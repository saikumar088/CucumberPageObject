package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesWithTags", 
glue= {"Steps"},
//tags = " (@RegTest or @SmokeTest) and not @important"
tags = "@must and @SmokeTest"

		  )

//mvn test -Dcucumber.filter.tags="@smoke and @fast" (To run cucumber from maven
public class Runner_Tag1 {

}
