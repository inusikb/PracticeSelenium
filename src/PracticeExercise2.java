import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise2 {
    public static void main (String[] args){

        //Create a new instance of Chrome driver (Launch Chrome browser)
        System.setProperty("webdriver.chrome.driver", "/Users/innabilous/Downloads/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open Wiki website
        String url = "https://en.wikipedia.org";
        driver.get(url);

        //Click on Help link
        driver.findElement(By.linkText("Help")).click();

        //Go back to Home page
        driver.navigate().back();

        //Go forward to Help page
        driver.navigate().forward();

        //Go back to Home page
        driver.navigate().to(url);

        //Refresh browser
        driver.navigate().refresh();

        //Quite browser
        driver.quit();

        System.out.println("First Change");

    }
}
