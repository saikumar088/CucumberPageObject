package HooksSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepdef {
	
	WebDriver driver=null;
	
	@Before(order=1)
	public void setUp() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		System.out.println("Driver is intialized");
		
	}
	
	@Before(order=0)
	public void setUp2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssk\\CucumberPrject\\CucumberPageObject\\chromedriver.exe");
		
		System.out.println("I am inside setUp2......\n");
		
	}
	
	@After(order=1)
	public void tearDown() {
		
		driver.quit();
		
		System.out.println("Driver quits");
		
	}
	
	@After(order=0)
	public void tearDown2() {
	
		System.out.println("I am inside tearDown2......\n");
		
	}
	
	@BeforeStep
	public void beforeSteps() {
		

		System.out.println("I am inside beforeSteps......");
		
	}	
	
	
	@AfterStep
	public void afterSteps() {
		

		System.out.println("I am inside AfterSteps......");
		
	}	
	
	
	@Given("user is on hooks login page")
	public void user_is_on_hooks_login_page() {

	}

	@When("users enters valid username and password")
	public void users_enters_valid_username_and_password() {

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

	}

}
