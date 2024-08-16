package core;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hook extends Page
{
	public void openBrowser(String browser,String url,String reportname,String testname) 
	  {		 
		super.openBrowser(browser, url, reportname, testname);
	  }
	
	   // login
	@FindBy(xpath = externalxpath.AmazonXpath.signin)
	public static WebElement signin;
	
	@FindBy(xpath = externalxpath.AmazonXpath.uid1)
	public static WebElement uid1;
	
	@FindBy(xpath = externalxpath.AmazonXpath.uid2)
	public static WebElement uid2;
	
	@FindBy(xpath = externalxpath.AmazonXpath.err1)
	public static WebElement err1;
	
	@FindBy(xpath = externalxpath.AmazonXpath.err2)
	public static WebElement err2;
	
	@FindBy(xpath = externalxpath.AmazonXpath.ctnbtn1)
	public static WebElement ctnbtn1;
	
	@FindBy(xpath = externalxpath.AmazonXpath.ctnbtn2)
	public static WebElement ctnbtn2;
	
	@FindBy(xpath = externalxpath.AmazonXpath.pwd)
	public static WebElement pwd;
	
	@FindBy(xpath = externalxpath.AmazonXpath.pwderr)
	public static WebElement pwderr;
	
	@FindBy(xpath = externalxpath.AmazonXpath.submit)
	public static WebElement submit;
	
	// product search
	@FindBy(xpath = externalxpath.AmazonXpath.productsearchbox)
	public static WebElement productsearchbox;
	
	@FindBy(xpath = externalxpath.AmazonXpath.productname)
	public static List <WebElement> productname;
	
	@FindBy(xpath = externalxpath.AmazonXpath.productlink)
	public static List <WebElement> productlink;
	
	// new user
	@FindBy(xpath = externalxpath.AmazonXpath.starthere)
	public static WebElement starthere;
	

}
