package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utils.Driver;

public class TestBase {
    static WebDriver driver;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    @Parameters("DriverName")
    @BeforeTest(alwaysRun = true)
    public void setUpDriver(String DriverName){
        driver= Driver.getDriver(DriverName);
        driver.manage().window().maximize();
        htmlReporter=new ExtentHtmlReporter((System.getProperty("user.dir")+"/test-output/myReport.html"));
        htmlReporter.config().setDocumentTitle("AWS Automation");
        htmlReporter.config().setReportName("Server Setup");
        htmlReporter.config().setTheme(Theme.DARK);

        extentReports=new ExtentReports();
        extentReports.attachReporter(htmlReporter);
        extentReports.setSystemInfo("OS", "MAC OS");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Environment", "Test Environment");

    }

    public static double gettingPrices(WebElement element){
        String price=element.getText().substring(2);
        double d=Double.parseDouble(price);
        return d;
    }

    @AfterTest
    public void tearDown(){
        if (driver!=null){
            extentReports.flush();
            //driver.quit();
        }
    }
}
