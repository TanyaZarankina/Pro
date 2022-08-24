package interactingWithComponents;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileUploadField= driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("file-to-upload.png");//this file need to be in intellij
        driver.quit();

    }
}
