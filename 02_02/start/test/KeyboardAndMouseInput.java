import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\raybe\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");


        WebElement name = ((ChromeDriver) driver).findElementById("name");
        name.click();
        name.sendKeys("Raymond Beecham");

        WebElement button = ((ChromeDriver) driver).findElementById("button");
        button.click();


        driver.quit();
    }
}
