package utility.ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter(){
        if(extent == null){
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
            Date date = new Date();
            String fileName = sdf.format(date);
            extent = new ExtentReports(workingDir + "//ExtentReports//" + fileName + ".html", true);
        }
        return extent;
    }
}