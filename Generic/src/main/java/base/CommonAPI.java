package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    // using the Parameters annotation to call any url we want
    @Parameters({"url"})

    // TestNG annotation of beforemethod, will run before executing the test cases
    @BeforeMethod
    public void setUp(String url) {
        // path setup for chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jisan\\IdeaProjects\\AutoamtionFramework\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        // implicit wait of 10 sec
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //go to the parameter based website
        driver.get(url);

        // maximizing the opening window by using selenium action class
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
