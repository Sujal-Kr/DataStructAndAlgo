

public class Sum {
    boolean Twosum(int a[],int x,int i){
        int j=a.length-1;
        while(i>j){
            if(i+j>x){
                j--;
            }
            else if(i+j<x){
                i++;
            }
            else{
                return true;
            }
        }
        
        return false;
    }
    boolean ThreeSum(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(Twosum(arr,-arr[i],i+1)){
                return true; 
            }
        }
        return false;
    }
}
