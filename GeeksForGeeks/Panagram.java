package GeeksForGeeks;

public class Panagram {
    public static void main(String[] args) {
        String str="Bawds jog, flick quartz, vex nymph";
        System.out.println(solutio(str));
    }

    private static boolean solutio(String str) {
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
            char item=str.charAt(i);
            item=Character.toLowerCase(item);
            if(Character.isLetter(item)){
                arr[122-item-0]=1;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=1)return false;
        }
        
        return true;
    }
}
