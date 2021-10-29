package StepDefinitions;

import Pages.testPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testPageStepDef {
	
	testPage test = new testPage();
	@Given("^CPP Test Page is loaded in t(\\d+)$")
	public void cpp_Test_Page_is_loaded_in_t(String arg) throws Throwable {
		test.launch_Testlink();
		test.refresh_testPage();
		test.select_payMethod(arg);
		test.confirmPage();
		throw new PendingException();
	}
	//	test.securePage_3d();
		
	//	test.select_payMethod();
		
	    // Write code here that turns the phrase above into concrete actions
	    

	@When("^Enter Test Page details IBE and REV and CX and HK and en_HK and RR and HKG and HKD and ABCZXY and (\\d+)\\.(\\d+)$")
	public void enter_Test_Page_details_IBE_and_REV_and_CX_and_HK_and_en_HK_and_RR_and_HKG_and_HKD_and_ABCZXY_and(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Select the Payment Method as \"([^\"]*)\"$")
	public void select_the_Payment_Method_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Select The Card Type \"([^\"]*)\"$")
	public void select_The_Card_Type(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Enter The Card number (\\d+) (\\d+) (\\d+) (\\d+) and (\\d+) and (\\d+)$")
	public void enter_The_Card_number_and_and(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Enter The CVV (\\d+)$")
	public void enter_The_CVV(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Proceed Payment with (\\d+)DS validate$")
	public void proceed_Payment_with_DS_validate(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
