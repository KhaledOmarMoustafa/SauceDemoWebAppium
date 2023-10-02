package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.*;

import java.net.MalformedURLException;

public class AppiumFirstClass {
    private final PreRequisites pre;
    private final Login l;
    private final AddItemsToTheCart add;
    private final EnterDetails enter;
    private final CreateOrder create;

    public AppiumFirstClass() {
        pre = new PreRequisites();
        l = new Login();
        add = new AddItemsToTheCart();
        enter = new EnterDetails();
        create = new CreateOrder();
    }

    @Given("user opens the browser and go to the website")
    public void openBrowser() throws MalformedURLException, InterruptedException {
        pre.openBrowser();

    }

    @When("user enters login credentials")
    public void login () throws InterruptedException {
        l.login();
    }


    @And("user add items to the cart")
    public void addItems() throws InterruptedException {
        add.addItems();
    }


    @And("user enter his address details")
    public void enterDetails() throws InterruptedException {
        enter.enterDetails();
    }


    @Then("user creates the order")
    public void createOrder() throws InterruptedException {
        create.createOrder();
    }


    @And("close the browser")
    public void closeBrowser() throws InterruptedException {
        pre.closeBrowser();
    }


}
