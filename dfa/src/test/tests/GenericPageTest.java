package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.pd.dfa.concrete.context.LoadingPageContext;
import page.pd.dfa.concrete.context.ReadyPageContext;
import page.pd.dfa.concrete.page.HomePageBehavior;
import page.pd.dfa.concrete.page.LoginPageBehavior;
import page.pd.dfa.pages.GenericPage;
import page.pd.dfa.strategies.PageStrategy;
import page.pd.dfa.utils.Result;

public class GenericPageTest extends BaseTest {
    class Fixture {

        Result result;
        GenericPage genericPage1;
        GenericPage genericPage2;
        PageStrategy strategy1;
        PageStrategy strategy2;
        String EXPECTED_DATA = "Test function...";


        Fixture() {
            strategy1 = new PageStrategy(new LoginPageBehavior(getDriver()), new ReadyPageContext());
            strategy2 = new PageStrategy(new HomePageBehavior(getDriver()), new LoadingPageContext());
        }

    }

    Fixture fixture = new Fixture();



    @Test
    public void login() {
        fixture.result = fixture.genericPage1.makeLoginAndResultSuccessHomePage();
        Assert.assertEquals(fixture.result.getFirstSuccessMessage(), fixture.EXPECTED_DATA);

        fixture.result = fixture.genericPage2.makeLoginAndResultSuccessHomePage();
        Assert.assertEquals(fixture.result.getFirstSuccessMessage(), fixture.EXPECTED_DATA);
    }

}
