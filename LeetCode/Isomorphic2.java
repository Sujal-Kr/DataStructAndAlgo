package LeetCode;

public class Isomorphic2 {
    public static void main(String[] args) {
        String one="paper";
        String two="title";
        System.out.println(solution(one, two));
    }
    //checking the count of each character...
    private static boolean solution(String one, String two) {
        int[] x=new int[128];
        int[] y=new int[128];
        if(one.length()!=two.length()) return false;
        for(int i=0; i<one.length(); i++){
            if(x[one.charAt(i)]!=y[two.charAt(i)])return false;
            x[one.charAt(i)]=i+1;
            y[two.charAt(i)]=i+1;
        }
        return true;
    }
}
