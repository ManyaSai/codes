import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String pattern = "[a-z0-9A-Z]+";
        String str = "mlafurhnss";
        str = "Adkh";
        boolean m = Pattern.matches(pattern,str);
        System.out.println(m);
    }
}