import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Login {
    @Test
    public void open_url(){
        WebDriver Driver;
        String baseurl = "http://www.saucedemo.com/";
        WebDriverManager.chromedriver().setup();
        Driver = new ChromeDriver();
        Driver.get(baseurl);
    }
}
