package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class PreRequisites {
    static protected AndroidDriver driver;
    static protected WebDriverWait wait ;
    public void openBrowser() throws MalformedURLException, InterruptedException {

        UiAutomator2Options ai = new UiAutomator2Options().setUdid("emulator-5554");
        ai.setCapability("appPackage", "com.android.chrome");
        ai.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        WebDriverManager.chromedriver().setup();
        ai.setCapability("chromedriverExecutable", WebDriverManager.chromedriver().getDownloadedDriverPath());
        ai.setCapability("webdriver.chrome.driver.autoDownload", "true");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), ai);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.Button\n")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]\n")).click();

        //Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.chrome:id/negative_button"))).click();
       // driver.findElement(By.id("com.android.chrome:id/negative_button")).click();
        Thread.sleep(5000);

    }
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
