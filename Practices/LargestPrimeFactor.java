public class LargestPrimeFactor {
    public static void main(String[] args) {
        int k=24;
        int ans=solution(k);
        System.out.println(ans);
    }

    public static int solution(int k) {
        int ans=0; 
        for(int i=2;i<Math.sqrt(k);i++){
            if(k%i==0)ans++;
        }
        ans++;

        return ans;
    }
}
