package ru.stqa.pft.addressbook;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ContactCreationTests extends TestBase{


    @Test
    public void testContactCreation() {
        app.gotoAddNewPage();
        app.initContactCreation();
        app.fillContactForm(new ContactData("Firstname", "Lastname", "nickname", "Title", "Company", "Address", "1234567890", "0987654321", "test@test.com"));
        app.submitContactCreation();
        app.gotoHomePage();
    }

}
