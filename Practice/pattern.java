package Practice;
public class pattern {
    public static void main(String[] args) {
        int n=5;
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<(n-i); j++) {
        //         System.out.print(" "+" ");
        //     }
        //     for(int j=0; j<2*i+1; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        
        for(int i=0; i<n;i++){
            if(i==0||i==n-1){
                for(int j=0; j<n;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
                continue;
            }
            for(int j=0;j<n;j++){
                
                if(j==0||j==n-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
                
            }
            System.out.println();
        }
        
    }
}
