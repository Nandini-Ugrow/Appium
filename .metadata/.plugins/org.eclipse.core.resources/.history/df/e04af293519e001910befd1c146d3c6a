package stepDefinitions;



import Common.CommonMembers;
import Common.Hooks;


public class CreateAccount extends CommonMembers {
	public static String PregHome = "tv_app_title";
	public static String JoinUs = "btn_sign_up";
	public static String Join = "Join us";
	public static String Switch = "consentSwitch";
	public static String Name = "et_name";
	public static String Done = "Done";
	public static String Date = "tv_due_date_new";
	public static String Setdate = "mdtp_previous_month_arrow";
	public static String Ok = "mdtp_ok";
	public static String VerifyDate = "btn_calculator_due_date_new";
	public static String SetCalcDate = "btn_set_calculate_date";
	public static String Back = "Back";
	public static String Agree = "btn_agree_new";
	
	
	public static void JoinPreg()
	{
		driver.findElementById(PregHome);
	}
	public static void JoinUsScreen()
	{
		driver.findElementById(JoinUs).click();;
	}
	public static void VerifyJoin()
	{
		driver.findElementByName(Join);
	}
	public static void createemail() {
		driver.findElementById(HomeScreen.email).sendKeys("p9testpregjuly@mailinator.com");
		driver.findElementById(HomeScreen.confirm).sendKeys("p9testpregjuly@mailinator.com");

	}
	public static void create_enter_password() {
		driver.findElementById(HomeScreen.password).sendKeys("test1234");
	}
	public static void Switch()
	{
		driver.findElementById(Switch).click();
		driver.executeScript("experitest:client.swipe(\"Down\", 0, 500)");
		driver.findElementById(HomeScreen.login).click();
		Hooks.Wait();

	}
	public static void SettingsPage() throws InterruptedException
	{
		driver.findElementById(Name).sendKeys("Tina");
		driver.executeScript("experitest:client.swipe(\"Down\", 0, 500)");
		driver.navigate().back();
		driver.findElementByName(Done).click();
        driver.findElementById(Date).click();
        for(int i=0;i<=8;i++) {
        driver.findElementById(Setdate).click();}
        driver.findElementById(Ok).click();
        driver.findElementById(VerifyDate).click();
        driver.findElementById(SetCalcDate).click();
        driver.navigate().back();
        driver.findElementById(Agree).click();
        Thread.sleep(1000, 0);
        
        
	}

}
