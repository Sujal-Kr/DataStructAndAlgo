package HackerRank;
 
public class BiggerIsGreater {
    public static void main(String[] args) {
        String s="dkhc";
        System.out.println(solution(s));
    }
    private static String solution(String s) {
        String x="";
        char[] num=s.toCharArray();
        int i=num.length-2;
        int j=num.length-1;
        //find the first display
        while(i>=0&&num[i]>=num[i+1])i--;
        if(i==-1)return "no answer";
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
