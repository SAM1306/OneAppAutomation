package oneAppTests.RoomsTests;

import io.appium.java_client.android.AndroidDriver;
import oneAppTests.BaseAppiumTest;
import oneAppTests.TestCaseSetup;
import org.junit.Before;
import org.junit.Test;
import page.activity.PrimaryActivity;
import page.fragment.AddRoomFragmentPage;
import page.fragment.DevicesFragmentPage;
import page.fragment.RoomsFragmentPage;

import static org.junit.Assert.assertTrue;

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

    @Before
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        devicesFragmentPage = new DevicesFragmentPage(driver);
        addRoomFragmentPage = new AddRoomFragmentPage(driver);
        roomsFragmentPage = new RoomsFragmentPage(driver);
    }

    @Test
    public void addRoomTest() throws InterruptedException {
        primaryActivity.devicesButton.isDisplayed();
        primaryActivity.devicesButton.click();
        Thread.sleep(4000L);

        devicesFragmentPage.deviceDropdown.click();
        devicesFragmentPage.homeLocationButton.click();

        devicesFragmentPage.moreOptionsButton.click();
        devicesFragmentPage.getDevicesFragmentPage();
        devicesFragmentPage.addRoomButton.click();

        addRoomFragmentPage.roomNameTextBox.isDisplayed();
        addRoomFragmentPage.roomNameTextBox.sendKeys(roomName);
        driver.hideKeyboard();
        addRoomFragmentPage.outletButton.isDisplayed();
        addRoomFragmentPage.outletButton.click();
        addRoomFragmentPage.saveButton.click();
        assertTrue(roomsFragmentPage.createdRoom.isDisplayed());
    }

    @Test
    public void aeditRoomTest() throws InterruptedException {
        primaryActivity.devicesButton.isDisplayed();
        primaryActivity.devicesButton.click();

        devicesFragmentPage.moreOptionsButton.click();
        devicesFragmentPage.editButton.click();

        roomsFragmentPage.manageDevicesButton.isDisplayed();
        roomsFragmentPage.manageDevicesButton.click();
        addRoomFragmentPage.multiPurposeSensorButton.isDisplayed();
        addRoomFragmentPage.multiPurposeSensorButton.click();
        addRoomFragmentPage.saveButton.click();
        assertTrue(roomsFragmentPage.verifyMultiPurposeSencor.isDisplayed());
    }

    @Test
    public void deleteRoomTest() throws InterruptedException {

        roomsFragmentPage.deleteRoomButton.isDisplayed();
        roomsFragmentPage.deleteRoomButton.click();
        roomsFragmentPage.confirmDeleteButton.click();
    }
}
