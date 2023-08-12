

public class RevSent {
    public static void main(String[] args) {
        String Str="the sky is blue";
        int i=Str.length()-1;
        //result string.
        String temp="";
        while(i>=0){
            //this loops is terminating the Trialing Spaces.
            while(i>=0&&Str.charAt(i)==' '){
                i--;
            }
            //reruired for substring
            int j=i;
            while(i>=0&&Str.charAt(i)!=' '){
                i--;
            }
            //concatinating the words.
            if(temp.isEmpty()){
                temp=temp+Str.substring(i+1,j+1);
            }
            else{
                //for adding spaces.
                temp=temp+" "+Str.substring(i+1, j+1);
            }
        }
        System.out.println(temp);
        
    }
}
