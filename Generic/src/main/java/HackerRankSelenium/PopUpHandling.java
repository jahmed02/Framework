package HackerRankSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpHandling {

    @Test
    public void alertWindow() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jisan\\IdeaProjects\\FrameWork\\Generic\\driver\\chromedriver95.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='content']/button")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String print = alert.getText();

        System.out.println(print);
        alert.accept();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='content']/button")).click();
        Thread.sleep(3000);
        alert.dismiss();
        driver.close();
    }
}
