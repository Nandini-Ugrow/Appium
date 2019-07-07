package stepDefinitions;
import Common.CommonMembers;



public class Trackers extends CommonMembers {
	public static String more = "navigation_more";
	public static String MoreOptions = "tv_toolbar_title";
	public static final String Shop = "Shop";
	public static final String KickCounter = "Kick Counter";
	public static final String HospitalBag = "Hospital Bag";
	public static final String Contractions = "Contractions";
	public static final String Feedback = "Feedback";
	public static final String FAQs = "FAQs";
	public static String Yes = "//*[@id='button1']";
	
	public static void MoreFab() {
		driver.findElementById(more).click();
	}
	public static void MoreScreen() {
		driver.findElementById(MoreOptions).click();

	}
	
	
    public static void TrackerOptions()
    {
    String opt= driver.findElementByName(Shop).getText();
    if(opt.equalsIgnoreCase("Shop"))
    System.out.println(opt+ "element is present");
    else
    	System.out.println("not present");
   
    String opt1= driver.findElementByName(HospitalBag).getText();
    if(opt1.equalsIgnoreCase("Hospital Bag"))
    System.out.println(opt+ " element is present");
    else
    	System.out.println(opt1+ " not present");
    
    String opt2= driver.findElementByName(KickCounter).getText();
    if(opt2.equalsIgnoreCase("Kick Counter"))
    System.out.println(opt2+ " element is present");
    else
    	System.out.println("not present");
    String opt3= driver.findElementByName(Contractions).getText();
    if(opt3.equalsIgnoreCase("Contractions"))
    System.out.println(opt3+ " element is present");
    else
    	System.out.println("not present");
    String opt4= driver.findElementByName(Feedback).getText();
    if(opt4.equalsIgnoreCase("Feedback"))
    System.out.println(opt4+ " element is present");
    else
    	System.out.println("not present");
    String opt5= driver.findElementByName(FAQs).getText();
    if(opt5.equalsIgnoreCase("FAQs"))
    System.out.println(opt5+ " element is present");
    else
    	System.out.println("not present");
    driver.navigate().back();
    driver.findElementByXPath(Yes).click();
   
    
    
   }
    
}
