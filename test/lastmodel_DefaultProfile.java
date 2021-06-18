package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://btgmodel.cloud.testinsights.io/app/#!/model-engine/guid/9425dbd9-2222-48d0-8795-d0467db74518
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 109, profileId = 100147)
public class lastmodel_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "6fcb197d-508d-4f26-a339-ea2372e6b71d")
    public void GoToUrlAssertUrlPositiveEnterUsernameNegativeEnterPasswordClickLoginunauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

pages.ggrreegg _ggrreegg = new pages.ggrreegg(driver);
    TestModellerLogger.SetLastNodeGuid("e0768903-d941-481b-ba99-8fc7e833c0e0");
    _ggrreegg.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a650a833-8f1e-4aaf-8df1-509601aa5495");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("74006b53-140c-4cd2-bdf5-c15bd30327c7");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "c45d942f-a21b-44a5-a7ea-d1448d540b98")
    public void GoToUrlAssertUrlPositiveEnterUsernameNegativeEnterPasswordClickLoginauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

pages.ggrreegg _ggrreegg = new pages.ggrreegg(driver);
    TestModellerLogger.SetLastNodeGuid("e0768903-d941-481b-ba99-8fc7e833c0e0");
    _ggrreegg.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a650a833-8f1e-4aaf-8df1-509601aa5495");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("74006b53-140c-4cd2-bdf5-c15bd30327c7");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "5a081d8d-5845-4610-ad27-2473fcc7df81")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginunauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

pages.ggrreegg _ggrreegg = new pages.ggrreegg(driver);
    TestModellerLogger.SetLastNodeGuid("e0768903-d941-481b-ba99-8fc7e833c0e0");
    _ggrreegg.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a650a833-8f1e-4aaf-8df1-509601aa5495");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("9e08c0eb-3335-4fea-8736-ec868603e24d");
    _The_Internet.Enter_Password("SuperSecretPassword!");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "c0e6bcc2-6143-4468-9cfe-0aa6fd495b6a")
    public void GoToUrlAssertUrlNegativeEnterUsernameNegativeEnterPasswordClickLoginunauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

pages.ggrreegg _ggrreegg = new pages.ggrreegg(driver);
    TestModellerLogger.SetLastNodeGuid("e0768903-d941-481b-ba99-8fc7e833c0e0");
    _ggrreegg.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("01128dda-766f-410e-870b-f85c6aac7806");
    _The_Internet.Enter_Username("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("74006b53-140c-4cd2-bdf5-c15bd30327c7");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

}