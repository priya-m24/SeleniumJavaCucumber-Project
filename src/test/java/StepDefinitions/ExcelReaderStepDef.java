package StepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import transform.ExcelDataToDataTable;

public class ExcelReaderStepDef {
	
//	@Given("^User is at the login page if the application$")
//	public void user_is_at_the_login_page_if_the_application() throws Throwable {
	
	@Given("^User is at the login page if the application$")
	public void user_is_at_the_login_page_if_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

//	@When("^User login with the following username and password with data in Excel at \"([^\"]*)\"$")
//	//public void user_login_with_the_following_username_and_password_with_data_in_Excel_at(String path) throws Throwable {
	
	@When("^User login with the following username and password with data in Excel at \"([^\"]*)\"$")
	public void user_login_with_the_following_username_and_password_with_data_in_Excel_at(String arg1) throws Throwable {
		
	}
		public void user_login_with_the_following_username_and_password_with_data_in_Excel_at(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
			System.out.println(table.toString());
			
			List<String> dataList = table.asList(String.class);
			
			for(String str : dataList){
				System.out.println(str);
			}
			
		}
	}


