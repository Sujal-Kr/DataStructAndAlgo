package Practice;

import java.util.*;
public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = in.nextInt();
        System.out.println("Enter the Element");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        int[] One = new int[arr.length];
        for (int i = 0; i < size; i++){
            int n=0;
            int num = arr[i];
            while(num > 0){
                n = num % 10;
                num = num / 10;
            }
            One[i] =n;
        }
        for(int i = 0; i < size-1; i++){
            int Index = i;
            for(int j = i; j < size; j++){
                if(One[j]>One[Index] ){
                    Index = j;
                }
                if(One[j]==One[Index]){
                    if(arr[j]>arr[Index] && (arr[j]>9 && arr[Index]>9)){
                        Index = j;
                    }
                    else if(arr[j]>arr[Index] && (arr[j]<10 && arr[Index]>9)){
                        Index = j;
                    }
                    else if(arr[j]>arr[Index] && (arr[j]>9 && arr[Index]<10)){
                        continue;
                    }
                }
            }
            int swap = One[i];
            One[i] = One[Index];
            One[Index] = swap;
            int temp = arr[i];
            arr[i] = arr[Index];
            arr[Index] = temp;
        }
        System.out.print("Largest Number that can be formed with the elements entered: ");
        for(int item: arr){
            System.out.print(item);
        }
        in.close();
    }
}
        
