package oneAppTests;

import android.test.suitebuilder.annotation.LargeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@LargeTest
public abstract class BaseAppiumTest {

    protected ExtentHtmlReporter uoHtmlReporter = null;
    protected ExtentReports uoExtentReports = null;
    protected ExtentTest uoLog = null;

    protected void startReport() {
        uoHtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/IDEAutomationReport.html");
        uoExtentReports = new ExtentReports();
        uoExtentReports.attachReporter(uoHtmlReporter);
        uoExtentReports.setSystemInfo("Host Name", "Smartthings");
        uoExtentReports.setSystemInfo("Environment", "Automation Testing");
        uoExtentReports.setSystemInfo("User Name", "Saumil Jain");
    }

    protected void teardown() {
        if(uoExtentReports != null)
            uoExtentReports.flush();

    }

    public abstract String getTestName();
}
