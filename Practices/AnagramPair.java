
public class AnagramPair {
    static boolean Anagram(String s ,String x){
        boolean result = true;
        int[] temp =new int[256];
        int index = 0;
        if(s.length()==x.length()){
            for(char c : s.toCharArray()){
                index=(int)c;
                temp[index]++;
            }
            for(char ch : x.toCharArray()){
                index=(int)ch;
                temp[index]--;
            }
            for(int i=0; i<s.length(); i++){
                if(temp[i]!=0){
                    result = false;
                }
            }
        }
        else{
            result = false;
        }
        return result;   
    }
    public static void main(String[] args) {
        System.out.println();
        String Str[]=new String[]{"cat","god","act","dog","tac"};
        boolean check;
        System.out.println(Str[0].length()+" "+Str[1].length()+" "+Str[2].length());
        check=Anagram(Str[0],Str[1]);
        System.out.println(check);
        
    }
    
}
