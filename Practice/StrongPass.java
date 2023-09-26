package Practice;

public class StrongPass {
    public static void main(String[] args) {
        String password="1!z2";
        int ans=solution(password);
        System.out.println(ans);
    }
    static int solution(String password){
        int n=password.length();
        //int Strong=0;
        String special="!@#$%^&*()-+";
        boolean[] check=new boolean[4];
        int count=0;
        for(int i=0; i<n; i++){
            char temp=password.charAt(i);
            if(Character.isLowerCase(temp)){
                check[0]=true;
                break;
            }
        }
        for(int i=0; i<n; i++){
            char temp=password.charAt(i);
            if(Character.isUpperCase(temp)){
                check[1]=true;
                break;
            }
        }
        for(int i=0; i<n; i++){
            char temp=password.charAt(i);
            if(Character.isDigit(temp)){
                check[2]=true;
                break;
            }
        }
        for(int i=0; i<n; i++){
            char temp=password.charAt(i);
            if(special.contains(Character.toString(temp))){
                check[3]=true;
                break;
            }
        }
        
        for(int i=0; i<4; i++){
            if(check[i]==false){
                count++;
            }   
        }
        //System.out.println(count);
        //#main juggad...
        if(n<6){
            if(count==0){
                //System.out.println("1");
                count= 6-n;
            }
            else{
                //System.out.println("2");
                if(n+count>=6){
                    return count;
                }
                count= 6-n;
            }
        }
    
        return count;
    }
}
