package Vit.Dsa;

public class Pattern {

   

    public static void main(String[] args) {

        String str = "restinpeace.";
        String text = "ace";
        System.out.println(solution(str, text));

        
    }
     public static int solution(String str, String text) {
        

        for (int i = 0; i <=str.length()-text.length(); i++) {
            String temp=str.substring(i,i+text.length());
            if(temp.equals(text)){
                return i;
            }
        }

        return -1;
    }
}
