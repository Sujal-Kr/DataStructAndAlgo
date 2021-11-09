package GeeksForGeeks;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
import java.util.ArrayList;

public class RulingPair {
    public static void main(String[] args) {
        int x[]={10,20,10};
        // System.out.println(soltuion(x));
        System.out.println(solution2(x));
    }

    private static int solution2(int[] x) {
        Arrays.sort(x);
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < x.length; i++) {
            int temp = x[i];
            int digit_sum=0;
            while(temp>0){
                int last_digit=temp%10;
                digit_sum+=last_digit;
                temp/=10;
            }
            map.putIfAbsent(digit_sum, new ArrayList<Integer>());
            map.get(digit_sum).add(x[i]);
        }
        int ans=-1;
        for(int item:new ArrayList<Integer>(map.keySet())){
            int comb_sum=0;
            if(map.get(item).size()>=2){
                comb_sum=map.get(item).get(map.get(item).size()-1)+map.get(item).get(map.get(item).size()-2);
            }
            ans=Math.max(ans,comb_sum);
        }
        return ans;
    }

//     public static int soltuion(int[] x) {
//         Map<Integer, ArrayList<Integer>> map=new HashMap<>();
//         for(int i=0; i<x.length; i++) {
//             int temp=x[i];
//             int sum=0;
            
//             while(temp>0){
//                 int l=temp%10;
//                 sum+=l;
//                 temp/=10;
//             }
//             map.putIfAbsent(sum, new ArrayList<Integer>());
//             map.get(sum).add(i);    
//         }
//         int ans=0;
//         ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
//         for(int item:keys){
//             if(map.get(item).size()>=2){
//                 int comb_sum=0;
//                 comb_sum=x[map.get(item).get(0)]+x[map.get(item).get(1)];
//                 ans=Math.max(ans,comb_sum);
//             }        
//         }
    
//         return ans==0?-1:ans;
//     }
}
