package com.securifi.almondplus.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class local_connection extends ActivityInstrumentationTestCase2 {
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
    public local_connection() throws ClassNotFoundException {
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
        //Click on (425.8125, 1194.6666)
		solo.clickOnScreen(425.8125F, 1194.6666F);
        //Wait for activity: 'com.securifi.almondplus.LocalAffiliation'
		assertTrue("LocalAffiliation is not found!", solo.waitForActivity("LocalAffiliation"));
		//Click on (627.1875, 334.22223)
		solo.clickOnScreen(627.1875F, 334.22223F);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("almondIp"));
        //Sleep for 6730 milliseconds
		solo.sleep(6730);
        //Enter the text: '10.25.25.4'
		solo.clearEditText((android.widget.EditText) solo.getView("almondIp"));
		solo.enterText((android.widget.EditText) solo.getView("almondIp"), "10.25.25.4");
        //Sleep for 747 milliseconds
		solo.sleep(747);
        //Click on (666.0, 414.22223)
		solo.clickOnScreen(666.0F, 414.22223F);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("almondLogin"));
        //Sleep for 2117 milliseconds
		solo.sleep(2117);
        //Enter the text: 'root'
		solo.clearEditText((android.widget.EditText) solo.getView("almondLogin"));
		solo.enterText((android.widget.EditText) solo.getView("almondLogin"), "root");
        //Sleep for 707 milliseconds
		solo.sleep(707);
        //Click on (691.3125, 512.0)
		solo.clickOnScreen(691.3125F, 512.0F);
        //Sleep for 879 milliseconds
		solo.sleep(879);
        //Click on (653.0625, 512.0)
		solo.clickOnScreen(653.0625F, 512.0F);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("almondPassword"));
        //Sleep for 1042 milliseconds
		solo.sleep(1042);
        //Enter the text: 'v'
		solo.clearEditText((android.widget.EditText) solo.getView("almondPassword"));
		solo.enterText((android.widget.EditText) solo.getView("almondPassword"), "v");
        //Sleep for 1406 milliseconds
		solo.sleep(1406);
        //Click on (559.6875, 608.0)
		solo.clickOnScreen(559.6875F, 608.0F);
        //Wait for activity: 'com.securifi.almondplus.cloud.AffiliationFailure'
		assertTrue("AffiliationFailure is not found!", solo.waitForActivity("AffiliationFailure"));
        //Sleep for 1775 milliseconds
		solo.sleep(1775);
        //Click on (71.4375, 103.111115)
		solo.clickOnScreen(71.4375F, 103.111115F);
        //Sleep for 11808 milliseconds
		solo.sleep(11808);
        //Click on (676.125, 348.44446)
		solo.clickOnScreen(676.125F, 348.44446F);
        //Click on 10.25.25.4
		solo.clickOnView(solo.getView("almondIp"));
        //Sleep for 2339 milliseconds
		solo.sleep(2339);
        //Enter the text: '10.25.25.3'
		solo.clearEditText((android.widget.EditText) solo.getView("almondIp"));
		solo.enterText((android.widget.EditText) solo.getView("almondIp"), "10.25.25.3");
        //Sleep for 597 milliseconds
		solo.sleep(597);
        //Click on (608.344, 608.8881)
		solo.clickOnScreen(608.344F, 608.8881F);
        //Sleep for 2465 milliseconds
		solo.sleep(2465);
        //Click on (443.8125, 336.0)
		solo.clickOnScreen(443.8125F, 336.0F);
        //Wait for activity: 'com.securifi.almondplus.AlmondPlusActivity'
		assertTrue("AlmondPlusActivity is not found!", solo.waitForActivity("AlmondPlusActivity"));
        //Sleep for 3421 milliseconds
		solo.sleep(3421);
        //Click on (650.8125, 119.111115)
		solo.clickOnScreen(650.8125F, 119.111115F);
        //Sleep for 1020 milliseconds
		solo.sleep(1020);
        //Click on (521.4375, 286.22223)
		solo.clickOnScreen(521.4375F, 286.22223F);
        //Sleep for 1724 milliseconds
		solo.sleep(1724);
        //Click on (475.875, 266.66666)
		solo.clickOnScreen(475.875F, 266.66666F);
        //Wait for activity: 'com.securifi.almondplus.cloud.CloudLogin'
		assertTrue("CloudLogin is not found!", solo.waitForActivity("CloudLogin"));
        //Sleep for 2079 milliseconds
		solo.sleep(2079);
        //Click on (47.25, 113.77778)
		solo.clickOnScreen(47.25F, 113.77778F);
        //Wait for activity: 'com.securifi.almondplus.AlmondPlusActivity'
		assertTrue("AlmondPlusActivity is not found!", solo.waitForActivity("AlmondPlusActivity"));
        //Sleep for 735 milliseconds
		solo.sleep(735);
        //Click on (66.375, 112.0)
		solo.clickOnScreen(66.375F, 112.0F);
        //Sleep for 1341 milliseconds
		solo.sleep(1341);
        //Drag from (537.75, 659.55554) to (349.59375, 658.6666)
		solo.drag(537.75F, 349.59375F, 659.55554F, 658.6666F, 40);
        //Sleep for 1499 milliseconds
		solo.sleep(1499);
        //Click on (376.875, 1256.8889)
		solo.clickOnScreen(376.875F, 1256.8889F);
        //Sleep for 1043 milliseconds
		solo.sleep(1043);
        //Click on (370.125, 768.0)
		solo.clickOnScreen(370.125F, 768.0F);
        //Sleep for 2956 milliseconds
		solo.sleep(2956);
        //Click on (295.3125, 428.44446)
		solo.clickOnScreen(295.3125F, 428.44446F);
        //Sleep for 639 milliseconds
		solo.sleep(639);
        //Click on (421.875, 1011.55554)
		solo.clickOnScreen(421.875F, 1011.55554F);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("txtName"));
        //Sleep for 1714 milliseconds
		solo.sleep(1714);
        //Enter the text: 'home'
		solo.clearEditText((android.widget.EditText) solo.getView("txtName"));
		solo.enterText((android.widget.EditText) solo.getView("txtName"), "home");
        //Sleep for 928 milliseconds
		solo.sleep(928);
        //Click on (649.125, 124.44444)
		solo.clickOnScreen(649.125F, 124.44444F);
        //Sleep for 2636 milliseconds
		solo.sleep(2636);
        //Click on (366.1875, 753.7778)
		solo.clickOnScreen(366.1875F, 753.7778F);
        //Sleep for 1296 milliseconds
		solo.sleep(1296);
        //Click on (478.6875, 417.77777)
		solo.clickOnScreen(478.6875F, 417.77777F);
        //Sleep for 566 milliseconds
		solo.sleep(566);
        //Click on (442.6875, 1013.3333)
		solo.clickOnScreen(442.6875F, 1013.3333F);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("txtName"));
        //Sleep for 1540 milliseconds
		solo.sleep(1540);
        //Enter the text: 'away'
		solo.clearEditText((android.widget.EditText) solo.getView("txtName"));
		solo.enterText((android.widget.EditText) solo.getView("txtName"), "away");
        //Sleep for 1110 milliseconds
		solo.sleep(1110);
        //Click on (689.0625, 99.55556)
		solo.clickOnScreen(689.0625F, 99.55556F);
        //Sleep for 3697 milliseconds
		solo.sleep(3697);
        //Click on (113.0625, 407.1111)
		solo.clickOnScreen(113.0625F, 407.1111F);
        //Sleep for 1386 milliseconds
		solo.sleep(1386);
        //Click on (113.0625, 243.55556)
		solo.clickOnScreen(113.0625F, 243.55556F);
        //Sleep for 1196 milliseconds
		solo.sleep(1196);
        //Click on (103.5, 405.33334)
		solo.clickOnScreen(103.5F, 405.33334F);
        //Sleep for 1079 milliseconds
		solo.sleep(1079);
        //Click on (80.4375, 256.0)
		solo.clickOnScreen(80.4375F, 256.0F);
        //Sleep for 1003 milliseconds
		solo.sleep(1003);
        //Click on (88.875, 407.1111)
		solo.clickOnScreen(88.875F, 407.1111F);
        //Sleep for 1114 milliseconds
		solo.sleep(1114);
        //Click on (34.875, 224.0)
		solo.clickOnScreen(34.875F, 224.0F);
        //Sleep for 938 milliseconds
		solo.sleep(938);
        //Click on (91.125, 394.66666)
		solo.clickOnScreen(91.125F, 394.66666F);
        //Sleep for 947 milliseconds
		solo.sleep(947);
        //Click on (94.5, 282.66666)
		solo.clickOnScreen(94.5F, 282.66666F);
        //Sleep for 6129 milliseconds
		solo.sleep(6129);
        //Click on (132.75, 1217.7778)
		solo.clickOnScreen(132.75F, 1217.7778F);
        //Sleep for 1684 milliseconds
		solo.sleep(1684);
        //Click on (660.9375, 1265.7778)
		solo.clickOnScreen(660.9375F, 1265.7778F);
        //Sleep for 1152 milliseconds
		solo.sleep(1152);
        //Click on (655.875, 240.0)
		solo.clickOnScreen(655.875F, 240.0F);
        //Wait for activity: 'com.securifi.almondplus.LocalAffiliation'
		assertTrue("LocalAffiliation is not found!", solo.waitForActivity("LocalAffiliation"));
        //Sleep for 1275 milliseconds
		solo.sleep(1275);
        //Click on (700.3125, 405.33334)
		solo.clickOnScreen(700.3125F, 405.33334F);
        //Sleep for 1007 milliseconds
		solo.sleep(1007);
        //Click on (698.0625, 442.66666)
		solo.clickOnScreen(698.0625F, 442.66666F);
        //Sleep for 859 milliseconds
		solo.sleep(859);
        //Click on (691.875, 432.0)
		solo.clickOnScreen(691.875F, 432.0F);
        //Click on 10.25.25.3
		solo.clickOnView(solo.getView("almondIp"));
        //Sleep for 3506 milliseconds
		solo.sleep(3506);
        //Enter the text: '10.25.25.177'
		solo.clearEditText((android.widget.EditText) solo.getView("almondIp"));
		solo.enterText((android.widget.EditText) solo.getView("almondIp"), "10.25.25.177");
        //Sleep for 560 milliseconds
		solo.sleep(560);
        //Click on (699.1875, 602.6667)
		solo.clickOnScreen(699.1875F, 602.6667F);
        //Sleep for 890 milliseconds
		solo.sleep(890);
        //Click on (695.25, 572.44446)
		solo.clickOnScreen(695.25F, 572.44446F);
        //Click on almondPassword
		solo.clickOnView(solo.getView("almondPassword"));
        //Sleep for 2405 milliseconds
		solo.sleep(2405);
        //Click on (690.75, 512.0)
		solo.clickOnScreen(690.75F, 512.0F);
        //Click on root
		solo.clickOnView(solo.getView("almondLogin"));
        //Sleep for 3802 milliseconds
		solo.sleep(3802);
        //Enter the text: 'root'
		solo.clearEditText((android.widget.EditText) solo.getView("almondLogin"));
		solo.enterText((android.widget.EditText) solo.getView("almondLogin"), "root");
        //Sleep for 695 milliseconds
		solo.sleep(695);
        //Click on (680.625, 583.11115)
		solo.clickOnScreen(680.625F, 583.11115F);
        //Click on almondPassword
		solo.clickOnView(solo.getView("almondPassword"));
        //Sleep for 3802 milliseconds
		solo.sleep(3802);
        //Enter the text: 'root'
		solo.clearEditText((android.widget.EditText) solo.getView("almondPassword"));
		solo.enterText((android.widget.EditText) solo.getView("almondPassword"), "root");
        //Click on (618.1875, 677.50525)
		solo.clickOnScreen(618.1875F, 677.50525F);
        //Sleep for 1201 milliseconds
		solo.sleep(1201);
        //Click on (550.125, 337.77777)
		solo.clickOnScreen(550.125F, 337.77777F);
        //Wait for activity: 'com.securifi.almondplus.AlmondPlusActivity'
		assertTrue("AlmondPlusActivity is not found!", solo.waitForActivity("AlmondPlusActivity"));
        //Sleep for 2522 milliseconds
		solo.sleep(2522);
        //Drag from (530.4375, 1034.6666) to (624.27765, 323.99066)
		solo.drag(530.4375F, 624.27765F, 1034.6666F, 323.99066F, 40);
        //Sleep for 638 milliseconds
		solo.sleep(638);
        //Drag from (583.3125, 990.2222) to (640.125, 458.66666)
		solo.drag(583.3125F, 640.125F, 990.2222F, 458.66666F, 40);
        //Sleep for 3262 milliseconds
		solo.sleep(3262);
        //Drag from (547.3125, 1054.2223) to (626.34375, 424.8889)
		solo.drag(547.3125F, 626.34375F, 1054.2223F, 424.8889F, 40);
        //Click on (609.75, 835.55554)
		solo.clickOnScreen(609.75F, 835.55554F);
        //Sleep for 832 milliseconds
		solo.sleep(832);
        //Click on (612.0, 1256.8889)
		solo.clickOnScreen(612.0F, 1256.8889F);
        //Sleep for 1841 milliseconds
		solo.sleep(1841);
        //Click on (622.125, 460.44446)
		solo.clickOnScreen(622.125F, 460.44446F);
        //Sleep for 4104 milliseconds
		solo.sleep(4104);
        //Click on (657.0, 275.55557)
		solo.clickOnScreen(657.0F, 275.55557F);
        //Sleep for 3192 milliseconds
		solo.sleep(3192);
        //Click on (644.625, 254.22223)
		solo.clickOnScreen(644.625F, 254.22223F);
        //Sleep for 975 milliseconds
		solo.sleep(975);
        //Drag from (616.5, 995.55554) to (639.0, 394.66666)
		solo.drag(616.5F, 639.0F, 995.55554F, 394.66666F, 40);
        //Click on (608.625, 1006.2222)
		solo.clickOnScreen(608.625F, 1006.2222F);
        //Sleep for 1326 milliseconds
		solo.sleep(1326);
        //Click on (164.25, 1264.0)
		solo.clickOnScreen(164.25F, 1264.0F);
        //Sleep for 1234 milliseconds
		solo.sleep(1234);
        //Click on (61.875, 108.44444)
		solo.clickOnScreen(61.875F, 108.44444F);
        //Sleep for 1469 milliseconds
		solo.sleep(1469);
        //Click on (453.375, 316.44446)
		solo.clickOnScreen(453.375F, 316.44446F);
        //Sleep for 2116 milliseconds
		solo.sleep(2116);
        //Click on (558.5625, 106.666664)
		solo.clickOnScreen(558.5625F, 106.666664F);
        //Sleep for 2226 milliseconds
		solo.sleep(2226);
        //Click on (561.375, 106.666664)
		solo.clickOnScreen(561.375F, 106.666664F);
        //Sleep for 1261 milliseconds
		solo.sleep(1261);
        //Click on (600.75, 113.77778)
		solo.clickOnScreen(600.75F, 113.77778F);
        //Sleep for 1662 milliseconds
		solo.sleep(1662);
        //Click on (554.625, 104.88889)
		solo.clickOnScreen(554.625F, 104.88889F);
        //Sleep for 1428 milliseconds
		solo.sleep(1428);
        //Click on (561.9375, 119.111115)
		solo.clickOnScreen(561.9375F, 119.111115F);
        //Sleep for 1231 milliseconds
		solo.sleep(1231);
        //Click on (545.625, 124.44444)
		solo.clickOnScreen(545.625F, 124.44444F);
        //Sleep for 1203 milliseconds
		solo.sleep(1203);
        //Click on (558.5625, 110.22222)
		solo.clickOnScreen(558.5625F, 110.22222F);
        //Sleep for 1128 milliseconds
		solo.sleep(1128);
        //Click on (621.5096, 1206.3058)
		solo.clickOnScreen(621.5096F, 1206.3058F);
        //Sleep for 1758 milliseconds
		solo.sleep(1758);
        //Click on (394.3125, 1244.4445)
		solo.clickOnScreen(394.3125F, 1244.4445F);
        //Sleep for 2177 milliseconds
		solo.sleep(2177);
        //Click on (44.4375, 58.666668)
		solo.clickOnScreen(44.4375F, 58.666668F);
        //Sleep for 1607 milliseconds
		solo.sleep(1607);
        //Click on (458.4375, 513.7778)
		solo.clickOnScreen(458.4375F, 513.7778F);
        //Wait for activity: 'com.securifi.almondplus.LocalAffiliation'
		assertTrue("LocalAffiliation is not found!", solo.waitForActivity("LocalAffiliation"));
        //Sleep for 1636 milliseconds
		solo.sleep(1636);
        //Click on (39.847004, 91.09568)
		solo.clickOnScreen(39.847004F, 91.09568F);
        //Sleep for 1744 milliseconds
		solo.sleep(1744);
        //Click on (342.0, 544.0)
		solo.clickOnScreen(342.0F, 544.0F);
        //Sleep for 3219 milliseconds
		solo.sleep(3219);
        //Click on (650.8125, 81.77778)
		solo.clickOnScreen(650.8125F, 81.77778F);
        //Sleep for 878 milliseconds
		solo.sleep(878);
        //Click on (460.125, 272.0)
		solo.clickOnScreen(460.125F, 272.0F);
        //Sleep for 1557 milliseconds
		solo.sleep(1557);
        //Click on (451.125, 257.77777)
		solo.clickOnScreen(451.125F, 257.77777F);
        //Wait for activity: 'com.securifi.almondplus.cloud.CloudLogin'
		assertTrue("CloudLogin is not found!", solo.waitForActivity("CloudLogin"));
        //Sleep for 728 milliseconds
		solo.sleep(728);
        //Click on (507.9375, 344.8889)
		solo.clickOnScreen(507.9375F, 344.8889F);
        //Sleep for 1414 milliseconds
		solo.sleep(1414);
        //Click on (402.1875, 352.0)
		solo.clickOnScreen(402.1875F, 352.0F);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("email"));
        //Sleep for 1104 milliseconds
		solo.sleep(1104);
        //Enter the text: 'krishnendu.s@securifi.com'
		solo.clearEditText((android.widget.EditText) solo.getView("email"));
		solo.enterText((android.widget.EditText) solo.getView("email"), "krishnendu.s@securifi.com");
        //Sleep for 609 milliseconds
		solo.sleep(609);
        //Click on (461.8125, 485.33334)
		solo.clickOnScreen(461.8125F, 485.33334F);
        //Sleep for 790 milliseconds
		solo.sleep(790);
        //Click on (356.0625, 460.44446)
		solo.clickOnScreen(356.0625F, 460.44446F);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("password"));
        //Sleep for 1972 milliseconds
		solo.sleep(1972);
        //Enter the text: '000000'
		solo.clearEditText((android.widget.EditText) solo.getView("password"));
		solo.enterText((android.widget.EditText) solo.getView("password"), "000000");
        //Sleep for 600 milliseconds
		solo.sleep(600);
        //Click on (610.875, 567.11115)
		solo.clickOnScreen(610.875F, 567.11115F);
        //Wait for activity: 'com.securifi.almondplus.AlmondPlusActivity'
		assertTrue("AlmondPlusActivity is not found!", solo.waitForActivity("AlmondPlusActivity"));
        //Sleep for 3525 milliseconds
		solo.sleep(3525);
        //Click on (44.4375, 129.77779)
		solo.clickOnScreen(44.4375F, 129.77779F);
        //Sleep for 4486 milliseconds
		solo.sleep(4486);
        //Click on (432.0, 1084.4445)
		solo.clickOnScreen(432.0F, 1084.4445F);
        //Wait for activity: 'com.securifi.almondplus.cloud.CloudLogin'
		assertTrue("CloudLogin is not found!", solo.waitForActivity("CloudLogin"));
        //Sleep for 655 milliseconds
		solo.sleep(655);
        //Press menu back key
		solo.goBack();
	}
}
