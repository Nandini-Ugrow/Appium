package stepDefinitions;


import Common.CommonMembers;
import Common.Hooks;

public class HomeScreen extends CommonMembers{

	public static String login = "btn_login";
	public static String text_login = "Login";
	public static String email = "et_email";
	public static String confirm = "et_reconfirm_email";
	public static String password = "et_password";
	public static String Today= "tv_day_title";
	
	
	public static void verify_login() {
		driver.findElementById(login).click();
		Hooks.Wait();
		driver.findElementByName(text_login);
	}
	public static void verify_email() {
		driver.findElementById(email).sendKeys("testpreg@mailinator.com");
		driver.findElementById(confirm).sendKeys("testpreg@mailinator.com");
	}
	public static void enter_password() {
		driver.findElementById(password).sendKeys("test1234");
	}
	public static void login_continue() {
		driver.findElementById(login).click();
	}
	public static void verify_today_screen() {
		driver.findElementById(Today);
	}
	}