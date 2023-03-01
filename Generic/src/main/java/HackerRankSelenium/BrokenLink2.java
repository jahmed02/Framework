package HackerRankSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Optional;

public class BrokenLink2 {
    public static WebDriver driver = null;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jisan\\IdeaProjects\\FrameWork\\Generic\\driver\\chromedriver95.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links are " + links.size());

        for (int i=0; i< links.size();i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            verifyLinkActive(url);
        }
        driver.close();
    }

    public static void verifyLinkActive(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();

            if (httpURLConnect.getResponseCode() == 200) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
            if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) {


        }
    }

}
