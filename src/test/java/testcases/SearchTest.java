package testcases;

import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchTest 
{
	public boolean x = false;
	@Given("i am logged in")
	public void i_am_logged_in() 
	{
	    if(PasswordTest.login == true)
	    {
	    	x = true;
	    }
	    else
	    {
	    	x = false;
	    }
	}
	@When("^i search for (.*) in price range (.*)")
	public void i_search_for_in_price_range(String productN,int price) 
	{
		utilities.GenerateReport.test =   utilities.GenerateReport.report.createTest("productsearch");
		  
		  Hook.productsearchbox.clear();
		  Hook.productsearchbox.sendKeys(productN+" in range "+price);
		  
		  utilities.GenerateReport.test.log(Status.INFO, MarkupHelper.createLabel(" Searching for "+productN, ExtentColor.BLUE));

		  
		  Actions a = new Actions(Hook.driver);
		  a.sendKeys(Keys.ENTER).perform();
			
	}
	@Then("search results must come")
	public void search_results_must_come() 
	{
		Iterator <WebElement> it1 =   Hook.productname.iterator();
		Iterator <WebElement> it2 =   Hook.productlink.iterator();
		
		while(it1.hasNext() && it2.hasNext())
		{
		WebElement podname = 	it1.next();
		WebElement podlink = it2.next();
		
		//System.out.println("");
		utilities.GenerateReport.test.log(Status.PASS, MarkupHelper.createLabel(" Product Results "+podname.getText(), ExtentColor.GREEN));
		}
		
		
	}
	
	@Given("test is executed")
	public void test_is_executed() 
	{
	    
	}
	@Then("close Browser")
	public void close_browser() 
	{
		Hook.closeBrowser();
	}
}
