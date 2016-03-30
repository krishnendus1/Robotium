package com.securifi.almondplus.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class local_connection_test extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.securifi.almondplus.MainActivity";

    private static Class<?> launcherActivityClass;

    static {
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public local_connection_test() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void testRun() {
        //Wait for activity: 'com.securifi.almondplus.MainActivity'
        solo.waitForActivity("MainActivity", 2000);
        //Wait for activity: 'com.securifi.almondplus.cloud.CloudLogin'
        assertTrue("CloudLogin is not found!", solo.waitForActivity("CloudLogin"));
        //sleep 3000
        solo.sleep(3000);
        //Click on local connection
        solo.clickOnText("ADD ALMOND LOCALLY");
        //sleep
        solo.sleep(1000);
        //Click on Empty Text View
        solo.clickOnView(solo.getView("almondIp"));
        //sleep 1000
        solo.sleep(1000);
        //Enter the text: '10.25.25.3'
        solo.clearEditText((android.widget.EditText) solo.getView("almondIp"));
        solo.enterText((android.widget.EditText) solo.getView("almondIp"), "10.25.25.3");
        //Sleep for 747 milliseconds
        solo.sleep(747);
        //Click on Empty Text View
        solo.clickOnView(solo.getView("almondLogin"));
        //Enter the text: 'root'
        solo.clearEditText((android.widget.EditText) solo.getView("almondLogin"));
        solo.enterText((android.widget.EditText) solo.getView("almondLogin"), "root");
        //Click on password
        solo.clickOnView(solo.getView("almondPassword"));
        //Sleep for 1042 milliseconds
        solo.sleep(1042);
        //Enter the text: 'v'
        solo.clearEditText((android.widget.EditText) solo.getView("almondPassword"));
        solo.enterText((android.widget.EditText) solo.getView("almondPassword"), "v");
        //Click on button link almond locally
        solo.clickOnButton("LINK ALMOND LOCALLY");
        //sleep 1000
        solo.sleep(1000);
        //click on view sensor
        solo.clickOnButton("VIEW SENSORS");
        //sleep
        solo.sleep(500);


    }
}