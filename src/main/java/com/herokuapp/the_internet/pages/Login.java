package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class Login extends Utility {
    By UsernameLink=By.xpath("//input[@id='username']");
    By PasswordLink=By.xpath("//input[@id='password']");
    By LoginLink=By.xpath("//i[contains(text(),'Login')]");
    By SecureMessage=By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");

    public void username(String textUserName){
        sendTextToElement(UsernameLink,textUserName);

    }
    public void password(String textPassword){
        sendTextToElement(PasswordLink,textPassword);
    }
    public void clickOnLogin(){
        clickOnElement(LoginLink);
    }
    public String verifytheMessage(){
        return getTextFromElement(SecureMessage);
    }

}
