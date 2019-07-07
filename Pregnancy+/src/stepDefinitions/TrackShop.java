package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import Common.CommonMembers;

public class TrackShop extends CommonMembers{
	
	public static String Baby="shareTxt";
	public static String BabyCare = "Baby care";
	public static String Item = "//*[@text='2-3 Hooded towels']";
	public static String Item1="//*[@text='2-4 Wash cloths']";
	public static String Item2="//*[@text='Baby bath oil']";
	
	public static String MyItems = "//*[@text='MY ITEMS']";
	
	public static void ShopScreen()
	{
		driver.findElementByName(Trackers.Shop).click();
		driver.executeScript("experitest:client.swipe(\"Down\", 0, 500)");
	}
	public static void BabyCare()
	{
		driver.findElementById(Baby).click();
		driver.executeScript("experitest:client.swipe(\"Down\", 0, 500)");
		driver.findElementByName(BabyCare);
	}
	public static void ItemDisp()
	{
		driver.findElementByXPath(Item).click();
		driver.findElementByXPath(Item1).click();
		driver.findElementByXPath(Item2).click();

	}
	public static void Items()
	{
		driver.findElementByXPath(MyItems).click();
	}
	public static void VerifyItem()
	{
		/*String options= driver.findEle(Item).getText();
	    if(options.equalsIgnoreCase("2-3 Hooded towels"))
	    System.out.println(options+" element is present");
	    else
	    	System.out.println("not present");*/
	    
	    List<WebElement> cbox=driver.findElementsByXPath("//*[@id='imgCheck']");
	    System.out.println(cbox.size());
	    
	   
	    	for(WebElement checkbox:cbox)
	    		System.out.println(checkbox.getText());
	    	
	    	/*if(cbox.get(i).getText().equalsIgnoreCase("2-3 Hooded towels"))
	    	
	    		System.out.println("Element is present");
	    	else
	    		System.out.println("Element not present");*/
	    
	    for(int i=0;i<=2;i++) {
	    driver.navigate().back();}
	    driver.findElementByXPath(Trackers.Yes).click();
	}

}
