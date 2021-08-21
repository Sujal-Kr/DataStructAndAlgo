package CollectionFramework.LinkedList;
import java.util.*;
public class NestedList {
    public static void main(String[] args) {
        List<Integer> one=new ArrayList<>();
        List<Integer> two=new ArrayList<>();
        List<Integer> three=new ArrayList<>();
        List<List<Integer>> matrix=new ArrayList<>();
        one.add(1);
        one.add(2);
        one.add(3);
        two.add(4);
        two.add(5);
        two.add(6);
        three.add(7);
        three.add(8);
        three.add(9);
        matrix.add(one);
        matrix.add(two);
        matrix.add(three);
        System.out.println(matrix);
        for(int i = 0; i <matrix.size(); i++){
            for(int j = 0; j<matrix.size(); j++){
                System.out.print(matrix.get(i).get(j));
            }
            System.out.println();
        }

    }
}
