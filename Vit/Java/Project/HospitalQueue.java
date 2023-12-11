/**
 * The HospitalQueue  is a Java program that generates a hospital queue by allowing users to input
 * patient names and priorities, and then gives the order they would be treated based on their severity.
 */
package Vit.Java.Project;
import java.util.*;
public class HospitalQueue {
    static class patient{
        String name;
        int priority;
        patient(String name,int priority){
            this.name=name;
            this.priority=priority;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Lambda function used as parameter to define the order of the patient based on the priority
        PriorityQueue<patient> Patients=new PriorityQueue<>((a,b)->a.priority-b.priority);
        System.out.println("\nPriority according to the severity of the patient");
        System.out.println("1.Emergency Case");
        System.out.println("2.Ugrent Case");
        System.out.println("3.Non Urgent Case");
        System.out.println("4.Stable Diseases Case");
        System.out.println("5.Routine Checkups");
        System.out.println("_______________________\n");
        System.out.print("Enter the no of patients: ");
        int no_of_patients=in.nextInt();
        System.out.println("\nEnter the name and priority of the patient");
        for(int i=1;i<=no_of_patients;i++){
            System.out.print("Patient "+i+": ");
            String name=in.next();
            int priority=in.nextInt();
            Patients.add(new patient(name, priority));
        }
        System.out.println("\nThe Patient would be treated as per the order based  on thier severity");

        while(!Patients.isEmpty()){
            System.out.println(Patients.remove().name);
        }
        in.close();
    }
}
