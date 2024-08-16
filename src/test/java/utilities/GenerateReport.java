package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateReport 
{
	public static ExtentReports report = null;
	public static ExtentSparkReporter spark = null;
	public static ExtentTest test = null;
	
	public static void makeReport(String reportname,String testname)
	{
		String path = System.getProperty("user.dir")+"//src//test//java//reports//"+reportname+".html";
		report = new ExtentReports();
		spark = new ExtentSparkReporter(path);
		
		report.attachReporter(spark);
		
		spark.config().setDocumentTitle(reportname);
		spark.config().setReportName(reportname);
		spark.config().setTheme(Theme.STANDARD);
		 test = report.createTest(testname);
		 
		
	}
	
	

}
