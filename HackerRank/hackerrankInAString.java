package HackerRank;

public class hackerrankInAString{
    public static void main(String[] args) {
        String s="hhhackkerbanker";
        System.out.println(solution(s));
        
    }

    private static String solution(String s) { 
        int index =Integer.MIN_VALUE;
        String x="hackerrank";
        for(int i=0; i<x.length(); i++){
            char temp = x.charAt(i);
            if(s.indexOf(temp,index+1)<index)return "No";
            index=s.indexOf(temp,index+1);
            System.out.println(index+1);
        }
        return "Yes";
    }
}