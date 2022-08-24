import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

    @Test
    public void logTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tumblr.com/explore/trending?source=homepage_explore");
        driver.findElement(By.xpath("//a[@href = '/login']")).click();
        driver.findElement(By.xpath("//button[@class = 'dKGjO']")).click();
        driver.findElement(By.xpath("//input[@class = 'sL4Tf']")).sendKeys("fhfhemail.com");
        driver.findElement(By.xpath("//button[@aria-label = 'Next']")).click();
        String errorMessage = driver.findElement(By.xpath("//div[@class = 'a0A37 hAkP2']")).getText();
        Assert.assertEquals(errorMessage, "That's not a valid email address. Please try again.");
        driver.quit(); 
    }
}
