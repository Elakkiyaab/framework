package com.demoqa.testing.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By login = By.linkText("Inloggen");

    By registration = By.linkText("Registration");

    By draggable = By.linkText("Draggable");

    By droppable = By.linkText("Droppable");

    By resizable = By.linkText("Resizable");

    By selectable = By.linkText("Selectable");

    By sortable = By.linkText("Sortable");

    By accordian = By.xpath("//*[@id='menu-item-144']/a");

    By autocomplete = By.xpath("//*[@id='menu-item-145']/a");
    By datepicker = By.xpath("//*[@id='menu-item-146']/a");
    By menu = By.xpath("//*[@id='menu-item-147']/a");
    By slider = By.xpath("//*[@id='menu-item-97']/a");
    By tabs = By.xpath("//*[@id='menu-item-98']/a");
    By tooltip = By.xpath("//*[@id='menu-item-99']/a");
    By framesandwindow= By.xpath("//*[@id='menu-item-148']/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickLogin() {

        driver.findElement(login).click();

    }

    public void clickDraggable() {

        driver.findElement(draggable).click();

    }
    public void clickDroppable() {

        driver.findElement(droppable).click();

    }
    public void clickResizable() {

        driver.findElement(resizable).click();

    }
    public void clickSelectable() {

        driver.findElement(selectable).click();

    }
    public void clickSortable() {

        driver.findElement(sortable).click();

    }
    public void clickAccordian() {

        driver.findElement(accordian).click();

    }
    public void clickAutocomplete() {

        driver.findElement(autocomplete).click();

    }
    public void clickDatepicker() {

        driver.findElement(datepicker).click();

    }
    public void clickMenu() {

        driver.findElement(menu).click();

    }
    public void clickSlider() {

        driver.findElement(slider).click();

    }
    public void clickTabs() {

        driver.findElement(tabs).click();

    }
    public void clickTooltip() {

        driver.findElement(tooltip).click();

    }
    public void clickFramesAndWindow() {

        driver.findElement(framesandwindow).click();

    }




}