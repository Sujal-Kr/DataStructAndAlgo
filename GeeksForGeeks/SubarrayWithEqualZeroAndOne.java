package GeeksForGeeks;
import java.util.*;
public class SubarrayWithEqualZeroAndOne {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,1};
        int ans=solution(arr);
        System.out.println(ans);
    }
    public static int solution(int arr[]){
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int ans=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)sum+=-1;
            else sum+=arr[i];
            if(map.containsKey(sum)){
                ans+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return ans;
    }
}
