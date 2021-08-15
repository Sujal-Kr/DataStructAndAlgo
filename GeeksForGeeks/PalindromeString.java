package GeeksForGeeks;

public class PalindromeString {
    public static void main(String[] args) {
        String s="asdsa";
        int ss=checkpalindrome(s);
        System.out.println(ss);
    }

    private static int checkpalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char start = s.charAt(i++);
            char end = s.charAt(j--);
            if(start!=end)return 0;
        }
        return 1;
    }
}
