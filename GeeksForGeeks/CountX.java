package GeeksForGeeks;
public class CountX{
    public static void main(String[] args) {
        System.out.println(countX(10,19,1));
    }
    static int  countX(int L, int R, int x) {
        int count=0;
        for(int i=L+1;i<R;i++){
            count+=countDigits(i,x);
        }
        return count;
    }
    static int countDigits(int temp,int x){
        int count=0;
        
        while(temp>0){
            int rem=temp%10;
            if(rem==x)count++;
            temp/=10;
        }
        return count;
    }
}