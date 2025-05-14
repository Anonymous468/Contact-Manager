import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sanitizer {
    static boolean sanitize_ph_num(long ph_num){
        Pattern pattern=Pattern.compile("^\\d{10}$");
        Matcher matcher=pattern.matcher(String.valueOf(ph_num));
        return matcher.find();
    }

    static boolean sanitize_name(String name){
        Pattern pattern=Pattern.compile("^[A-Za-z_]+$");
        Matcher matcher=pattern.matcher(name);
        return matcher.find();
    }
    static boolean sanitize_email(String email){
        Pattern pattern=Pattern.compile("^\\w+@[a-z]+\\.[a-z]{2,3}$");
        Matcher matcher=pattern.matcher(email);
        return matcher.find();
    }
}
