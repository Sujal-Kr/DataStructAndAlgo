package GeeksForGeeks;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(longest(s));
    }

    private static int longest(String s) {
        int length=Integer.MIN_VALUE;
        for(int i=0; i<s.length();i++){
            for(int j=i; j<s.length();j++){
                System.out.println(s.substring(i,j+1));
                if(palindrome(s.substring(i,j+1)))
                length=Math.max(length,s.substring(i,j+1).length());
            }
        }
        return length;
    }
    private static boolean palindrome(String x) {
        int start =0;
        int end =x.length()-1;
        while(start<end){
            if(x.charAt(start++)!=x.charAt(end--))return false;
        }
        return true;
    }
}
 