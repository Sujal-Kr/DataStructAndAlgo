package GeeksForGeeks;
import java.util.*;
public class FindAllFourSum{
    public static void main(String[] args) {
        int arr[]={0,0,2,1,1};
        for(ArrayList<Integer> list:solution(arr,3)){
            for(int item:list){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> solution(int[] arr,int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        Arrays.sort(arr);
        for(int i=1;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                int start=0;
                int end=arr.length-1;
                while(start<i&&j<end){
                    int sum=arr[i]+arr[j]+arr[start]+arr[end];
                    if(sum==k){
                        ArrayList<Integer> quad=new ArrayList<>();
                        quad.add(arr[start]);
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[end]);
                        
                        res.add(quad);
                        
                    }
                    else if(sum<k)i++;
                    else j--;
                }
            }
        }
        return res;
    }
}