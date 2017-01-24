package com.demoqa.testing.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropPage {
    WebDriver driver;

    By defaulttag = By.xpath("//*[@id='ui-id-1']");

    By constrain = By.xpath("//*[@id='ui-id-2']");

    By cursorstyle = By.xpath("//*[@id='ui-id-3']");

    By events = By.xpath("//*[@id='ui-id-4']");

    By dragandsort = By.xpath("//*[@id='ui-id-5']");

    By dragsrc = By.xpath("//*[@id='draggableview']");
    By droptarget=By.xpath("//*[@id='droppableview']");

    public DropPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickDrag() {

        driver.findElement(dragsrc).click();

        return null;
    }
    public WebElement clickDrop() {

        driver.findElement(droptarget);

        return null;
    }
}
