package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step- browser is open");
	 // "\\double back slash will work on only on windows and / forward slash will work on all systems
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ssk\\CucumberPrject\\CucumberPageObject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step- user is on google search page");
		driver.get("https://www.google.com/");
		

	}

	@When("use enters text in search box")
	public void use_enters_text_in_search_box() {
		System.out.println("Inside Step- use enters text in search box");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("SAIKUMAR");

	}

	@And("hit enter")
	public void hit_enter() {
		System.out.println("Inside Step- hits enter");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigates to search results page")
	public void user_is_navigates_to_search_results_page() {
		System.out.println("user is navigates to search results page");
		
		String expectedTitile= "SAIKUMAR - Google Search";
		String actualTitile=	driver.getTitle();
		
		System.out.println("Title:"+actualTitile);
		
		Assert.assertEquals(expectedTitile, actualTitile);
		driver.quit();

	}


}
