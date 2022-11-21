import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainTest {
    protected WebDriver driver;
    Base base;

    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://useinsider.com/");
        Thread.sleep(2500);
        base = new Base(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
