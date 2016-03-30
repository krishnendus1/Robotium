package com.securifi.almondplus.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class signup extends ActivityInstrumentationTestCase2 {
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
    public signup() throws ClassNotFoundException {
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
        //Click on Empty Text View
		solo.clickOnView(solo.getView("email"));
        //Enter the text: 'krishnendu.s@securifi.com'
		solo.clearEditText((android.widget.EditText) solo.getView("email"));
		solo.enterText((android.widget.EditText) solo.getView("email"), "krishnendu.s@securifi.com");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("password"));
        //Enter the text: '22222222'
		solo.clearEditText((android.widget.EditText) solo.getView("password"));
		solo.enterText((android.widget.EditText) solo.getView("password"), "22222222");
        //Click on LOGIN
		solo.clickOnView(solo.getView("btn_login"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Click on CREATE CLOUD ACCOUNT
		solo.clickOnView(solo.getView("signup_layout"));
        //Wait for activity: 'com.securifi.almondplus.cloud.TermsOfUse'
		assertTrue("TermsOfUse is not found!", solo.waitForActivity("TermsOfUse"));
        //Click on Accept
		solo.clickOnView(solo.getView("accept"));
        //Wait for activity: 'com.securifi.almondplus.cloud.SignUp'
		assertTrue("SignUp is not found!", solo.waitForActivity("SignUp"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("txtEmailID"));
        //Set default small timeout to 14068 milliseconds
		Timeout.setSmallTimeout(14068);
        //Enter the text: 'test@securifi1.com'                       z
		solo.clearEditText((android.widget.EditText) solo.getView("txtEmailID"));
		solo.enterText((android.widget.EditText) solo.getView("txtEmailID"), "test@securifi1.com");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("txtPassword"));
        //Enter the text: '000000'
		solo.clearEditText((android.widget.EditText) solo.getView("txtPassword"));
		solo.enterText((android.widget.EditText) solo.getView("txtPassword"), "000000");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("txtConfirmPass"));
        //Enter the text: '000000'
		solo.clearEditText((android.widget.EditText) solo.getView("txtConfirmPass"));
		solo.enterText((android.widget.EditText) solo.getView("txtConfirmPass"), "000000");
        //Click on CONTINUE
		solo.clickOnView(solo.getView("btn_continue"));
        //Wait for activity: 'com.securifi.almondplus.cloud.CloudLogin'
		assertTrue("CloudLogin is not found!", solo.waitForActivity("CloudLogin"));
        //Click on RESEND ACTIVATION LINK
		solo.clickOnView(solo.getView("bottomLink"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("password"));
        //Enter the text: '000000'
		solo.clearEditText((android.widget.EditText) solo.getView("password"));
		solo.enterText((android.widget.EditText) solo.getView("password"), "000000");
        //Click on LOGIN
		solo.clickOnView(solo.getView("btn_login"));
        //Wait for activity: 'com.securifi.almondplus.AlmondPlusActivity'
		assertTrue("AlmondPlusActivity is not found!", solo.waitForActivity("AlmondPlusActivity"));
        //Click on LINK ALMOND
		solo.clickOnText(java.util.regex.Pattern.quote("LINK ALMOND"));
        //Wait for activity: 'com.securifi.almondplus.cloud.Affiliation'
		assertTrue("Affiliation is not found!", solo.waitForActivity("Affiliation"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("txtAffiliationCode"));
        //Enter the text: '00000000'
		solo.clearEditText((android.widget.EditText) solo.getView("txtAffiliationCode"));
		solo.enterText((android.widget.EditText) solo.getView("txtAffiliationCode"), "00000000");
        //Click on LINK ALMOND
		solo.clickOnView(solo.getView("btn_affiliation_done"));
        //Wait for activity: 'com.securifi.almondplus.cloud.AffiliationFailure'
		assertTrue("AffiliationFailure is not found!", solo.waitForActivity("AffiliationFailure"));
        //Click on ImageView
		solo.clickOnView(solo.getView("back"));
        //Click on LinearLayout
		solo.clickOnView(solo.getView("back"));
        //Wait for activity: 'com.securifi.almondplus.AlmondPlusActivity'
		assertTrue("AlmondPlusActivity is not found!", solo.waitForActivity("AlmondPlusActivity"));
        //Click on HomeView Almond
		solo.clickOnView(solo.getView(android.widget.LinearLayout.class, 5));
        //Click on Account
		solo.clickInList(4, 0);
        //Wait for activity: 'com.securifi.almondplus.cloud.Accounts'
		assertTrue("Accounts is not found!", solo.waitForActivity("Accounts"));
        //Click on ImageView
		solo.clickOnView(solo.getView("arrow"));
        //Click on Add
		solo.clickOnView(solo.getView("fnameEditBtn"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("fnameEdit"));
        //Enter the text: 'q'
		solo.clearEditText((android.widget.EditText) solo.getView("fnameEdit"));
		solo.enterText((android.widget.EditText) solo.getView("fnameEdit"), "q");
        //Click on Done
		solo.clickOnView(solo.getView("fnameEditBtn"));
        //Click on Add
		solo.clickOnView(solo.getView("lnameEditBtn"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("lnameEdit"));
		//Click on Done
		solo.clickOnView(solo.getView("lnameEditBtn"));
        //Click on Add
		solo.clickOnView(solo.getView("addressEditBtn"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("addressEdit1"));
        //Enter the text: '  &&:&'
		solo.clearEditText((android.widget.EditText) solo.getView("addressEdit1"));
		solo.enterText((android.widget.EditText) solo.getView("addressEdit1"), ";^&&:&");
        //Click on Done
		solo.clickOnView(solo.getView("addressEditBtn"));
        //Click on Add
		solo.clickOnView(solo.getView("zipEditBtn"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("zipEdit"));
        //Enter the text: '7777'
		solo.clearEditText((android.widget.EditText) solo.getView("zipEdit"));
		solo.enterText((android.widget.EditText) solo.getView("zipEdit"), "7777");
        //Click on Done
		solo.clickOnView(solo.getView("zipEditBtn"));
        //Click on Add
		solo.clickOnView(solo.getView("countryEditBtn"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("countryEdit"));
        //Enter the text: 'india'
		solo.clearEditText((android.widget.EditText) solo.getView("countryEdit"));
		solo.enterText((android.widget.EditText) solo.getView("countryEdit"), "india");
        //Click on Done
		solo.clickOnView(solo.getView("countryEditBtn"));
        //Click on ImageView
		solo.clickOnView(solo.getView("arrow"));
        //Click on HomeView Almond
		solo.clickOnView(solo.getView(android.widget.LinearLayout.class, 4));
        //Click on Account
		solo.clickInList(4, 0);
        //Wait for activity: 'com.securifi.almondplus.cloud.Accounts'
		assertTrue("Accounts is not found!", solo.waitForActivity("Accounts"));
        //Click on ImageView
		solo.clickOnView(solo.getView("arrow"));
        //Click on DELETE ACCOUNT
		solo.clickOnView(solo.getView("deleteAccount"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("edit_text"));
        //Enter the text: '000000'
		solo.clearEditText((android.widget.EditText) solo.getView("edit_text"));
		solo.enterText((android.widget.EditText) solo.getView("edit_text"), "000000");
        //Click on Delete
		solo.clickOnView(solo.getView("ok"));
        //Wait for activity: 'com.securifi.almondplus.cloud.CloudLogin'
		assertTrue("CloudLogin is not found!", solo.waitForActivity("CloudLogin"));
		//Click on lock button
		solo.clickLongOnScreen(10, 15);

	}
}
