package PepCoding.Array;
//a beautiful example of modified binary search...
public class FirstLast {
    
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,3,4,5,7,7,7,10};
        // arrays must be sorted...
        System.out.println(first(a,2));
    }
    static int first(int[] a,int k){
        int start=0;
        int end=a.length-1;
        int temp=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==k){
                temp=mid;
                end=mid-1;
                //use the commented code if you want the index of the last occuring element
                //for that search more of the right side of the array so make it
                //start=mid+1;
            }
            else if(a[mid]>k)end=end-1;
            else start=mid+1;
        }
        return temp;
    }
}
