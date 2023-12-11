package GeeksForGeeks;
import java.util.*;


public class MinimumPlatform {
    static class pair{
        int arr;
        int dep;
        pair(int arr,int dep){
            this.arr=arr;
            this.dep=dep;
        }
    }
    public static void main(String[] args) {
        String arr[] = {"0900", "0940", "0950", "1100", "1500", "1800"};
        String dep[] = {"0910", "1200", "1120", "1130", "1900", "2000"};
        System.out.println(solution(arr, dep));
    }

    private static int solution(String[] arr, String[] dep) {
        int count=1;
        ArrayList<pair> list = new ArrayList<pair>();
        int curr=0;
        Collections.sort(list,(a,b)->a.dep-b.dep);
        for(int i=1;i<list.size();i++) {
            
        }
        return count;
    }
}
