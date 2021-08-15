package LeetCode;

public class ReverseString {
    public static void main(String[] args) {
        char[] word={'s','u','j','a','l','l'};
        reverse(word);
        for(char item : word){
            System.out.print(item+" ");
        }
    }

    private static void reverse(char[] word) {
        int i=0;
        int j=word.length-1;
        while(i<j){
            char temp = word[j];
            word[j] = word[i];
            word[i] = temp;
            i++;
            j--;
        }
        
    }
}
