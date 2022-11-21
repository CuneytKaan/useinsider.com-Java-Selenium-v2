import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
    private WebDriver driver;
    private HomePage homePage;
    private CareersPage careersPage;
    private QaPage qaPage;
    private JobPage jobPage;

    public Base(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
        careersPage = new CareersPage(driver);
        qaPage = new QaPage(driver);
        jobPage = new JobPage(driver);
    }

    public HomePage homePage() {    // To define the web-elements in their own pages, these methods are executed in here.
        return this.homePage;
    }

    public CareersPage careersPage() {
        return this.careersPage;
    }

    public QaPage qaPage() {
        return this.qaPage;
    }

    public JobPage jobPage() {
        return this.jobPage;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public void allTeamsPage() {
        driver.get("https://useinsider.com/careers/quality-assurance/");
    }
}
