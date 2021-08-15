package LeetCode;

public class LongPressedName {
    public static void main(String[] args) {
        String name="mannu";
        String typed="mmaannu";
        System.out.println(solution(name, typed));
    }

    private static boolean solution(String name, String typed) {
        if(name.equals(typed))return true;
        if(typed.length()<name.length())return false;
        int i=0;
        int j=0;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(i>0&&name.charAt(i-1)==typed.charAt(j))j++;
            else return false;
        }
        while(j<typed.length()){
            if(name.charAt(i-1)!=typed.charAt(j))return false;
            j++;
        }
        return i<name.length()? false:true;
    }
}
