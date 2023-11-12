import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hyperlink {
    public static void main(String[] args) {
        ArrayList<String> links = new ArrayList<>();
        String password = "www..example.com";
        Pattern p = Pattern.compile("([a-z]{2,}\\.)?[a-z0-9]{2,}\\.[a-z0-9]{2,}(\\/[a-z0-9\\-]*(\\.[a-z]{2,})*)*");
        Matcher m = p.matcher(password);
        while(m.find()){
            links.add(m.group());
        }
        for(String link:links){
            String hyperLink = "https://" + link;
            System.out.println(hyperLink);
        }
    }
}
