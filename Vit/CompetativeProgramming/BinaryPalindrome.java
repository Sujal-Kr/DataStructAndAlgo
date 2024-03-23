package Vit.CompetativeProgramming;
public class BinaryPalindrome {
    public static void main(String[] args) {
        int n=9;
        if(solution(n)==true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    public static boolean solution(int n){
        int rev=0;
        int num=n;
        while(n>0){
            rev<<=1;
            rev|=(n&1);
            n>>=1;
        }
        return rev==num;
    }
}
