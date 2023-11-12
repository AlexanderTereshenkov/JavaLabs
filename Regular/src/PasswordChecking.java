import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecking {
    public static void main(String[] args) {
        String password = "wrevwe123Dff";
        Pattern p = Pattern.compile("(?=[a-zA-Z0-9]*[0-9])(?=[a-zA-Z0-9]*[A-Z])[a-zA-Z0-9]*");
        Matcher m = p.matcher(password);
        int counter = 0;
        while(m.find()){
            counter++;
            System.out.println(m.group());
        }
        if(counter == 0) System.out.println("Не найдено ни одного пароля");
    }
}
