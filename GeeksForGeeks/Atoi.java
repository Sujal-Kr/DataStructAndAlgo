package GeeksForGeeks;
public class Atoi{
    public static void main(String[] args) {
        String str="-aaaaa";
        int ans=solution(str);
        System.out.println(ans);
    }
    public static int solution(String str) {
        String ans="0";
        boolean check=false;
        for(int i=0;i<str.length();i++){
            
            char temp=str.charAt(i);
            if(str.charAt(i)=='-'){
                check=true;
                continue;
            }
            if(Character.isDigit(temp)){
                ans+=temp;
            }
            else{
                return -1;
            }
        }
        int no;
        if(check==true){
            no=Integer.parseInt(ans);
            no*=-1;
            return no;
        }
        return Integer.parseInt(ans);
    }
}