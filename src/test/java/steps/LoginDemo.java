package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginDemo {
	WebDriver driver=null;
	
	@Given("user opens the browser")
	public void user_opens_the_browser() {
		System.out.println("Inside Step- browser is open");
	 // "\\double back slash will work on only on windows and / forward slash will work on all systems
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ssk\\CucumberPrject\\CucumberPageObject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@When("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://ui.freecrm.com/");
	}

	@And("^user enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username,String password) {
 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
 driver.findElement(By.xpath("//div[contains(text(),'Login') and contains(@class,'submit ')]")).click();
	}

	@Then("user should be on home page")
	public void user_should_be_on_home_page() {
		
		String expected= "Cogmento CRM";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
driver.quit();
	}


}
