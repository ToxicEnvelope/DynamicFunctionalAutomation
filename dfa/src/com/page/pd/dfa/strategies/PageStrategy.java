package page.pd.dfa.strategies;


import page.pd.dfa.concrete.context.LoadingPageContext;
import page.pd.dfa.concrete.context.ReadyPageContext;
import page.pd.dfa.concrete.page.HomePageBehavior;
import page.pd.dfa.concrete.page.LoginPageBehavior;
import page.pd.dfa.utils.IContextPageBehavior;
import page.pd.dfa.utils.IGenericPageBehavior;

public class PageStrategy {

    private IGenericPageBehavior _genericPageBehavior;
    private IContextPageBehavior _contextPageBehavior;

    public PageStrategy(HomePageBehavior homePageBehavior,
                        LoadingPageContext contextPageBehavior) {
        this._genericPageBehavior = homePageBehavior;
        this._contextPageBehavior = contextPageBehavior;
    }

    public PageStrategy(LoginPageBehavior loginPageBehavior,
                        ReadyPageContext readyPageContext) {
        this._genericPageBehavior = loginPageBehavior;
        this._contextPageBehavior = readyPageContext;
    }


    public void reloadPage() {this._genericPageBehavior.reloadPage();}
    public void inLoadState() { this._genericPageBehavior.inLoadState();}
    public void contextLoaded() { this._contextPageBehavior.contextLoaded();}
    public void contextLoading() { this._contextPageBehavior.contextLoading();}
    public void contextDisplayed() {this._contextPageBehavior.contextDisplayed();}
}
