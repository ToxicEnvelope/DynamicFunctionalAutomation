package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                .replace("\\", "/").concat("/bin/chromedriver.exe"));

        driver = (WebDriver) new ChromeDriver();

    }


    public WebDriver getDriver() {return driver;}

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

