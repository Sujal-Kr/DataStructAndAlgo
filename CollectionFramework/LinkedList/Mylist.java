package CollectionFramework.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
public class Mylist{
    public static void main(String[] args) {
        ArrayList<Integer>roll = new ArrayList<>();
        ArrayList<String>names = new ArrayList<>();
        names.add("sujal");
        names.add("Shivam");
        names.add("Anup");
        names.add("Shoyo");
        names.add("Noya.San");
        System.out.println("names: " + names);
        roll.add(1);
        roll.add(2);
        roll.add(3);
        roll.add(4);
        roll.add(5);
        roll.remove(2);
        int sum=0;
        for(int i=0;i<roll.size();i++){
            sum+=roll.get(i);
        }
        System.out.println("sum:"+sum);
        Collections.sort(roll);
        System.out.println(roll.size());
        System.out.println("Roll no's are "+roll);
        String x[]=new String[names.size()];
        names.toArray(x);
        for(String item : x){
            System.out.print(item+" ");
        }
        System.out.println(roll.get(0));
        Mypair<String,Integer,Boolean> object = new Mypair<>();
        Mypair<Integer,Double,Boolean> object2 = new Mypair<>();
        object2.setType(4,5.8,false);
        object2.getType();
        object.setType("Sujal",829,true);
        object.getType();
    }
}