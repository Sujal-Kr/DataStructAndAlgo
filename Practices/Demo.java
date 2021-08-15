package Practices;
public class Demo {
    public static void main(String[] args) {
        String s1="This iss java programming";
        String s2="java";
        String s3="Java";
        String upr=s1.toUpperCase();
        String lwr=s1.toLowerCase();
        System.out.println("Upper Case"+upr);
        System.out.println("Lower Case"+lwr);
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        int m=s1.length();
        System.out.println("Length of s1"+m);
        char s4=s1.charAt(3);
        System.out.println(s4);
        System.out.println(s1.concat(s2));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,6));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf('a',10));
    }
}
