package com.testinium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Arrays;

public class IOSTest extends BaseTest {


    @Test
    public void basicIosTest() throws InterruptedException {
        System.out.println("StartIos test");
        fingerSwipe(driver, 100, 800, 100, 600, 1000);
        Thread.sleep(2000);

        WebElement dashboardButton = driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"81 ilde mağazadan ÜCRETSİZ TESLİMAT fırsatları\"]"));
        dashboardButton.click();

        WebElement markalar = driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[contains(@name, \"Markalar\")]"));
        markalar.click();

        fingerSwipe(driver, 100, 800, 100, 400, 1000);

        WebElement kampanyalar = driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[contains(@name, \"Kampanyalar\")]"));
        kampanyalar.click();
    }

    public static void fingerSwipe(AppiumDriver driver, int startX, int startY, int endX, int endY, long timeInMillis) {
        PointerInput touchAction = new PointerInput(PointerInput.Kind.TOUCH, "touchAction");
        Sequence swipe = new Sequence(touchAction, 0);
        swipe.addAction(touchAction.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(touchAction.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(touchAction.createPointerMove(Duration.ofMillis(timeInMillis), PointerInput.Origin.viewport(), endX, endY));
        swipe.addAction(touchAction.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }
}
