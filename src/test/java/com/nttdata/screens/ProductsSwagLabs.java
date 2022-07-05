package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductsSwagLabs extends PageObject {
    @AndroidFindBy(id="LOCALIZADOR DEL TITULO")
    private WebElement title;
    @AndroidFindBy(id="LOCALIZADOR DE LA LISTA DE ITEMS")
    private WebElement list_items;

    public String getTitle(){
        return  title.getText();
    }
    public String getList(){
        return list_items.getText();
    }
}
