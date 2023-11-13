package GeeksForGeeks;

public class CheckIfStringIsRotatedByTwoPlaces {
    public static void main(String[] args) {
        String a="amazon";
        String b="azonam";
        System.out.println(solution(a,b));
    }

    private static boolean solution(String a, String b) {

        if((a.substring(a.length()-2)+a.substring(0,a.length()-2)).equals(b)){
            return true;
        }
        
        if((a.substring(2)+a.substring(0,2)).equals(b)){
            return true;
        }
        return false;
    }
}
