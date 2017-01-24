package com.demoqa.testing.testscripts;

import com.demoqa.testing.pageobjects.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static com.demoqa.testing.testscripts.BaseClass.TEST_URL;


public class MultiTest extends BaseClass {
    String screenShotPath = "D:/Project/framework/src/main/resources/screenshots/droppable_test/TestResults_";
    String textToSelect = "Scala";

    @BeforeTest
    public void openUrl() {
        driver.get(TEST_URL);
        homepage = new HomePage(driver);

        waitUntillPageLoad();
    }

    @Test(priority=1)
    public void autocompleteFunction() throws InterruptedException {
        homepage.clickAutocomplete();
        WebElement autoOptions = driver.findElement(By.id("tagss"));
        autoOptions.sendKeys("sc");

        List<WebElement> optionsToSelect = driver.findElements(By.className("ui-menu-item"));

        for (WebElement option : optionsToSelect) {
            System.out.println(option);
            if (option.getText().equals(textToSelect)) {
                captureScreenShot(screenShotPath);
                System.out.println("Trying to select: " + textToSelect);
                option.click();
                break;

            }
        }
    }
        @Test(priority=2)
        public void sliderFunction()
    {
        Actions action = new Actions(driver);
        homepage.clickSlider();
        WebElement slider = driver.findElement(By.xpath("//*[@id='slider-range-max']/span"));
        action.dragAndDropBy(slider, 90, 0).perform();
        captureScreenShot(screenShotPath);
    }
    @Test(priority=3)
    public void toolTipFunction()

    {
        homepage.clickTooltip();
        WebElement element = driver.findElement(By.id("age"));

        // Use action class to mouse hover on Text box field
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        WebElement toolTipElement = driver.findElement(By.className("ui-tooltip-content"));

        // To get the tool tip text and assert
        String toolTipText = toolTipElement.getText();
        Assert.assertEquals("We ask for your age only for statistical purposes.", toolTipText);
        System.out.println(toolTipText);
        captureScreenShot(screenShotPath);

    }
    }


