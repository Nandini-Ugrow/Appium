package stepDefinitions;

import Common.CommonMembers;

public class ChooseBaby extends CommonMembers{

	public static String bimg= "iv_today_header";
	public static String Img="imageView";
	public static String Download = "/*[@id='imgDownload']";
	
	
	public static void ImageTap()
	{
		driver.findElementById(bimg).click();
		
		
	}
	public static void SwipeBaby()
	{
		driver.executeScript("experitest:client.swipe(\"Down\", 0, 10000)");

	}
	public static void DownloadImg()
	{
		driver.findElementById(Img).click();
		
	}
	public static void NavigateToday()
	{
		driver.navigate().back();
	}
	

}
