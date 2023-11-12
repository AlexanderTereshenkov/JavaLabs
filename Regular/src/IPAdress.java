import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAdress {
    public static void main(String[] args) {
        String s = "0.0.0.0";
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
