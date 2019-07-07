package stepDefinitions;


import Common.CommonMembers;
import Common.Hooks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PregnancyStep extends CommonMembers  {
	
	// HomeScreen
	public static String Pregnancy = "tv_app_title";
	
	@Before
	public static void BeforeTestRun()
	{
		
		Hooks.AppiumCapabilities();
	}

	@Given("^I verify that I am in Login Screen$")
	public void i_verify_that_I_am_in_Login_Screen() throws Throwable {
	    HomeScreen.verify_login();
	}

	@Then("^I enter Email Address and Confirm Email$")
	public void i_enter_Email_Address_and_Confirm_Email() throws Throwable {
	    HomeScreen.verify_email();
	}

	@Then("^I enter Password$")
	public void i_enter_Password() throws Throwable {
	    HomeScreen.enter_password();
	}

	@Then("^I choose Continue$")
	public void i_choose_Continue() throws Throwable {
	    HomeScreen.login_continue();
	}
	@Then("^I verify that I am in Today Screen$")
	public void i_verify_that_I_am_in_Today_Screen() throws Throwable {
		HomeScreen.verify_today_screen();
	}
	@Given("^I am in HomeScreen of BabyPlus$")
	public void i_am_in_HomeScreen_of_BabyPlus() throws Throwable {
	    CreateAccount.JoinPreg();
	}

	@Then("^I navigate to JoinUs Screen$")
	public void i_navigate_to_JoinUs_Screen() throws Throwable {
	    CreateAccount.JoinUsScreen();
	    CreateAccount.VerifyJoin();
	}

	@When("^I enter the philips account credentials 'devicefarm@philips\\.com' with password '#Welcome(\\d+)'$")
	public void i_enter_the_philips_account_credentials_devicefarm_philips_com_with_password_Welcome(int arg1) throws Throwable {
		CreateAccount.createemail();
		CreateAccount.create_enter_password();
		CreateAccount.Switch();
		CreateAccount.SettingsPage();
		
	}
	@Then("^I tap the image$")
	public void i_tap_the_image() throws Throwable {
	   ChooseBaby.ImageTap();
	}

	@Then("^I swipe to choose babay$")
	public void i_swipe_to_choose_babay() throws Throwable {
		ChooseBaby.SwipeBaby();
	}

	@When("^I download Baby Image$")
	public void i_download_Baby_Image() throws Throwable {
	    ChooseBaby.DownloadImg();
	}

	@Then("^I navigate back to Today Screen$")
	public void i_navigate_back_to_Today_Screen() throws Throwable {
	    ChooseBaby.NavigateToday();
	}

	@Then("^I again tap the image$")
	public void i_again_tap_the_image() throws Throwable {
		ChooseBaby.ImageTap();
	}
	@Then("^I navigate to more options screen$")
	public void i_navigate_to_more_options_screen() throws Throwable {
		Trackers.MoreFab();

	}

	@Then("^I verify that I am in more options screen$")
	public void i_verify_that_I_am_in_more_options_screen() throws Throwable {
		Trackers.MoreScreen();

	}
	@Then("^I see Shortcut options 'Shop', 'KickCounter', 'HospitalBag', 'Contractions', 'Feedback', 'FAQs'\\.$")
	public void i_see_Shortcut_options_Shop_KickCounter_HospitalBag_Contractions_Feedback_FAQs() throws Throwable {
	Trackers.TrackerOptions();
	}
	@Then("^I navigate to Shop Screen$")
	public void i_navigate_to_Shop_Screen() throws Throwable {
	    TrackShop.ShopScreen();
	}

	@Then("^I choose Baby Care$")
	public void i_choose_Baby_Care() throws Throwable {
		TrackShop.BabyCare();
	}

	@Then("^I select an item$")
	public void i_select_an_item() throws Throwable {
	    TrackShop.ItemDisp();
	}

	@Then("^I navigate to MyItems$")
	public void i_navigate_to_MyItems() throws Throwable {
	    TrackShop.Items();
	}

	@When("^I verify that Item Is Present$")
	public void i_verify_that_Item_Is_Present() throws Throwable {
	    TrackShop.VerifyItem();
	}

	@Then("^I choose MyProfile Icon$")
	public void i_choose_MyProfile_Icon() throws Throwable {
	    LogOut.Profile();
	}

	@Then("^I choose Signout$")
	public void i_choose_Signout() throws Throwable {
	    LogOut.SignOff();
	}

	




}