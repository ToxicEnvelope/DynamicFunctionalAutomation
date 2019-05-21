package page.pd.dfa.concrete.context;

import org.openqa.selenium.WebDriver;
import page.pd.dfa.base.BasePage;
import page.pd.dfa.utils.IContextPageBehavior;

public class LoadingPageContext extends BasePage implements IContextPageBehavior {

    public LoadingPageContext(WebDriver driver) {
        super(driver);
    }

    @Override
    public void contextLoaded() {
        System.out.println("'contextLoaded' run from "+ getClass().getName());
    }

    @Override
    public void contextLoading() {
        System.out.println("'contextLoading' run from "+ getClass().getName());
    }

    @Override
    public void contextDisplayed() {
        System.out.println("'contextDisplayed' run from "+ getClass().getName());
    }
}
