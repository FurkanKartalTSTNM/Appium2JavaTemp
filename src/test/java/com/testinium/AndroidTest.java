package com.testinium;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class AndroidTest extends BaseTest {

    @Test
    public void settingsTestAndroid() throws InterruptedException {
        WebElement generalButton = androidDriver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.gratis.android:id/navigation_bar_item_icon_view\"])[1]"));
        generalButton.click();
        logger.info("Clicked to HomePage");

        Thread.sleep(2000);

        WebElement kategorilerButton = androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.gratis.android:id/navigation_bar_item_small_label_view\" and @text=\"Kategoriler\"]"));
        kategorilerButton.click();
        logger.info("Clicked to Kategoriler Button");

        Thread.sleep(2000);

        WebElement makyajButton = androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.gratis.android:id/category_name\" and @text=\"Makyaj\"]"));
        makyajButton.click();
        logger.info("Clicked to Makyaj Button");

        Thread.sleep(2000);

        WebElement backButton = androidDriver.findElement(AppiumBy.id("com.gratis.android:id/btnBack"));
        backButton.click();
        logger.info("Clicked to Back Button");

        Thread.sleep(2000);
    }
}
