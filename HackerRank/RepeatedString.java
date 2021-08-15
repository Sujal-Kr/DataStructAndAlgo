package HackerRank;

public class RepeatedString {
    public static void main(String[] args) {
        String string="abcac";
        int substring=10;
        System.out.println(repeat(string, substring));
    }
    public static long repeat(String string, long substring) {
        long a_count=0;
        int size=string.length();
        for(int i=0; i<size; i++){
            if(string.charAt(i)=='a'){
                a_count++;
            }
        }
        long count=substring/size;
        long r=substring%size;
        a_count*=count;
        for(int i=0; i<r; i++){
            if(string.charAt(i)=='a')a_count++;
        }
        return a_count;
    }
}
