package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    // using the Parameters annotation to call any url we want
    @Parameters({"url"})  // parameters are only uses for xml runner files

    // TestNG annotation of beforemethod, will run before executing the test cases
    @BeforeMethod
    public void setUp(String url) {
        // path setup for chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jisan\\IdeaProjects\\FrameWork\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        // implicit wait of 10 sec
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //go to the parameter based website
        driver.get(url);


        /*//other url methods
        driver.navigate().to(url);   // alternate of driver.get() to launch a website
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("");   // string */


        // maximizing the opening window by using selenium action class
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void cleanUp() {
        driver.close();

        // driver.quit();            // for closing all the windows running for tests
    }

    // generic click method for all modules
    public void clickOnWebElement(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).clear();
        } catch (Exception ex1) {
            try {
                driver.findElement(By.id(locator)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.className(locator)).clear();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).click();
                }
            }
        }
    }

    //generic typing method for all modules
    public void typeOnWebElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }catch (Exception ex1){
            try {
                driver.findElement(By.id(locator)).sendKeys(value);
            }catch (Exception ex2) {
                try {
                    driver.findElement(By.className(locator)).sendKeys(value);
                }catch (Exception ex3){
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                }
            }
        }
    }

    //generic type and hit enter method for all modules
    public void typeOnWebElementAndEnter(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex1) {
            try {
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex2) {
                try {
                    driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
                }catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }

    //generic clear method for all modules
    public void clearInputField(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).clear();
        }catch (Exception ex1) {
            try {
                driver.findElement(By.id(locator)).clear();
            }catch (Exception ex2) {
                try {
                driver.findElement(By.className(locator)).clear();
            }catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).clear();
                }
            }
        }
    }


}
