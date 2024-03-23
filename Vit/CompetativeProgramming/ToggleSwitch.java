package Vit.CompetativeProgramming;

public class ToggleSwitch {
    public static void main(String[] args) {
        int n=10;
        int ans=solution(n);
        System.out.println(ans);
    }

    private static int solution(int n) {
        boolean arr[]=new boolean [n+1];
        int mul=1;
        for(int j=1;j<=n;j++){
            for(int i=mul;i*j<arr.length;i++){
                arr[i]=!arr[i];
            }
            mul++;
        }
        int count=0;
        for(boolean item:arr){
            if(item==true)count++;
        }
        return count;
    }
}
