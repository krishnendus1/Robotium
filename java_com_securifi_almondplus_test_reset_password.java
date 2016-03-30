package com.securifi.almondplus.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class reset_password extends ActivityInstrumentationTestCase2 {
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
    public reset_password() throws ClassNotFoundException {
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
        //Click on forgot password
        solo.sleep(3000);
        solo.clickOnText("FORGOT?");
        //Click on Empty Text View
        solo.clickOnView(solo.getView("txtEmailID"));
        //Enter the text: 'krishnendu.s@securifi.com'
        solo.clearEditText((android.widget.EditText) solo.getView("txtEmailID"));
        solo.enterText((android.widget.EditText) solo.getView("txtEmailID"), "krishnendu.s@securifi.com");
        //Click on RESET PASSWORD
        solo.clickOnView(solo.getView("btnResetPwd"));
        //Click on OKAY
        solo.clickOnView(solo.getView("btnResetPwd"));
    }
}



