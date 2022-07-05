package com.nttdata.steps;

import com.nttdata.screens.LoginSwagLabs;
import com.nttdata.screens.ProductsSwagLabs;
import net.thucydides.core.annotations.Step;

public class SwagLabsStep {
        LoginSwagLabs loginSwagLabs;
        ProductsSwagLabs productsSwagLabs;

    @Step("iniciar sesion")
    public void inputCredential(String user, String pass){

        loginSwagLabs.inputUser(user);
        loginSwagLabs.InputPass(pass);
        loginSwagLabs.clickLogin();
    }
    @Step("obtengo el titulo")
    public String title(){
       return productsSwagLabs.getTitle();
    }
    @Step("obtengo el tamaño de la lista")
    public String sizeList(){
        return productsSwagLabs.getList();
    }
    @Step("capturo mensahe de error")
    public String getTextError(){
        return loginSwagLabs.errorMessage();
    }
}
