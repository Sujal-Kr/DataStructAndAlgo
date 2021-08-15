package Practices;
public class Student {
    int id;
    String name;
    Student(){
        System.out.println("this is default constructor.");
    }
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Default constructor values");
        System.out.println("Student id:"+s.id+" "+"Student name:"+s.name);
        System.out.println("paramaterized Constructor");
        Student student=new Student();
        System.out.println("Student id:"+student.id+" "+"Student name:"+student.name);
    }
}
