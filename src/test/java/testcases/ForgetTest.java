package testcases;

import org.openqa.selenium.By;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgetTest extends Hook
{
	@Given("i open browser {string} and enter url {string} initialize report {string} and testname {string}")
	public void i_open_browser_and_enter_url_initialize_report_and_testname(String browser, String url, String reportname, String testname) 
	{
	    openBrowser(browser,url,reportname,testname);
	}
	@Given("click on sigin link")
	public void click_on_sigin_link() 
	{
	   signin.click();
	}
	@Given("click needhelp link and forget password link")
	public void click_needhelp_link_and_forget_password_link() 
	{
	    driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div[2]/div[1]/form/div/div/div/div[3]/div/a/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"auth-fpp-link-bottom\"]")).click();
	}
	@When("i enter mobile number {string}")
	public void i_enter_mobile_number(String mob) 
	{
	    uid1.sendKeys(mob);
	}
	@When("click on ctnbtn button")
	public void click_on_ctnbtn_button() 
	{
	    ctnbtn1.click();
	}
	@Then("i should get OTP")
	public void i_should_get_otp()
	{
	    
	}




}
