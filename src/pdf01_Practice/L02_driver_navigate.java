package pdf01_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class L02_driver_navigate {
    public static void main(String[] args) {

        // 1. Yeni bir Class olusturalim.C05_NavigationMethods

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // 2. Youtube ana sayfasina gidelim . https://www.youtube.com/

        driver.get(" https://www.youtube.com/");

       // 3. Testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/

        driver.navigate().to("https://www.testotomasyonu.com/");
       // 4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

       // 5. Yeniden testotomasyonu sayfasina gidelim

        driver.navigate().forward();

       // 6. Sayfayi Refresh(yenile) yapalim

        driver.navigate().refresh();
       // 7. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
}
}
