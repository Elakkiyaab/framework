package com.demoqa.testing.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DraggablePage {
    WebDriver driver;

    By defaulttag = By.xpath("//*[@id='ui-id-1']");

    By constrain = By.xpath("//*[@id='ui-id-2']");

    By cursorstyle = By.xpath("//*[@id='ui-id-3']");

    By events = By.xpath("//*[@id='ui-id-4']");

    By dragandsort = By.xpath("//*[@id='ui-id-5']");

    By dragmebtn = By.xpath("//*[@id='draggable']");

    By verticledrag = By.xpath("//*[@id='draggabl']/p");

    By horidrag = By.xpath("//*[@id='draggabl2']/p");

    By draginbox = By.xpath("//*[@id='draggabl3']/p");
    By draginparent = By.xpath("//*[@id='draggabl5']");


    public DraggablePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickDrag() {

      driver.findElement(dragmebtn).click();

        return null;
    }

    public void clickConstrain() {

        driver.findElement(constrain).click();

    }
}

