import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPage {
    private WebDriver driver;

    private final By locationsText = By.xpath("//section/div/div/div/div[1]/h3");
    private final By teamsText = By.xpath("//div[2]/div/div/div/div/div/div/div/section/div/div/div[1]/h3");
    private final By lifeText = By.xpath("//section[4]/div/div/div/div/div/div[1]/div/h2");

    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    // to check Career page, its Locations, Teams and Life at Insider blocks

    public String getLocationsText() {
        WebElement LocationsText = driver.findElement(locationsText);
        return LocationsText.getText();
    }

    public String getTeamsText() {
        WebElement TeamsText = driver.findElement(teamsText);
        return TeamsText.getText();
    }

    public String getLifeText() {
        WebElement LifeText = driver.findElement(lifeText);
        return LifeText.getText();
    }

//    public void clickAllTeams() {
//        driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary rounded text-medium mt-5 mx-auto py-3 loadmore']")).click();
//    }
}
