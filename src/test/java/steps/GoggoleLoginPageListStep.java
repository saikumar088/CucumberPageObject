package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoggoleLoginPageListStep {
	
	@Given("Browsers is open")
	public void browsers_is_open() {
System.out.println("Inside-Browsers is open ");
	}

	@Given("User is in google search page")
	public void user_is_in_google_search_page() {
		System.out.println("User is in google search pag ");
	}

	@When("use enters the text in search box")
	public void use_enters_the_text_in_search_box(List<String> name) {

		System.out.println("First value " +name.get(0));
		System.out.println("Second value " +name.get(1));
		System.out.println("Third value " +name.get(2));

	}

	@Then("^user is navigates to the search results page$")
	public void user_is_navigates_to_the_search_results_page(DataTable dataTable) {

		 
		 for(Map<Object, Object> data :dataTable.asMaps(String.class,String.class) ) {
			 
				System.out.println("First value " +data.get("username"));
				System.out.println("Second value " +data.get("password"));
			
			 
			 
		 }
	   
		 
		 
		 
	}


}
