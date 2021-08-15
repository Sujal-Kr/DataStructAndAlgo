package HackerRank;
public class SherlockandSquares {
    public static void main(String[] args) {
        int a=2;
        int b=9;
        int count=0;
        for(int i=(int)Math.sqrt(a);i*i<=b;i++){
            if(i*i>=a&&i*i<=b){
                count++;
            }
        }
        // int ra=(int)Math.sqrt(a);
        // int rb=(int)Math.sqrt(b);
        // if(ra*ra>=a){
        //     System.out.println(rb-(ra-1));
        // }
        // else{
        //     System.out.println(rb-ra);
        // }
        System.out.println(count);
    }
}
