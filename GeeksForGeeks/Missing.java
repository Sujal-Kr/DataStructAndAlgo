 package GeeksForGeeks;
import java.util.Scanner; 
public class Missing {
    public static void main(String[] args){
        System.out.println("Enter the Size of the 1st array:");
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int a[]=new int[n1];
        int f;
        System.out.println("Enter the elements of 1st array:");
        for(int i=0; i<n1; i++){
            a[i]=in.nextInt(); 
        }
        System.out.println("Enter the Size of the 2nd array:");
        int n2=in.nextInt();
        int b[]=new int[n2];
        System.out.println("Enter the elements of 2nd array:");
        for(int i=0; i<n2; i++){
            b[i]=in.nextInt(); 
        }
        System.out.print("Missing no:");
        for(int i=0; i<n1; i++){
            f=0;
            for(int j=0; j<n2; j++){
                if(a[i]==b[j]){
                    f++;
                } 
            }
            if(f==0){
                System.out.print(a[i]+" ");
            }
        }
        in.close();
    }
    
}
