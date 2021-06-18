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
@TestModellerSuite(id = 130, profileId = 100181)
public class friday_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"friday","friday - Default Profile"})
    @TestModellerPath(guid = "546ecd9a-43c5-41f4-a507-56cb12accca4")
    public void GoToUrlAssertUrlEnterDeparturestationEnterArrivalstationClickTypeSinglePositiveEnterOutboundDa()
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
    

pages.rest _rest = new pages.rest(driver);
    TestModellerLogger.SetLastNodeGuid("186bc582-193b-4501-8aca-b1a892246b72");
    _rest.Click_TypeSingle();
    

    TestModellerLogger.SetLastNodeGuid("e4e564f9-53c4-48a8-a547-f45c8458686d");
    _rest.Enter_Outbound_Date("44365");
    

    TestModellerLogger.SetLastNodeGuid("9100aa06-a1b0-46e8-a972-78351df130de");
    _rest.Select_Outbound_Time("Now");
    

    TestModellerLogger.SetLastNodeGuid("4d78e4c3-df93-42a1-97f1-ce9bf39db794");
    _friday.Click__Go_Submitting_the_for();
    

    }

    @Test  (groups= {"friday","friday - Default Profile"})
    @TestModellerPath(guid = "4b2124cb-60ff-45bd-a310-3dc0ae85639c")
    public void GoToUrlAssertUrlEnterDeparturestationEnterArrivalstationClickTypeSinglePositiveEnterOutboundDa1()
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
    

pages.rest _rest = new pages.rest(driver);
    TestModellerLogger.SetLastNodeGuid("186bc582-193b-4501-8aca-b1a892246b72");
    _rest.Click_TypeSingle();
    

    TestModellerLogger.SetLastNodeGuid("e4e564f9-53c4-48a8-a547-f45c8458686d");
    _rest.Enter_Outbound_Date("44365");
    

    TestModellerLogger.SetLastNodeGuid("9100aa06-a1b0-46e8-a972-78351df130de");
    _rest.Select_Outbound_Time("All Day");
    

    TestModellerLogger.SetLastNodeGuid("4d78e4c3-df93-42a1-97f1-ce9bf39db794");
    _friday.Click__Go_Submitting_the_for();
    

    }

    @Test  (groups= {"friday","friday - Default Profile"})
    @TestModellerPath(guid = "3b928c51-5bca-42c8-9375-93f856d495fa")
    public void GoToUrlAssertUrlEnterDeparturestationEnterArrivalstationClickTypeSinglePositiveEnterOutboundDa2()
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
    

pages.rest _rest = new pages.rest(driver);
    TestModellerLogger.SetLastNodeGuid("186bc582-193b-4501-8aca-b1a892246b72");
    _rest.Click_TypeSingle();
    

    TestModellerLogger.SetLastNodeGuid("e4e564f9-53c4-48a8-a547-f45c8458686d");
    _rest.Enter_Outbound_Date("44365");
    

    TestModellerLogger.SetLastNodeGuid("9100aa06-a1b0-46e8-a972-78351df130de");
    _rest.Select_Outbound_Time("Before 10AM");
    

    TestModellerLogger.SetLastNodeGuid("4d78e4c3-df93-42a1-97f1-ce9bf39db794");
    _friday.Click__Go_Submitting_the_for();
    

    }

    @Test  (groups= {"friday","friday - Default Profile"})
    @TestModellerPath(guid = "23db69f6-5547-467b-adeb-a654a9aba6d4")
    public void GoToUrlAssertUrlEnterDeparturestationEnterArrivalstationClickTypeSinglePositiveEnterOutboundDa3()
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
    

pages.rest _rest = new pages.rest(driver);
    TestModellerLogger.SetLastNodeGuid("186bc582-193b-4501-8aca-b1a892246b72");
    _rest.Click_TypeSingle();
    

    TestModellerLogger.SetLastNodeGuid("e4e564f9-53c4-48a8-a547-f45c8458686d");
    _rest.Enter_Outbound_Date("44365");
    

    TestModellerLogger.SetLastNodeGuid("9100aa06-a1b0-46e8-a972-78351df130de");
    _rest.Select_Outbound_Time("9AM to 3PM");
    

    TestModellerLogger.SetLastNodeGuid("4d78e4c3-df93-42a1-97f1-ce9bf39db794");
    _friday.Click__Go_Submitting_the_for();
    

    }

    @Test  (groups= {"friday","friday - Default Profile"})
    @TestModellerPath(guid = "4afb5e01-2742-40b0-acdd-197c496fc0bd")
    public void GoToUrlAssertUrlEnterDeparturestationEnterArrivalstationClickTypeSinglePositiveEnterOutboundDa4()
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
    

pages.rest _rest = new pages.rest(driver);
    TestModellerLogger.SetLastNodeGuid("186bc582-193b-4501-8aca-b1a892246b72");
    _rest.Click_TypeSingle();
    

    TestModellerLogger.SetLastNodeGuid("e4e564f9-53c4-48a8-a547-f45c8458686d");
    _rest.Enter_Outbound_Date("44365");
    

    TestModellerLogger.SetLastNodeGuid("9100aa06-a1b0-46e8-a972-78351df130de");
    _rest.Select_Outbound_Time("2PM to 8PM");
    

    TestModellerLogger.SetLastNodeGuid("4d78e4c3-df93-42a1-97f1-ce9bf39db794");
    _friday.Click__Go_Submitting_the_for();
    

    }

    @Test  (groups= {"friday","friday - Default Profile"})
    @TestModellerPath(guid = "672a0bcf-8d49-4fff-8c1a-78fee190cda2")
    public void GoToUrlAssertUrlEnterDeparturestationEnterArrivalstationClickTypeSinglePositiveEnterOutboundDa5()
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
    

pages.rest _rest = new pages.rest(driver);
    TestModellerLogger.SetLastNodeGuid("186bc582-193b-4501-8aca-b1a892246b72");
    _rest.Click_TypeSingle();
    

    TestModellerLogger.SetLastNodeGuid("e4e564f9-53c4-48a8-a547-f45c8458686d");
    _rest.Enter_Outbound_Date("44365");
    

    TestModellerLogger.SetLastNodeGuid("9100aa06-a1b0-46e8-a972-78351df130de");
    _rest.Select_Outbound_Time("6PM to 12AM");
    

    TestModellerLogger.SetLastNodeGuid("4d78e4c3-df93-42a1-97f1-ce9bf39db794");
    _friday.Click__Go_Submitting_the_for();
    

    }

    @Test  (groups= {"friday","friday - Default Profile"})
    @TestModellerPath(guid = "c57d9541-6ef9-4089-ac22-26015fdacbd3")
    public void GoToUrlAssertUrlEnterDeparturestationEnterArrivalstationClickTypeSinglePositiveEnterOutboundDa6()
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
    

pages.rest _rest = new pages.rest(driver);
    TestModellerLogger.SetLastNodeGuid("186bc582-193b-4501-8aca-b1a892246b72");
    _rest.Click_TypeSingle();
    

    TestModellerLogger.SetLastNodeGuid("e4e564f9-53c4-48a8-a547-f45c8458686d");
    _rest.Enter_Outbound_Date("2020-09-03 23:11:18");
    

    TestModellerLogger.SetLastNodeGuid("9100aa06-a1b0-46e8-a972-78351df130de");
    _rest.Select_Outbound_Time("Now");
    

    TestModellerLogger.SetLastNodeGuid("4d78e4c3-df93-42a1-97f1-ce9bf39db794");
    _friday.Click__Go_Submitting_the_for();
    

    }

    @Test  (groups= {"friday","friday - Default Profile"})
    @TestModellerPath(guid = "3c6438fc-73f2-4390-bfe4-fac5b28194c2")
    public void GoToUrlAssertUrlEnterDeparturestationEnterArrivalstationClickTypeSinglePositiveEnterOutboundDa7()
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
    

pages.rest _rest = new pages.rest(driver);
    TestModellerLogger.SetLastNodeGuid("186bc582-193b-4501-8aca-b1a892246b72");
    _rest.Click_TypeSingle();
    

    TestModellerLogger.SetLastNodeGuid("e4e564f9-53c4-48a8-a547-f45c8458686d");
    _rest.Enter_Outbound_Date("2022-05-21 04:52:17");
    

    TestModellerLogger.SetLastNodeGuid("9100aa06-a1b0-46e8-a972-78351df130de");
    _rest.Select_Outbound_Time("Now");
    

    TestModellerLogger.SetLastNodeGuid("4d78e4c3-df93-42a1-97f1-ce9bf39db794");
    _friday.Click__Go_Submitting_the_for();
    

    }

    @Test  (groups= {"friday","friday - Default Profile"})
    @TestModellerPath(guid = "55aab0d5-40c6-4e37-ac17-c41bd145a4b8")
    public void GoToUrlAssertUrlEnterDeparturestationEnterArrivalstationClickTypeSingleNegativeEnterOutboundDa()
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
    

pages.rest _rest = new pages.rest(driver);
    TestModellerLogger.SetLastNodeGuid("186bc582-193b-4501-8aca-b1a892246b72");
    _rest.Click_TypeSingle();
    

    TestModellerLogger.SetLastNodeGuid("90c47293-deed-44e4-82f1-2c21e24dcd24");
    _rest.Enter_Outbound_Date("23/");
    

    TestModellerLogger.SetLastNodeGuid("61313e94-dd65-41ef-9149-ead3090738ca");
    _friday.Click__Go_Submitting_the_for();
    

    }

}