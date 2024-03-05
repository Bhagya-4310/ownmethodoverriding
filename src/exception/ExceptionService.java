package exception;

import java.text.spi.BreakIteratorProvider;
import java.util.Locale;
public class ExceptionService {
    //unchecked exception
    public String greet(String input) {
        String upperCase=null;
        try {
            upperCase= input.toUpperCase();
        } finally {
            System.out.println("from");
        }
        return upperCase;
    }
}
