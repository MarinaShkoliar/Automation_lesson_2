import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskA {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement fieldlogin = driver.findElement(By.id("email"));
        fieldlogin.sendKeys("webinar.test@gmail.com");
        WebElement fieldpass = driver.findElement(By.id("passwd"));
        fieldpass.sendKeys("Xcg7299bnSmMuRLp9ITw");
        fieldpass.submit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement fieldicon = driver.findElement(By.cssSelector("img[alt]"));
        fieldicon.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement fieldout = driver.findElement(By.id("header_logout"));
        fieldout.click();
    }

    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", TaskB.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }
}
