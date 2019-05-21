package page.pd.dfa.concrete.context;

import page.pd.dfa.utils.IContextPageBehavior;

public class LoadingPageContext implements IContextPageBehavior {

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
