package oneAppTests.Locations;

import oneAppTests.BaseAppiumTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.devices.DevicesFragmentPage;
import page.fragment.devices.locations.AddLocationFragmentPage;
import page.view.ToolbarPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class CreateLocationTests extends BaseAppiumTest {

    private static final String TEST_NAME = CreateLocationTests.class.getName();

    private String locationName = "Office";

    private DevicesFragmentPage devicesFragmentPage;
    private PrimaryActivity primaryActivity;
    private AddLocationFragmentPage addLocationFragmentPage;
    private ToolbarPage toolbarPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() throws InterruptedException {
        primaryActivity = new PrimaryActivity(driver);
        devicesFragmentPage = new DevicesFragmentPage(driver);
        addLocationFragmentPage = new AddLocationFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
        createLocation();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        deleteLocation();
    }

    @Test(priority = 1)
    public void verifyLocationGotCreated() {
        devicesFragmentPage.verifyCreatedLocationIsDisplayed();
    }

    public void deleteLocation() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Delete Location Test");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Delete Location Test - Start");

        primaryActivity.getDashboardButton();
        primaryActivity.getDevicesButton();
        devicesFragmentPage.verifyAndClickDeviceDropdownButton();
        devicesFragmentPage.verifyAndClickOfficeLocationButton();
        devicesFragmentPage.verifyAndClickMoreOptionsButton();
        devicesFragmentPage.verifyAndClickEditButton();
        addLocationFragmentPage.verifyAndClickDeleteButton();
        addLocationFragmentPage.verifyAndClickRemoveButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Delete Location Test - End");
    }

    public void createLocation() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Create Location Test");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Create Location Test - Start");

        primaryActivity.getDashboardButton();
        primaryActivity.getDevicesButton();
        devicesFragmentPage.verifyAndClickDeviceDropdownButton();
        devicesFragmentPage.verifyAndClickAddLocationButton();
        addLocationFragmentPage.verifyAndClickLocationNameTextBox();
        addLocationFragmentPage.addLocationName(locationName);
        toolbarPage.verifyAndClickSaveButton();
        devicesFragmentPage.verifyCreatedLocationIsDisplayed();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Create Location Test - End");
    }
}
