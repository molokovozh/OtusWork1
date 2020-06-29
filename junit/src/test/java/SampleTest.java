import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(SampleTest.class);

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("The driver is running");
    }
    @Test
    public void openPage() {
        driver.manage().window().maximize();
        driver.get("https://otus.ru/");
        System.out.println(driver.getTitle());
        logger.info("The page otus.ru is opened!");
    }

    @After
    public void setDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}