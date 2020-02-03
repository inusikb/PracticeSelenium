import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise1 {
    public static void main (String[] args){

        //Create a new instance of Chrome driver (Launch Chrome browser)
        System.setProperty("webdriver.chrome.driver", "/Users/innabilous/Downloads/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Launch Facebook website
        String url = "https://www.economist.com/";
        driver.get(url);

        //Storing title name in  String variable
        String title = driver.getTitle();

        //Storing title length in int variable
        int titleLength = driver.getTitle().length();

        //Print Title and Title length on Console
        System.out.println("Title of the page is: " + title);
        System.out.println("Length of the title is: " + titleLength);

        //Storing URL in String variable
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)){
            System.out.println("Verification successful - Correct url is opened");
        } else{
            System.out.println("Verification failed - an incorrect url is opened");
            System.out.println("Actual url is: " + actualUrl);
        }

        //Storing page source in String variable
        String pageSouce = driver.getPageSource();

        //Storing length of the page source in int variable
        int pageSourceLength = driver.getPageSource().length();

        //Print length of the page source on console
        System.out.println("Total length of the page source is: " + pageSourceLength);

        //Quite browser
        driver.quit();

    }
}
