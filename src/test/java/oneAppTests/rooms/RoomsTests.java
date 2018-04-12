package oneAppTests.rooms;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.devices.DevicesFragmentPage;
import page.fragment.devices.rooms.AddRoomFragmentPage;
import page.fragment.devices.rooms.RoomsFragmentPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

@Test
public class RoomsTests extends BaseAppiumTest {

    private static final String TEST_NAME = RoomsTests.class.getName();
    private String roomName = "Test Room";

    private static AndroidDriver driver = TestCaseSetup.getDriver();

    private DevicesFragmentPage devicesFragmentPage;
    private PrimaryActivity primaryActivity;
    private AddRoomFragmentPage addRoomFragmentPage;
    private RoomsFragmentPage roomsFragmentPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        devicesFragmentPage = new DevicesFragmentPage(driver);
        addRoomFragmentPage = new AddRoomFragmentPage(driver);
        roomsFragmentPage = new RoomsFragmentPage(driver);
    }

    @Test(priority=1)
    public void addRoomTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Rooms: Add Room");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add Room Test - Start");

        primaryActivity.getDevicesButton();
        devicesFragmentPage.verifyAndClickDeviceDropdownButton();
        devicesFragmentPage.verifyAndClickHomeLocationButton();
        devicesFragmentPage.verifyAndClickMoreOptionsButton();
        devicesFragmentPage.getDevicesFragmentPage();
        devicesFragmentPage.verifyAndClickAddRoomButton();

        addRoomFragmentPage.verifyAndClickRoomNameTextBox();
        addRoomFragmentPage.addRoomName(roomName);
        addRoomFragmentPage.verifyAndClickOutletTile();
        addRoomFragmentPage.verifyAndClickSaveButton();
        roomsFragmentPage.verifyCreatedRoom();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Add Room Test - End");
    }

    @Test(priority=2)
    public void editRoomTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Rooms: Edit Room");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Edit Room Test - Start");

        primaryActivity.getDevicesButton();
        devicesFragmentPage.verifyAndClickMoreOptionsButton();
        devicesFragmentPage.verifyAndClickEditButton();
        roomsFragmentPage.verifyAndClickManageDevicesButtonButton();

        addRoomFragmentPage.verifyAndClickMutliPurposeSensorTile();
        addRoomFragmentPage.verifyAndClickSaveButton();
        roomsFragmentPage.verifyMultiPurposeSensor();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Edit Room Test - End");
    }

    @Test(priority=3)
    public void deleteRoomTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Rooms: Delete Room");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Delete Room Test - Start");

        roomsFragmentPage.verifyAndClickDeleteButton();
        roomsFragmentPage.verifyAndClickConfirmDeleteButtonButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Delete Room Test - End");
    }
}
