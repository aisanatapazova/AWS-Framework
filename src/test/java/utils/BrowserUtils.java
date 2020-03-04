package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {
    public static void switchWindow(WebDriver driver, String targetTitle) {
        Set<String> allWindows = driver.getWindowHandles();
        if (!driver.getTitle().equals(targetTitle)) {
            for (String window : allWindows) {
                driver.switchTo().window(window);
                if (driver.getTitle().equals(targetTitle)) {
                    break;
                }
            }

        }
    }
}
