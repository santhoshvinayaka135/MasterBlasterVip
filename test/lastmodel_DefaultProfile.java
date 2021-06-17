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
@TestModellerSuite(id = 107, profileId = 100147)
public class lastmodel_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "2e22700d-b002-4f42-addd-56a1eeea056a")
    public void GoToUrlAssertUrlPositiveEnterUsernameNegativeEnterPasswordClickLoginunauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d0664d58-3c9f-4322-861e-fc652affde22");
    _The_Internet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a650a833-8f1e-4aaf-8df1-509601aa5495");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("74006b53-140c-4cd2-bdf5-c15bd30327c7");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "f7aad7fd-45d7-424b-8282-fc3fcdda3328")
    public void GoToUrlAssertUrlPositiveEnterUsernameNegativeEnterPasswordClickLoginauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d0664d58-3c9f-4322-861e-fc652affde22");
    _The_Internet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a650a833-8f1e-4aaf-8df1-509601aa5495");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("74006b53-140c-4cd2-bdf5-c15bd30327c7");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "da328f0a-b875-4ced-aa7c-dcc10df7ff59")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginunauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d0664d58-3c9f-4322-861e-fc652affde22");
    _The_Internet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a650a833-8f1e-4aaf-8df1-509601aa5495");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("9e08c0eb-3335-4fea-8736-ec868603e24d");
    _The_Internet.Enter_Password("SuperSecretPassword!");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "df01d856-dfe0-4c8b-920a-7c0ca26c3564")
    public void GoToUrlAssertUrlNegativeEnterUsernameNegativeEnterPasswordClickLoginunauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d0664d58-3c9f-4322-861e-fc652affde22");
    _The_Internet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("01128dda-766f-410e-870b-f85c6aac7806");
    _The_Internet.Enter_Username("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("74006b53-140c-4cd2-bdf5-c15bd30327c7");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

}