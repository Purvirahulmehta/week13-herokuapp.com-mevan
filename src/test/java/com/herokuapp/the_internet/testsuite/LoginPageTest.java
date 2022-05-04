package com.herokuapp.the_internet.testsuite;

import com.herokuapp.the_internet.pages.Login;
import com.herokuapp.the_internet.pages.WrongPassWord;
import com.herokuapp.the_internet.pages.WrongUserName;
import com.herokuapp.the_internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
Login login=new Login();
WrongUserName wrongUserName=new WrongUserName();
WrongPassWord wrongPassWord=new WrongPassWord();
@Test
    public void userSholdLoginSuccessfullyWithValidCredentials() throws InterruptedException {
    login.username("tomsmith");
    login.password("SuperSecretPassword!");
    login.clickOnLogin();
    Thread.sleep(1000);
    String expectedMessage="Secure Area";
    String actualMessage=login.verifytheMessage();
    Assert.assertEquals(actualMessage,expectedMessage,"Page not found");

}
@Test
    public void verifyTheUsernameErrorMessage() throws InterruptedException {
    login.username("tomsmith1");
    login.password("SuperSecretPassword!");
    login.clickOnLogin();
    Thread.sleep(1000);
    String expectedMessage="Your username is invalid!\n" +
            "×";
    String actualMessage=wrongUserName.errorMessage1();
    Assert.assertEquals(actualMessage,expectedMessage,"Page not found");

}
@Test
    public void verifyThePasswordErrorMessage() throws InterruptedException {
    login.username("tomsmith");
    login.password("SuperSecretPassword");
    login.clickOnLogin();
    Thread.sleep(1000);
    String expectedMessage="Your password is invalid!\n" +
            "×";
    String actualMessage=wrongPassWord.errorMessage2();
    Assert.assertEquals(actualMessage,expectedMessage,"Page not found");

}
}
