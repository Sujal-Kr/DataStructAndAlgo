package Vit.Java;
public class McaStudents{
    // same for all Mca Students..
    static String CourseName="Master of Computer Application";
    String name;
    String regNo;
    McaStudents(String name, String regNo){
        this.name = name;
        this.regNo = regNo;
    }
    // since syllabus is same for all students so it is better to make it static
    static void accessSyllabus(){
        System.out.println("Your Syllabus is here....\n1.Maths:Calculus\n2.Java:oops\n3.Dsa:Algorithms");
    }   
    void getMarks(){
        System.out.println(this.regNo+" Total Marks is:"+Math.round(Math.random()*1000));
    }

    public static void main(String[] args) {
        System.out.println(McaStudents.CourseName);
        McaStudents.accessSyllabus();
        McaStudents student1=new McaStudents("Sujal Kumar","MCA10069");
        student1.getMarks();
        McaStudents student2=new McaStudents("Lord Marshal","MCA10089");
        student2.getMarks();    
    }
}
