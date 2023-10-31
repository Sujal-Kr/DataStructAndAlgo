package Vit.Dsa;

public class FacultyRadixSort {
    static class Faculty{
        String name;
        int id;
        String sub_code;
        String class_name;

        Faculty(String name, int id, String sub_code, String class_name){
            this.name = name;
            this.id = id;
            this.sub_code = sub_code;
            this.class_name = class_name;
        }
    }
    public static void main(String[] args) {
        Faculty faculty[]=new Faculty[5];
        faculty[0]=new Faculty("Ramanujan",114,"MAT001","C11");
        faculty[1]=new Faculty("J sai Deepak",12,"LAW101","D15" );
        faculty[2]=new Faculty("Gurpreet Singh",301,"CAT231","E12");
        faculty[3]=new Faculty("Lokesh Rahul",1,"CR102","S12");
        faculty[4]=new Faculty("Dayanad",23,"PHY001","D34");
        radixSort(faculty);
        System.out.println("After Sorting on the basis of the faculty's Id");
        for(Faculty item : faculty) {
            System.out.println(item.id+" "+item.name+" "+item.sub_code);
        }
        
    }
    
    private static void radixSort(Faculty[] arr) {
        int max=Integer.MIN_VALUE;
        for(Faculty item:arr) {
            max=Math.max(max,item.id);
        }
        int digits=countDigits(max);
        int place=1;
        while(digits-->0){
            countSort(arr,place);
            place*=10;
        }

    }
    private static void countSort(Faculty[] arr, int place) {
        int max=Integer.MIN_VALUE;
        for(Faculty item:arr) {
            max=Math.max(max,item.id);
        }
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[(arr[i].id/place)%10]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        Faculty[] output=new Faculty[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            output[count[(arr[i].id/place)%10]-1]=arr[i];
            count[(arr[i].id/place)%10]--;
        }
        for(int i=0;i<output.length;i++){
            arr[i]=output[i];
        }
    }
    private static int countDigits(int max) {
        int count=0;
        while(max>0){
            max/=10;
            count++;
        }
        return count;
    }
}
