package LeetCode;

public class SearchAnElement {
    public static void main(String[] args) {
        int [][] x={{1}};
        int target=1;
        System.out.println(search(x,target));
    }

    private static boolean search(int[][] x, int target) {
        for(int i=0; i<x.length; i++) {
            for(int j=0;j<x[0].length;j++){
                int start=0;
                int end=x[0].length-1;
                while(start<=end){
                    int mid=(start+end)/2;
                    if(x[i][mid]==target)return true;
                    else if(x[i][mid]<target)start=mid+1;
                    else end=mid-1;
                }
            }
        }

        return false;
    }
}
