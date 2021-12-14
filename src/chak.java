import java.util.Locale;

public class chak {
    public static void main(String[] args) {
         String s1="GLA";
        String s2="gla";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.substring(0,2));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.indexOf('d'));
        System.out.println(s1.concat(s2));
    }
}
