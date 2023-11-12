import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "ad66,6w1dedgmogm.comasccs aasd _124 777_888 12342,5 11 1.124 213, 12321.0";
        Pattern p = Pattern.compile("([0-9]+(\\.|,)[0-9]+|[0-9]+)");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}