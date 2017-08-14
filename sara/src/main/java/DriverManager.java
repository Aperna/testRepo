import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\katuk_000\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.ASOS.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public void CloseBrowser(){
        driver.quit();
    }



}
