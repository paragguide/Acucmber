package externalxpath;

public class AmazonXpath 
{
	// login 
	
	public static final String signin = "//*[text() = 'Hello, sign in']";
	public static final String uid1 = "//*[@id=\"ap_email\"]";
	public static final String uid2 = "//*[@id=\"ap_email_login\"]";
	
	public static final String err1 = "//*[@id=\"auth-email-invalid-claim-alert\"]/div/div";
	public static final String err2 = "(//*[@class = 'a-alert-content']) [3]";
	
	
	public static final String ctnbtn1 = "//*[@id=\"continue\"]";
	public static final String ctnbtn2 = "//*[@type = 'submit']";
	
	public static final String pwd = "//*[@id=\"ap_password\"]";
	public static final String pwderr = "//*[text() = 'Your password is incorrect']";
	
	public static final String submit = "//*[@id=\"signInSubmit\"]";
	
	// product search
	public static final String productsearchbox = "//*[@id=\"twotabsearchtextbox\"]";

	public static final String productname = "//*[@class = 'a-size-base-plus a-color-base']";
    public static final String productlink = "//*[@class = 'a-size-base-plus a-color-base a-text-normal']";

    // new user
    public static final String starthere = "//*[text() = 'Start here.']";
    
}
