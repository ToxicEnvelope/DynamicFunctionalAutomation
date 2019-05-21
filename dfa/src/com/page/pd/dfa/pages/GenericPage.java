package page.pd.dfa.pages;

import page.pd.dfa.base.BasePage;
import page.pd.dfa.strategies.PageStrategy;
import org.openqa.selenium.WebDriver;
import page.pd.dfa.utils.Result;

public class GenericPage extends BasePage {

    private PageStrategy _strategy;

    public GenericPage(WebDriver driver,
                       PageStrategy strategy) {
        super(driver);
        this._strategy = strategy;
    }

    public Result makeLoginAndResultSuccessHomePage() {
        result = new Result();
        _strategy.contextDisplayed();
        _strategy.contextLoaded();
        _strategy.contextDisplayed();
        _strategy.inLoadState();
        _strategy.reloadPage();
        result.getSuccessMessages().add("Test function...");
        return result;
    }
}
