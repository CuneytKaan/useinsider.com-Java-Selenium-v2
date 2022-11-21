import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CareerPageTest extends MainTest {

    @Test
    public void careerPage() throws InterruptedException {

        Assertions.assertEquals("https://useinsider.com/", base.getURL(), "Could not open homepage!");
        base.homePage().cookiesAccepted();
        base.homePage().moreDropDown();
        Thread.sleep(1000);
        base.homePage().careersPage();
        Assertions.assertEquals("https://useinsider.com/careers/", base.getURL(), "Could not open Careers Page");

        Thread.sleep(1000);

        // asserting the texts which I got from Careers Page to see if they match or not

        Assertions.assertEquals("Our Locations", base.careersPage().getLocationsText());
        Assertions.assertEquals("Find your calling", base.careersPage().getTeamsText());
        Assertions.assertEquals("Life at Insider", base.careersPage().getLifeText());

        Thread.sleep(1000);
        base.allTeamsPage();
//      base.careersPage().clickAllTeams();
        Thread.sleep(1000);
        base.qaPage().allQAjobs();
        Thread.sleep(1000);
        base.qaPage().filterLocation();
        Thread.sleep(1000);
        base.qaPage().filterDepartment();
        Thread.sleep(1000);
        base.qaPage().applyJob();
        Thread.sleep(1000);
        base.jobPage().applyJobForm();
    }
}
