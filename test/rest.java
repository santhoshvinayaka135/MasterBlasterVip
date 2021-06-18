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

// https://btgmodel.cloud.testinsights.io/app/#!/module-collection/guid/f64b74c0-94ab-469c-9e70-021f7bd72c50
@TestModellerModule(guid = "f64b74c0-94ab-469c-9e70-021f7bd72c50")
public class rest extends BasePage
{
	public rest (WebDriver driver)
	{
		super(driver);
	}


	
	private By TypeSingleElem = By.xpath("//LABEL[@for='f02_single']");

	private By Outbound_DateElem = By.xpath("//label[normalize-space()= 'Outbound Date']/../input");

	private By Outbound_TimeElem = By.xpath("//label[normalize-space()= 'Outbound Time']/../select");


	
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
 	 * Click Type:Single
     * @name Click Type:Single
     */
	public void Click_TypeSingle()
	{
        
		WebElement elem = getWebElement(TypeSingleElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TypeSingle", "Click_TypeSingle failed. Unable to locate object: " + TypeSingleElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TypeSingle", "Click_TypeSingle failed. Unable to locate object: " + TypeSingleElem.toString());

			Assert.fail("Unable to locate object: " + TypeSingleElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_TypeSingle");

		TestModellerLogger.PassStep(m_Driver, "Click_TypeSingle");
	}

      
	/**
 	 * Enter Outbound Date
     * @name Enter Outbound Date
     */
 	public void Enter_Outbound_Date(String Outbound_Date)
 	{
 	    
 		WebElement elem = getWebElement(Outbound_DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Outbound_Date", "Enter_Outbound_Date failed. Unable to locate object: " + Outbound_DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Outbound_Date", "Enter_Outbound_Date failed. Unable to locate object: " + Outbound_DateElem.toString());

 			Assert.fail("Unable to locate object: " + Outbound_DateElem.toString());
         }

 		elem.sendKeys(Outbound_Date);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Outbound_Date " + Outbound_Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Outbound_Date " + Outbound_Date);
 	}

    
	/**
 	 * Select Outbound Time
     * @name Select Outbound Time
     */
    public void Select_Outbound_Time(String Outbound_Time)
 	{
 	    
 		WebElement elem = getWebElement(Outbound_TimeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Outbound_Time", "Select_Outbound_Time failed. Unable to locate object: " + Outbound_TimeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Outbound_Time", "Select_Outbound_Time failed. Unable to locate object: " + Outbound_TimeElem.toString());

 			Assert.fail("Unable to locate object: " + Outbound_TimeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Outbound_Time);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Outbound_Time " + Outbound_Time);

 		TestModellerLogger.PassStep(m_Driver, "Select_Outbound_Time " + Outbound_Time);
 	}
}