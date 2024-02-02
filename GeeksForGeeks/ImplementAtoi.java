package GeeksForGeeks;

public class ImplementAtoi {
    public static void main(String[] args) {
        String str="-235634535";
        int ans=solution(str);
        System.out.println(ans);
    }

    private static int solution(String str) {
        String ans="";
        for(int i=0; i<str.length(); i++) {
            char temp=str.charAt(i);
            if(!Character.isDigit(temp)){
                if(temp=='-'&&i==0){
                    ans+=temp;
                    continue;
                }
                else return -1;
            }
            ans+=temp;
        }
       return Integer.parseInt(ans);
    }
}
