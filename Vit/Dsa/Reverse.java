package Vit.Dsa;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        String str="asudfsdj";
        solution(str);
    }
    private static void solution(String str) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
