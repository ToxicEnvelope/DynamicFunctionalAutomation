package page.pd.dfa.concrete.page;

import org.openqa.selenium.WebDriver;
import page.pd.dfa.base.BasePage;
import page.pd.dfa.utils.IGenericPageBehavior;

public class LoginPageBehavior extends BasePage implements IGenericPageBehavior {

    public LoginPageBehavior(WebDriver driver) {
        super(driver);
    }

    @Override
    public void reloadPage() {
        System.out.println("'reloadPage' run from "+ getClass().getName());
    }

    @Override
    public void inLoadState() {
        System.out.println("'inLoadState' run from "+ getClass().getName());
    }
}
