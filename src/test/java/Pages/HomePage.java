package Pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePageClass {

    public static final String CONTINUE_BTN = "com.nobroker.app:id/bottomPermission";
    public static final String BUY_BTN ="com.nobroker.app:id/buyLayout";
    public static final String SEARCH_BTN="com.nobroker.app:id/searchEditBar";


    @AndroidFindBy(id = CONTINUE_BTN)
    WebElement allowContinue_Btn;

    @AndroidFindBy(id = BUY_BTN)
    WebElement but_Btn;

    @AndroidFindBy(id = SEARCH_BTN)
    WebElement search_Btn;

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public void allowContinue_Btn() {
        androidHelperMethods.click(allowContinue_Btn);
    }

    public void buyBtn() {
        androidHelperMethods.click(but_Btn);
    }

    public void search_Btn() {
        androidHelperMethods.click(search_Btn);
    }
}
