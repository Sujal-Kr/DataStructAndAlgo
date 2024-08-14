package Practice;
import java.util.*;
class Divisiblity {
    public static void main(String args[] ) throws Exception {
        // Scanner in=new Scanner(System.in);
        // int n=in.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=in.nextInt();
        // }
        int arr[]={85, 25, 65, 21, 84};
        if(solution(arr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // in.close();
    }
    public static boolean solution(int arr[]){
        int num=0;
        for(int item:arr){
            int last=item%10;
            num=num*10+last;
        }
        
        return num%10==0?true:false;
    }
}
