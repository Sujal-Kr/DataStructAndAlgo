package GeeksForGeeks;
import java.util.*;
public class QuerrySum2{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int querry[]={1, 4, 2, 3};
        System.out.println(solution(arr, querry));
    }

    private static List<Integer> solution(int[] arr, int[] querry) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list=new ArrayList<Integer>();
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            map.put(i+1,sum);
        }
        System.out.println(map);
        for(int i=0;i<querry.length-1;i+=2) {
            int t2=map.get(querry[i+1]);
            if(querry[i]==1)list.add(t2);
            else {
                int ans=t2-map.get(querry[i]-1);
                list.add(ans);
            }

        }
        return list;
    }
}
