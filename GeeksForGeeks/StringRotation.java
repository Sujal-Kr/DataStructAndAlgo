package GeeksForGeeks;

public class StringRotation {
    public static void main(String[] args) {
        String x="abcdef";
        String y="defab";
        x=x+x;
        System.out.println(x);
        System.out.println(x.contains(y));
    }
}
