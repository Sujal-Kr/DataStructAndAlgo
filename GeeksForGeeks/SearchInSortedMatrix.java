package GeeksForGeeks;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int arr[][]={{ 3, 30, 38},
        {36, 43, 60},
        {40, 51, 69}};
        int k=40;
        System.out.println(solution(arr,k));

    }
    private static boolean solution(int[][] arr,int k){
        // start with top right corner and check the last element
        // if greater than k then move down else move left and check for the key element.pr
        int i=0;
        int j=arr[0].length-1;
        while(i<arr.length&&j>=0){
            if(arr[i][j]==k)return true;
            else if(arr[i][j]<k)i++;
            else j--;
        }
        return false;
    }
}
