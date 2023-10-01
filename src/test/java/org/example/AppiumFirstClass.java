package org.example;

        import org.testng.annotations.Test;
        import java.net.MalformedURLException;

public class AppiumFirstClass {
    private  PreRequisites pre ;
    private Login l ;
    private AddItemsToTheCart add ;
    private EnterDetails enter;
    private CreateOrder create;

    public AppiumFirstClass() {
        pre = new PreRequisites();
        l = new Login();
        add = new AddItemsToTheCart();
        enter = new EnterDetails();
        create = new CreateOrder();
    }

    @Test(priority = 1)
    public void openBrowser() throws MalformedURLException, InterruptedException {
        pre.openBrowser();

    }
    @Test(priority = 2)
    public void login () throws InterruptedException {
        l.login();
    }
    @Test(priority = 3)
    public void addItems() throws InterruptedException {
        add.addItems();
    }
    @Test(priority = 4)
    public void enterDetails() throws InterruptedException {
        enter.enterDetails();
    }
    @Test(priority = 5)
    public void createOrder() throws InterruptedException {
        create.createOrder();
    }
    @Test(priority = 6)
    public void closeBrowser() throws InterruptedException {
        pre.closeBrowser();
    }


}
