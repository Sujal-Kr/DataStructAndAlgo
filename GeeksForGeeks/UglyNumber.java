package GeeksForGeeks;
public class UglyNumber{
    public static void main(String[] args) {
        int n=5;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int arr[]=new int[n+1];
        arr[1]=1;
        int p2=1;
        int p3=1;
        int p5=1;

        for(int i=2;i<=n;i++) {
            int f1=2*arr[p2];
            int f2=3*arr[p3];
            int f3=5*arr[p5];
            int min=Math.min(f1,Math.min(f2,f3));
            arr[i]=min;
            if(f1==min)p2++;
            if(f2==min)p3++;
            if(f3==min)p5++;
        }
        return arr[n];
    }
}