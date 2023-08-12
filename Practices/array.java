
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of students in your class: ");
        int n=in.nextInt();
        int[] marks=new int[n];
        System.out.println("Enter the marks of Students: ");
        int sum=0;
        for (int i=0;i<marks.length;i++){
            marks[i]=in.nextInt();
            sum += marks[i];
        }
        System.out.println("Total marks= "+sum);
        int avg=sum/marks.length;
        System.out.println("Average marks= "+avg);
        in.close();
    }

    public class split {
    }
    
}
