package org.example;

import org.openqa.selenium.By;

public class Login {
    PreRequisites pre = new PreRequisites();
    public void login() throws InterruptedException {
        pre.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText")).sendKeys("standard_user");
        pre.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")).sendKeys("secret_sauce");
        pre.driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(3000);

    }
}
