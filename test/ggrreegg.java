package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://btgmodel.cloud.testinsights.io/app/#!/module-collection/guid/03ec5831-fc34-404b-96f2-bd7ca0c85dd7
@TestModellerModule(guid = "03ec5831-fc34-404b-96f2-bd7ca0c85dd7")
public class ggrreegg extends BasePage
{
	public ggrreegg (WebDriver driver)
	{
		super(driver);
	}


	
	private By Departure_stationElem = By.xpath("//label[normalize-space()= 'Departure station']/../input[1]");

	private By Arrival_stationElem = By.xpath("//label[normalize-space()= 'Arrival station']/../input");

	private By _Go_Submitting_the_forElem = By.xpath("//BUTTON[@data-f02-name='submit']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://www.irishrail.ie/en-ie/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://www.irishrail.ie/en-ie/");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://www.irishrail.ie/en-ie/");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://www.irishrail.ie/en-ie/";

        if (!currentUrl.equals("https://www.irishrail.ie/en-ie/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Departure station
     * @name Enter Departure station
     */
 	public void Enter_Departure_station(String Departure_station)
 	{
 	    
 		WebElement elem = getWebElement(Departure_stationElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Departure_station", "Enter_Departure_station failed. Unable to locate object: " + Departure_stationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Departure_station", "Enter_Departure_station failed. Unable to locate object: " + Departure_stationElem.toString());

 			Assert.fail("Unable to locate object: " + Departure_stationElem.toString());
         }

 		elem.sendKeys(Departure_station);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Departure_station " + Departure_station);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Departure_station " + Departure_station);
 	}

      
	/**
 	 * Enter Arrival station
     * @name Enter Arrival station
     */
 	public void Enter_Arrival_station(String Arrival_station)
 	{
 	    
 		WebElement elem = getWebElement(Arrival_stationElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Arrival_station", "Enter_Arrival_station failed. Unable to locate object: " + Arrival_stationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Arrival_station", "Enter_Arrival_station failed. Unable to locate object: " + Arrival_stationElem.toString());

 			Assert.fail("Unable to locate object: " + Arrival_stationElem.toString());
         }

 		elem.sendKeys(Arrival_station);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Arrival_station " + Arrival_station);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Arrival_station " + Arrival_station);
 	}

     
	/**
 	 * Click  Go Submitting the for
     * @name Click  Go Submitting the for
     */
	public void Click__Go_Submitting_the_for()
	{
        
		WebElement elem = getWebElement(_Go_Submitting_the_forElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Go_Submitting_the_for", "Click__Go_Submitting_the_for failed. Unable to locate object: " + _Go_Submitting_the_forElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Go_Submitting_the_for", "Click__Go_Submitting_the_for failed. Unable to locate object: " + _Go_Submitting_the_forElem.toString());

			Assert.fail("Unable to locate object: " + _Go_Submitting_the_forElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Go_Submitting_the_for");

		TestModellerLogger.PassStep(m_Driver, "Click__Go_Submitting_the_for");
	}
}