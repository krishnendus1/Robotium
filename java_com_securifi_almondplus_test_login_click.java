package com.securifi.almondplus.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class login_click extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.securifi.almondplus.MainActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public login_click() throws ClassNotFoundException {
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
        //Set default small timeout to 17751 milliseconds
		Timeout.setSmallTimeout(17751);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("email"));
        //Enter the text: 'krishnendu.s@securifi.com'
		solo.clearEditText((android.widget.EditText) solo.getView("email"));
		solo.enterText((android.widget.EditText) solo.getView("email"), "krishnendu.s@securifi.com");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("password"));
        //Enter the text: '000000'
		solo.clearEditText((android.widget.EditText) solo.getView("password"));
		solo.enterText((android.widget.EditText) solo.getView("password"), "000000");
        //Click on LOGIN
		solo.clickOnView(solo.getView("btn_login"));
        //Wait for activity: 'com.securifi.almondplus.AlmondPlusActivity'
		assertTrue("AlmondPlusActivity is not found!", solo.waitForActivity("AlmondPlusActivity"));
        //Click on 90
		solo.clickOnView(solo.getView("leftwrapper", 1));
        //Click on LinearLayout
		solo.clickOnView(solo.getView("settingsLayout", 1));
        //Click on Peanut Plug #14
		solo.clickOnView(solo.getView("value", 3));
        //Click on Peanut Plug #14
		solo.clickOnView(solo.getView("text"));
        //Enter the text: 'Test Krish'
		solo.clearEditText((android.widget.EditText) solo.getView("text"));
		solo.enterText((android.widget.EditText) solo.getView("text"), "Test Krish");
        //Click on ImageView
		solo.clickOnView(solo.getView("tick"));
        //Click on Default
		solo.clickOnView(solo.getView("value", 4));
        //Click on Default
		solo.clickOnView(solo.getView("text"));
        //Click on Default
		solo.clickOnView(solo.getView("text"));
        //Enter the text: 'My desk'
		solo.clearEditText((android.widget.EditText) solo.getView("text"));
		solo.enterText((android.widget.EditText) solo.getView("text"), "My desk");
        //Click on ImageView
		solo.clickOnView(solo.getView("tick"));
        //Click on Always
		solo.clickOnView(solo.getView("value", 5));
        //Click on When I'm away
		solo.clickOnText(java.util.regex.Pattern.quote("When I'm away"));
        //Click on When I'm away
		solo.clickOnView(solo.getView("value", 5));
        //Click on Never
		solo.clickOnText(java.util.regex.Pattern.quote("Never"));
        //Click on Never
		solo.clickOnView(solo.getView("value", 5));
        //Click on Always
		solo.clickOnText(java.util.regex.Pattern.quote("Always"));
        //Click on Edit All
		solo.clickOnText(java.util.regex.Pattern.quote("Edit All"));
        //Click on Test Krish
		solo.clickOnView(solo.getView("text"));
        //Enter the text: 'My test'
		solo.clearEditText((android.widget.EditText) solo.getView("text"));
		solo.enterText((android.widget.EditText) solo.getView("text"), "My test");
        //Click on ImageView
		solo.clickOnView(solo.getView("tick"));
        //Enter the text: 'My test'
		solo.clearEditText((android.widget.EditText) solo.getView("text"));
		solo.enterText((android.widget.EditText) solo.getView("text"), "My test");
        //Click on My desk
		solo.clickOnView(solo.getView("text", 1));
        //Enter the text: 'Test desk'
		solo.clearEditText((android.widget.EditText) solo.getView("text", 1));
		solo.enterText((android.widget.EditText) solo.getView("text", 1), "Test desk");
        //Click on ImageView
		solo.clickOnView(solo.getView("tick", 1));
        //Enter the text: 'Test desk'
		solo.clearEditText((android.widget.EditText) solo.getView("text", 1));
		solo.enterText((android.widget.EditText) solo.getView("text", 1), "Test desk");
        //Click on When I'm away
		solo.clickOnText(java.util.regex.Pattern.quote("When I'm away"));
        //Click on Never
		solo.clickOnText(java.util.regex.Pattern.quote("Never"));
        //Click on Always
		solo.clickOnText(java.util.regex.Pattern.quote("Always"));
        //Click on LinearLayout
		solo.clickOnView(solo.getView("settingsLayout"));
        //Click on View Device History
		solo.clickOnText(java.util.regex.Pattern.quote("View Device History"));
        //Wait for activity: 'com.securifi.almondplus.sensor.SensorLogActivity'
		assertTrue("SensorLogActivity is not found!", solo.waitForActivity("SensorLogActivity"));
        //Click on HomeView SensorLogAcivity
		solo.clickOnView(solo.getView(android.widget.LinearLayout.class, 34));
        //Wait for activity: 'com.securifi.almondplus.AlmondPlusActivity'
		assertTrue("AlmondPlusActivity is not found!", solo.waitForActivity("AlmondPlusActivity"));
        //Click on LinearLayout
		solo.clickOnView(solo.getView("settingsLayout", 1));
        //Click on HomeView Almond
		solo.clickOnView(solo.getView(android.widget.LinearLayout.class, 45));
        //Scroll to Logout
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 1);
		solo.scrollListToLine(listView0, 1);
        //Click on Logout
		solo.clickOnText(java.util.regex.Pattern.quote("Logout"));
        //Wait for activity: 'com.securifi.almondplus.cloud.CloudLogin'
		assertTrue("CloudLogin is not found!", solo.waitForActivity("CloudLogin"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("email"));
        //Enter the text: 'krishnendu.s@securifi.com'
		solo.clearEditText((android.widget.EditText) solo.getView("email"));
		solo.enterText((android.widget.EditText) solo.getView("email"), "krishnendu.s@securifi.com");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("password"));
        //Enter the text: '000000'
		solo.clearEditText((android.widget.EditText) solo.getView("password"));
		solo.enterText((android.widget.EditText) solo.getView("password"), "000000");
        //Click on LOGIN
		solo.clickOnView(solo.getView("btn_login"));
        //Wait for activity: 'com.securifi.almondplus.AlmondPlusActivity'
		assertTrue("AlmondPlusActivity is not found!", solo.waitForActivity("AlmondPlusActivity"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("mode_icon"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("mode_icon"));
        //Click on HomeView Almond
		solo.clickOnView(solo.getView(android.widget.LinearLayout.class, 45));
        //Click on Almond-1880
		solo.clickInList(3, 1);
        //Click on HomeView Almond
		solo.clickOnView(solo.getView(android.widget.LinearLayout.class, 51));
        //Click on Add
		solo.clickInList(9, 1);
        //Wait for activity: 'com.securifi.almondplus.cloud.Affiliation'
		assertTrue("Affiliation is not found!", solo.waitForActivity("Affiliation"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("txtAffiliationCode"));
        //Enter the text: 'cgvhjbbjbk'
		solo.clearEditText((android.widget.EditText) solo.getView("txtAffiliationCode"));
		solo.enterText((android.widget.EditText) solo.getView("txtAffiliationCode"), "cgvhjbbjbk");
        //Click on LINK ALMOND
		solo.clickOnView(solo.getView("btn_affiliation_done"));
        //Wait for activity: 'com.securifi.almondplus.cloud.AffiliationFailure'
		assertTrue("AffiliationFailure is not found!", solo.waitForActivity("AffiliationFailure"));
        //Click on ImageView
		solo.clickOnView(solo.getView("back"));
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Wait for activity: 'com.securifi.almondplus.AlmondPlusActivity'
		assertTrue("AlmondPlusActivity is not found!", solo.waitForActivity("AlmondPlusActivity"));
        //Click on HomeView Almond
		solo.clickOnView(solo.getView(android.widget.LinearLayout.class, 51));
        //Scroll to Logout All
		android.widget.ListView listView1 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 1);
		solo.scrollListToLine(listView1, 1);
        //Click on Logout All
		solo.clickOnText(java.util.regex.Pattern.quote("Logout All"));
        //Wait for activity: 'com.securifi.almondplus.cloud.CloudLogin'
		assertTrue("CloudLogin is not found!", solo.waitForActivity("CloudLogin"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("password"));
        //Enter the text: '000000'
		solo.clearEditText((android.widget.EditText) solo.getView("password"));
		solo.enterText((android.widget.EditText) solo.getView("password"), "000000");
        //Click on Logout All
		solo.clickOnView(solo.getView("btn_login"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Wait for activity: 'com.securifi.almondplus.cloud.CloudLogin'
		assertTrue("CloudLogin is not found!", solo.waitForActivity("CloudLogin"));
        //Click on FORGOT?
		solo.clickOnView(solo.getView("forgotPassword"));
        //Wait for activity: 'com.securifi.almondplus.cloud.ResetPassword'
		assertTrue("ResetPassword is not found!", solo.waitForActivity("ResetPassword"));
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
