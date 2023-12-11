package CollectionFramework.CodeVita;
import java.util.*;



public class Orchard {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String x=in.nextLine();
        int one=solution(str,'M');
        int two=solution(x,'L');
        if(one==two){
            System.out.println("Draw");
        }
        else if(one>two){
            System.out.println("Ashok");
        }else{
            System.out.println("Anand");
        }
        in.close();
    }

    private static int solution(String str,char cmp) {
        int count=0;
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<str.length(); i++) {

            for(int j=i; j<str.length(); j++) {
                if(stack.isEmpty()){
                    stack.push(str.charAt(j));
                    continue;
                }
                else{
                    if(stack.size()<=3&&stack.peek()!=cmp){
                        stack.push(str.charAt(j));
                    }
                    else{
                        if(stack.size()==3){
                            stack.pop();
                        }
                    }
                }
            }
            while(!stack.isEmpty()){
                if(stack.pop()==cmp)count++;
            }
            stack.clear();
            
        }
        
        return count;
    }
}
