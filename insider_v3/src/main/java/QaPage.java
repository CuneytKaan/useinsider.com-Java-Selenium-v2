import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QaPage {
    private WebDriver driver;

    private final By qaJobs = By.xpath("//a[@class='btn btn-outline-secondary rounded text-medium mt-2 py-3 px-lg-5 w-100 w-md-50']");
    private final By filterLocation = By.id("select2-filter-by-location-container");
    private final By filterIstanbul = By.xpath("//form/div[1]/select/option[6]");
    private final By filterDepartment = By.id("select2-filter-by-department-container");
    private final By filterQualityAssurance = By.xpath("//form/div[2]/select/option[17]");
    private final By visibleApply = By.xpath("//section[3]/div/div/div[2]/div[2]/div");
    private final By applyJob = By.xpath("//*[@id=\"jobs-list\"]/div[2]/div/a");

    public QaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void allQAjobs() {
        WebElement AllQAJobs = driver.findElement(qaJobs);
        AllQAJobs.click();
    }

    // filtering the location and department

    public void filterLocation() {
        WebElement FilterLocation = driver.findElement(filterLocation);
        FilterLocation.click();
        WebElement FilterIstanbul = driver.findElement(filterIstanbul);
        FilterIstanbul.click();
    }

    public void filterDepartment() {
        WebElement FilterDepartment = driver.findElement(filterDepartment);
        FilterDepartment.click();
        WebElement FilterQualityAssurance = driver.findElement(filterQualityAssurance);
        FilterQualityAssurance.click();
    }

    public void applyJob() throws InterruptedException {
        WebElement VisibleApply = driver.findElement(visibleApply);
        VisibleApply.click();
        Thread.sleep(2000);
        WebElement ApplyJob = driver.findElement(applyJob);
        Thread.sleep(2000);
        driver.get(ApplyJob.getAttribute("href"));
    }
}
