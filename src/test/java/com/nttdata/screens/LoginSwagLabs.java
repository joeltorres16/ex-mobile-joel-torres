package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginSwagLabs extends PageObject {
    @AndroidFindBy(id="LOCALIZADOR DEL EDITTEXT USERNAME")
    private WebElement touch_input_user;
    @AndroidFindBy(id="LOCALIZADOR DEL EDITTEXT")
    private WebElement send_input_user;
    @AndroidFindBy(id="LOCALIZADOR DEL PASSWORD")
    private WebElement touch_input_pass;
    @AndroidFindBy(id="LOCALIZADOR DEL EDITTEXT PASSWORD")
    private WebElement send_input_pass;
    @AndroidFindBy(id="BOTON LOGIN")
    private WebElement btn_login;
    @AndroidFindBy(id= "LOCALIZADOR DEL MENSAJE DE ERROR")
    private WebElement message;

    public void inputUser(String user){
        touch_input_user.click();
        send_input_user.sendKeys(user);
    }
    public void InputPass(String pass){
        touch_input_pass.click();
        send_input_pass.sendKeys(pass);
    }
    public void clickLogin(){
        btn_login.click();
    }
    public String errorMessage(){
        return message.getText();
    }

}
