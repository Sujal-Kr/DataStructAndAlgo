package Vit.PlacementTraining;

public class ValidPassword {
    public static void main(String[] args) {
        String str="hsa893b302ndA";
        if(solution(str)){
            System.out.println("Valid Password");
        }else{
            System.out.println("Not Valid Password");
        }
    }
    public static boolean solution(String str){
        boolean space=false;
        boolean digit=false;
        boolean caps=false;
        if(str.length()<4)return false;
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i);
            if(Character.isDigit(temp))digit=true;
            else if(Character.isUpperCase(temp))caps=true;
            else if(Character.isWhitespace(temp)||temp=='/')return false;
        }
        return !space&&digit&&caps;
    }
}
