package stepDefinitions;


import Common.CommonMembers;

public class LogOut extends CommonMembers {
	
	public static String LogOutImg = "//*[@id='iv_hp_logo_bg']";
	public static String BtnSignOut = "//*[@id='btn_signout']";
	public static String Yes = "//*[@resource-id='android:id/button1']";
	
	public static void Profile()
	{
		driver.findElementByXPath(LogOutImg).click();
		for(int i=0;i<=2;i++) {
		driver.executeScript("experitest:client.swipe(\"Down\", 0, 500)");}
		driver.findElementByXPath(BtnSignOut).click();

	}
	public static void SignOff()
	{
		driver.findElementByXPath(Yes).click();

	}
	

}
