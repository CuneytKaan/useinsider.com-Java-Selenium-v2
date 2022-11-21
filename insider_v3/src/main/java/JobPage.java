import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobPage {
    private WebDriver driver;

    private final By applyJobForm = By.xpath("//a[@class='postings-btn template-btn-submit shamrock']");

    public JobPage(WebDriver driver) {
        this.driver = driver;
    }

    public void applyJobForm() {
        WebElement ApplyJobForm = driver.findElement(applyJobForm);
        ApplyJobForm.click();
    }
}
