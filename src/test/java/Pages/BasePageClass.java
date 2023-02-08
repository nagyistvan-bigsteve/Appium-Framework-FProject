package Pages;

import actionHelper.AndroidHelperMethods;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

class BasePageClass {
    protected AndroidDriver androidDriver;
    AndroidHelperMethods androidHelperMethods;

    public BasePageClass(AndroidDriver driver) {
        this.androidDriver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver, Duration.ofSeconds(15)), this);
        androidHelperMethods= new AndroidHelperMethods(androidDriver);
    }
}
