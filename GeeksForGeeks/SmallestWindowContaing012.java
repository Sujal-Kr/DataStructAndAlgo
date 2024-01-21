package GeeksForGeeks;

public class SmallestWindowContaing012 {
    public static void main(String[] args) {
        String str="122221022212220";
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        int len=Integer.MAX_VALUE;
        int min;
        int max;
        int zero=-1;
        int one=-1;
        int two=-1;

        for(int i=0; i<str.length(); i++) {
            char temp=str.charAt(i);
            if(temp=='0')zero=i;
            else if(temp=='1')one=i;
            else two=i;
            if(zero!=-1&&one!=-1&&two!=-1){
                min=Math.min(zero,Math.min(one,two));
                max=Math.max(zero,Math.max(one,two));
                len=Math.min(len,max-min+1);
            }
        }
        return len==Integer.MAX_VALUE?-1:len;
    }
}
