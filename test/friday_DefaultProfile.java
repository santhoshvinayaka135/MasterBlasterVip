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

//https://btgmodel.cloud.testinsights.io/app/#!/model-engine/guid/eaf6f95c-c974-40fc-a0c1-c56ceddbbdd2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 126, profileId = 100181)
public class friday_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"friday","friday - Default Profile"})
    @TestModellerPath(guid = "542bdcfb-f576-4b26-8c9f-756879dc82d1")
    public void GoToUrlAssertUrlEnterDeparturestationEnterArrivalstationClickGoSubmittingthefor()
    {
        
        pages.friday _friday = new pages.friday(driver);
    TestModellerLogger.SetLastNodeGuid("805d6a7d-2754-4821-ada8-1360d028d849");
    _friday.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("29d33494-208b-46a4-8543-ac27f3a8b29e");
    _friday.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fec7bd67-501a-4e5e-b876-27feab3b19b7");
    _friday.Enter_Departure_station("heuston");
    

    TestModellerLogger.SetLastNodeGuid("1f1d291a-b3fc-4caf-830e-4f06d61b48c0");
    _friday.Enter_Arrival_station("greystones");
    

    TestModellerLogger.SetLastNodeGuid("4d78e4c3-df93-42a1-97f1-ce9bf39db794");
    _friday.Click__Go_Submitting_the_for();
    

    }

}