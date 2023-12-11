package GeeksForGeeks;

public class TransformPrime {
    public static void main(String[] args) {
        int arr[]={1,5,7};
        System.out.println(solution(arr));

    }
    private static int solution(int[] arr) {
        int sum=0;
        for(int item:arr){
            sum+=item;
        }
        int temp=sum;
        while(true){
            if(prime(temp)){
                temp=temp-sum;
                break;
            }
        }
        return temp;
    }
    public static boolean prime(int x){
        //  not for all test cases
        if(x==1)return false;
        if(x==2||x==3||x==5||x==7||x==11)return true;
        if(x%2==0 || x%3==0 || x%5==0 || x%7==0 || x%11==0)return false;
        return true;
    }
}
