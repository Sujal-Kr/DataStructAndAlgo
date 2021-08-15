package HackerRank;


public class SuperDigit {
    public static void main(String[] args) {
       String n="123";
       int k=3;
       System.out.println(solution(n,k));
       
    }
    public static int  digit(long no){
        if(no>=0&&no<=9)return (int)no;
        int  s=0;
        while(no>0){
            s+=(no%10);
            no/=10;
        }
        return digit(s);
    }

    public static int solution(String n,int k){
        long  no=Integer.parseInt(n);
        no*=k;
        System.out.println(no);
        return digit(no);
        
    }    
}
