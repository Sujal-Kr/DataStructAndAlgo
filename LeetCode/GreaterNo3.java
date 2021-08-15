package LeetCode;
import java.util.*;
//import java.io.*;
public class GreaterNo3 {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(solution(n));
        in.close();
    }
    private static String solution(int n) {
        String x="";
        x+=n;
        char[] num=x.toCharArray();
        int i=num.length-2;
        int j=num.length-1;
        x="";
        //find the first display
        while(i>=0&&num[i]>=num[i+1])i--;
        if(i==-1)return "-1";
        // find just greater no.
        // swap.
        while(num[i]>=num[j])j--;
        char temp=num[i];
        num[i]=num[j];
        num[j]=temp;
        //concatenate till first dip
        for(int p=0;p<=i;p++){
            x+=num[p];
        }
        //add from last till i+1 to get the desired output(reverse order)
        for(int p=num.length-1;p>i;p--)x+=num[p];
        return x;
    }
}