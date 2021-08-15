package GeeksForGeeks;

public class SaveGotham {
    public static void main(String[] args) {
        int[] x={112, 133, 161, 311, 122, 512, 1212, 0, 19212};
        System.out.println(maxsum(x));
    }
    private static int  maxsum(int[] x) {
        // O(N) my apporach 
        // first loop is to iterate over the elements of the array
        // Next loop is to find the just greater element than the x[i] if its in the range then add it.
        // At last return the sum.
        // #pro or wottt bro???
        int sum=0;
        for(int i=0; i<x.length-1; i++){
            int j=i+1;
            while(j<x.length&&x[i]>=x[j])j++;
            if(j<x.length)sum+=x[j];
        }
        return sum;
    }
}
