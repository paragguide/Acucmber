package testcases;



import org.junit.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PasswordTest 
{
	public boolean x = false;
	public static boolean login = false;
	
	@Given("userid is valid")
	public void userid_is_valid() 
	{
	    if(UseridTest.uidflag == true)
	    {
	    	x = true;
	    }
	    else
	    {
	    	x = false;
	    	utilities.GenerateReport.test.log(Status.FAIL, MarkupHelper.createLabel(" Userid is invalid", ExtentColor.RED));
	    }
	}
	@When("valid password {string} is entered")
	public void valid_password_is_entered(String password) 
	{
		 utilities.GenerateReport.test =   utilities.GenerateReport.report.createTest("passwordTest");
		 try {
			  Hook.pwd.sendKeys("RMinfotech12#&&");
			  Hook.submit.click();
				 }
		 catch(Exception p)
		 {
			 p.printStackTrace();
		 }
	}
	@Then("i should login")
	public void i_should_login() 
	{
		 try {
				String passwderr =   Hook.pwderr.getText();
				 if(Hook.pwderr.isDisplayed())
				    {
				utilities.GenerateReport.test.log(Status.FAIL, MarkupHelper.createLabel(passwderr+" displayed", ExtentColor.RED));
				 Assert.fail("Correct pwd but showing error");   	    	
				    }
				
			     }
			  catch(Exception e)
			  {
				  // pass - loged in no error message..
		utilities.GenerateReport.test.log(Status.INFO, MarkupHelper.createLabel(" Logged in ", ExtentColor.GREEN));
				login =true;	
			  }
	}


}
