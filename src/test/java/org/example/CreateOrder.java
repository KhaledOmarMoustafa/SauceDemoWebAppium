package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CreateOrder {
    PreRequisites pre = new PreRequisites();
    public void createOrder() throws InterruptedException {

        String firstItem = pre.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.TextView[2]\n")).getText();
        firstItem = firstItem.replaceAll("[^\\d.]", "");
        double first = Double.parseDouble(firstItem);

        String secondItem = pre.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.TextView[2]\n")).getText();
        secondItem = secondItem.replaceAll("[^\\d.]", "");
        double second = Double.parseDouble(secondItem);

        String thirdItem = pre.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.TextView[2]\n")).getText();
        thirdItem=thirdItem.replaceAll("[^\\d.]", "");
        double third= Double.parseDouble(thirdItem);

        String totalwithoutTaxes = pre.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView[11]\n")).getText();
        totalwithoutTaxes = totalwithoutTaxes.replaceAll("[^\\d.]", "");
        double totalwithout = Double.parseDouble(totalwithoutTaxes);

        String taxes = pre.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView[12]\n")).getText();
        taxes = taxes.replaceAll("[^\\d.]", "");
        double onlyTaxes = Double.parseDouble(taxes);

        String totalwithtaxes = pre.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView[13]\n")).getText();
        totalwithtaxes = totalwithtaxes.replaceAll("[^\\d.]", "");
        double totaltaxes = Double.parseDouble(totalwithtaxes);

        double totalamount = first+second+third;

        Assert.assertEquals(totalamount , totalwithout);

        double taxxx = totalamount * 0.08;
        double taxx =Double.parseDouble(String.format("%,.2f", taxxx));
        Assert.assertEquals(taxx , onlyTaxes);

        double totalAmountWithTaxes = totalamount + onlyTaxes ;
        double totalamountwithtaxes = Double.parseDouble(String.format("%,.2f", totalAmountWithTaxes));
        Assert.assertEquals(totalamountwithtaxes,totaltaxes);


        pre.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button[2]\n")).click();

        Thread.sleep(2000);


        pre.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button\n")).click();

    }
}
