package CollectionFramework.ComprablesVsComprators;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        List<Student>students = new ArrayList<>();
        students.add(new Student(89,"Akashi"));
        students.add(new Student(67,"Akashi"));
        students.add(new Student(34,"Apple"));
        students.add(new Student(78,"Oaikawa"));
        students.add(new Student(90,"Hoshimigi"));
        //using anonymous class to implement Comprator Interfaces..
        Collections.sort(students,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.name.equals(o2.name)){
                    return o1.marks-o2.marks;
                }
                else{
                    return o1.name.compareTo(o2.name);
                }
            }
        });
        System.out.println(students.get(0).getName());
        students.forEach(System.out::println);
    }
}
//using Comprators
// class namethenmarks implements Comparator<Student>{

//     @Override
//     public int compare(Student o1, Student o2) {
//         if(o1.name.equals(o2.name)){
//             return o1.marks-o2.marks;
//         }
//         else{
//             return o1.name.compareTo(o2.name);
//         }
//     }

// }