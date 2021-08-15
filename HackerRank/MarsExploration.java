package HackerRank;

public class MarsExploration {
    public static void main(String[] args) {
        String s="TOSSOSSOSSOTSOT";
        System.out.println(msgcount(s));
    }
    // to count the no of correct msgs using reccursion...
    private static int  msgcount(String s) {
        if(s.length()==0) return 0;
        int count = msgcount(s.substring(3));
        if(s.charAt(0)!='S')count++;
        if(s.charAt(1)!='O')count++;
        if(s.charAt(2)!='S')count++;
        return  count;
    }
}
