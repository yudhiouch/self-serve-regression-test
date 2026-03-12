package step;

import dto.MainDto;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.AllArgsConstructor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

@AllArgsConstructor
public class LoginStep {
    private MainDto mainDto;

    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // These 3 arguments are the "Golden Trio" for CI environments
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Optional: set a window size to ensure elements are visible
        options.addArguments("--window-size=1920,1080");

        mainDto.setDriver(new ChromeDriver(options));
    }

    public void userOpenUrl(String url){
        mainDto.getDriver().get(url);
        mainDto.getDriver().manage().window().maximize();
    }

    public void validateStraitsxPageDisplayed(){

    }
}
