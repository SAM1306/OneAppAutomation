package utility;

import io.appium.java_client.AppiumDriver;

import org.apache.commons.io.FileUtils;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ScreenShotUtility extends RunListener {
    @Override
    public void testFailure(Failure failure) throws Exception {
        onTestFailure(failure.getDescription().getTestClass());
    }

    public void onTestFailure(Class<?> testClass) {
        try {
            Field field = testClass.getDeclaredField("driver");
            field.setAccessible(true);
            AppiumDriver<?> driver = (AppiumDriver<?>) field.get(testClass);
            SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
            Date date = new Date();
            String fileName = sdf.format(date);
            File des = driver.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(des, new File(System.getProperty("user.dir") + "//ScreenShot//" + fileName + ".png"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String composeTestName(ITestResult iTestResult) {
        StringBuffer completeFileName = new StringBuffer();
        completeFileName.append(iTestResult.getTestClass().getRealClass().getSimpleName()); // simplified class name
        completeFileName.append("_");
        completeFileName.append(iTestResult.getName()); // method name
        // all the parameters information
        Object[] parameters = iTestResult.getParameters();
        for(Object parameter : parameters) {
            completeFileName.append("_");
            completeFileName.append(parameter);
        }
        return completeFileName.toString().replace(":", "-");
    }
}