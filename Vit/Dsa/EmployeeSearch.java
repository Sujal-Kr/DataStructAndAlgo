package Vit.Dsa;
import java.util.*;
public class EmployeeSearch {
    static class employee{
        int id;
        String name;
        int salary;
        employee(int id,String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }
    public static void main(String[] args) {
        employee arr[]=new employee[7];
        arr[0]=new employee(1,"Sujal",120);
        arr[1]=new employee(2,"Suman",100);
        arr[2]=new employee(3,"sejal",100);
        arr[3]=new employee(4,"simran",80);
        arr[4]=new employee(9,"ankit",90);
        arr[5]=new employee(6,"mohit",85);
        arr[6]=new employee(7,"ranu",95);

        
        int id=9;
        if(solution(arr,id)){
            System.out.println("Employee found");
        }else{
            System.out.println("Employee not found");
        }
    }
    private static boolean solution(employee[] arr, int id) {
        // sorting the employee array using lambda function on the basis of thier id.
        Arrays.sort(arr,(a,b)->(a.id-b.id));
        int count=0;

        int low=0;
        int high=arr.length-1;
        while(low<=high){
            count++;
            int mid=(low+high)/2;
            if(arr[mid].id==id){
                System.out.println("No of comparison = "+count);
                return true;
            }
            else if(arr[mid].id<id){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("No of comparison= "+count);
        return false;
    }
}
