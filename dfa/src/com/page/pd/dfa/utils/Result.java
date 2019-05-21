package page.pd.dfa.utils;

import java.util.ArrayList;
import java.util.List;

public class Result {

    List<Exception> exceptions = new ArrayList<>();
    List<String> errorMessages = new ArrayList<>();
    List<String> successMessages = new ArrayList<>();

    public List<String> getSuccessMessages() {return this.successMessages;}
    public List<String> getErrorMessages() {return this.errorMessages;}
    public List<Exception> getExceptions() {return this.exceptions;}
    public String getFirstErrorMessage() {return this.errorMessages.get(0);}
    public String getFirstSuccessMessage() {return this.successMessages.get(0);}
    public Exception getFirstException() {return this.exceptions.get(0);}

}
