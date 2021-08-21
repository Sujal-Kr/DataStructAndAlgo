package CollectionFramework.ComprablesVsComprators;

public class Student /*implements Comparable<Student>*/ {
    
    String name;
    int marks;
    public Student(int marks,String name){
        this.name=name;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return this.name+" "+this.marks;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public int getmarks(){
        return this.marks;
    }
    public void setmarks(int marks){
        this.marks=marks;
    }
    
    
    // @Override
    // //Asc Order.
    // public int compareTo(Student o) {
    //     if(this.marks>o.marks){
    //         return 1; 
    //     }
    //     else if(this.marks<o.marks){
    //         return -1;
    //     }
    //     // if Marks are same then sort by name....
    //     // String allready implements comparable Interfaces..
    //     return this.name.compareTo(o.name);
    // }
   
}
