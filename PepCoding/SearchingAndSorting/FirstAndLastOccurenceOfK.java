package PepCoding.SearchingAndSorting;
import java.util.*;
public class FirstAndLastOccurenceOfK {
    public static void main(String[] args) {
        int arr[]={ 1, 3, 3, 5, 5, 5, 67, 123, 125 };
        int k=20;
        System.out.println(solution(arr,k));
    }

    private static ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=arr.length-1;
        int mid=arr.length/2;
        int first=-1;
        int last=-1;
        while(i<=j) {
            mid=(i+j)/2;
            if(arr[mid]==k){
                first=mid;
                j=mid-1;
            }else if(arr[mid]<k){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        list.add(first);
        i=0;
        j=arr.length-1;
        while(i<=j) {
            mid=(i+j)/2;
            if(arr[mid]==k){
                last=mid;
                i=mid+1;
            }else if(arr[mid]<k){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        list.add(last);
        return list;
    }
}
