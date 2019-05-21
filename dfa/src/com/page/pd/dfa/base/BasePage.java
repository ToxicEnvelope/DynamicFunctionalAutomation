package page.pd.dfa.base;

import com.google.common.base.Function;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import page.pd.dfa.utils.Result;

import java.util.NoSuchElementException;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

public abstract class BasePage {

    protected Result result;

    public WebDriver _driver;

    public BasePage(WebDriver driver) {
        this._driver = driver;

    }

    public void waitForPageLoad () {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(this._driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(250, MILLISECONDS)
                .ignoring(NoSuchElementException.class);

        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState")
                        .toString()
                        .equals("complete");
            }
        });
    }

    public void click(WebElement webElement) {
        if (webElement.isDisplayed())
        {
            webElement.click();
        }
    }

    public void fillText(WebElement elem, String phrase) {
        if (elem.isDisplayed())
        {
            if (!elem.getText().isEmpty()) {
                elem.clear();
                elem.sendKeys(phrase);
            }
            elem.sendKeys(phrase);
        }
    }
}
