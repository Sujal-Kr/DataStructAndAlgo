package GeeksForGeeks;

public class CheckIfStringsAreRotated {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        String x="geeksgeeksfor";
        System.out.println(solution(str,x));
        
    }

    private static boolean solution(String str, String x) {
        str+=str;
        return str.contains(x);
    }
}
