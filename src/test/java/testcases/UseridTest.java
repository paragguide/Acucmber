package testcases;



import org.junit.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UseridTest extends Hook
{
	public static boolean uidflag = false;
	
	@Given("browser {string} is open with url {string} and reportname {string} with testname {string}")
	public void browser_is_open_with_url_and_reportname_with_testname(String browser, String url, String reportname, String testname) 
	{
	    openBrowser(browser,url,reportname,testname);
	}
	@Given("i click signin")
	public void i_click_signin() 
	{
		 utilities.GenerateReport.test =   utilities.GenerateReport.report.createTest("useridTest");
	    signin.click();
	}
	@When("I enter valid userid {string}")
	public void i_enter_valid_userid(String email) 
	{
		try {
		    uid1.sendKeys(email);	 
		     }
		     catch(Exception e)
		     {
		    uid2.sendKeys(email);	 // correct uid
		     }
	}
	@When("click continue button")
	public void click_continue_button() 
	{
		try
	     {
	    	 ctnbtn1.click();
	     }
	     catch(Exception ee)
	     {
	    	 ctnbtn2.click();
	     }
	}
	@Then("I validate that error message should not come")
	public void i_validate_that_error_message_should_not_come() 
	{
		 try {
			    String error1 =	 err1.getText();
			    if(err1.isDisplayed())
			    {
			utilities.GenerateReport.test.log(Status.INFO, MarkupHelper.createLabel(error1+" displayed", ExtentColor.RED));
			 Assert.fail("Correct uid but showing error");   	    	
			    }
			    else
			    {
			    	uidflag = true;
			 utilities.GenerateReport.test.log(Status.INFO, MarkupHelper.createLabel(" userid is valid ", ExtentColor.GREEN));

			    }
			     }
			     catch(Exception e)
			     {
			    String error1 = err2.getText()	; 
			    if(err2.isDisplayed())
			    {
			utilities.GenerateReport.test.log(Status.INFO, MarkupHelper.createLabel(error1+" displayed", ExtentColor.RED));
			 Assert.fail("Correct uid but showing error");   	    	
			    }
			    else
			    {
			    	uidflag = true;
			 utilities.GenerateReport.test.log(Status.INFO, MarkupHelper.createLabel(" userid is valid ", ExtentColor.GREEN));

			    }
			     }

	}


}
