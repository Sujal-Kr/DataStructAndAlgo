package Practice;

import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        List<Integer> integer=new ArrayList<>();
        string.add("1,2,3");
        String str="";
        str+=string.get(0);
        System.out.println(str);
        String[] beti=str.split(",");
        for(int i=0; i<beti.length; i++){
            integer.add(Integer.valueOf(beti[i]));
        }
        integer.forEach(System.out::println);
        System.out.println("Shivam bot");       
    }
}
