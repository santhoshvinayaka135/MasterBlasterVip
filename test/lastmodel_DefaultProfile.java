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
@TestModellerSuite(id = 108, profileId = 100147)
public class lastmodel_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "d21f8d38-8d29-4cd0-9add-cc205d89f2b7")
    public void GoToUrlPositiveEnterUsernameNegativeEnterPasswordClickLoginunauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a650a833-8f1e-4aaf-8df1-509601aa5495");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("74006b53-140c-4cd2-bdf5-c15bd30327c7");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "780d2cee-babd-482f-a3e3-f8cc5958dea1")
    public void GoToUrlPositiveEnterUsernameNegativeEnterPasswordClickLoginauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a650a833-8f1e-4aaf-8df1-509601aa5495");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("74006b53-140c-4cd2-bdf5-c15bd30327c7");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "5dcaca65-0bdd-4949-be18-b60dd037e811")
    public void GoToUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginunauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a650a833-8f1e-4aaf-8df1-509601aa5495");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("9e08c0eb-3335-4fea-8736-ec868603e24d");
    _The_Internet.Enter_Password("SuperSecretPassword!");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"last model","last model - Default Profile"})
    @TestModellerPath(guid = "1514b197-0b3e-4e66-9823-ae391795399d")
    public void GoToUrlNegativeEnterUsernameNegativeEnterPasswordClickLoginunauthenticated()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("359b5e75-5b57-4442-b771-dbe27c398416");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("01128dda-766f-410e-870b-f85c6aac7806");
    _The_Internet.Enter_Username("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("74006b53-140c-4cd2-bdf5-c15bd30327c7");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("fd64ef94-75f8-4781-9d2f-694df84876f8");
    _The_Internet.Click__Login();
    

    }

}