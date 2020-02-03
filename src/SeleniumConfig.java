import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumConfig {

    public static void main (String[] args){

        //Create a new instance of Chrome driver (Launch Chrome browser)
        System.setProperty("webdriver.chrome.driver", "/Users/innabilous/Downloads/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Storing url in String variable
        String baseUrl = "https://www.facebook.com/";

        //Open Facebook page
        driver.get(baseUrl);

        //Open Facebook page
        driver.navigate().to(baseUrl);


        //Close all related windows and kill the session
        driver.quit();


    }
}
