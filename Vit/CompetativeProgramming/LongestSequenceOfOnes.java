package Vit.CompetativeProgramming;

public class LongestSequenceOfOnes {
    public static void main(String[] args) {
        int n=87769;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(solution(Integer.toBinaryString(n)));
    }

    private static int solution(String str) {
        int count = 0;
        int max=0;
        for(int i=0;i<str.length();i++) {
            char temp=str.charAt(i);
            if(temp=='1'){
                count++;
                max=Math.max(max,count);
            }else{
                count = 0;
            }
        }
        return max;
    }
}
