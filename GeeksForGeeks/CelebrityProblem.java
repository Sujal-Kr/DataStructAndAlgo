package GeeksForGeeks;
import java.util.Stack;
public class CelebrityProblem {
    public static void main(String[] args) {
        int celebs[][]={{0,1,0},{0,0,0}, {0,1,0}};
        System.out.println(celebrity(celebs));
    }

    private static int celebrity(int[][] celebs) {
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0; i<celebs.length; i++)st.push(i);
        // checking for each pair whether they know one another or not  are not if one does know other then push back in the stack and repeat this with every person 
        while(st.size()>=2){
            int x=st.pop();
            int y=st.pop();
            if(celebs[x][y]==0)st.push(x);
            else st.push(y);
        }
        // mark the last element as potential(could be celebrity)

        int pot=st.pop();
        int i;
        // now check if the potentially marked person is actually a celebrity or not 
        for(i=0; i<celebs.length; i++){
            // do not check for pot'th row and column
            if(i!=pot){
                // if any person does not potentially marked person or the pot knows someone then return -1 or else it will print the pottentially marked person.
                if(celebs[i][pot]==0||celebs[pot][i]==1)return -1;
            }
        }
        return pot;
    }
}
