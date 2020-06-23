import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNoComp {

 public static WebDriver driver;

 public static void main(String[] args) {

   //System.setProperty("webdriver.chrome.driver", "/Users/rahul/Desktop/testing/chromedriver");
   WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demo.nopcommerce.com");
   driver.quit();




    }
}
