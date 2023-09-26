package Practice;

class inputMarks{
    int Eng;
    int maths;
    int computer;

}
public class marks{
    public static void main(String[] args) {
        inputMarks x=new inputMarks();
        System.out.println("Marks of 1st object");
        x.Eng=90;
        x.computer=100;
        x.maths=99;
        System.out.print("Marks: "+x.Eng+" "+x.computer+" "+x.maths);
        System.out.println();
        inputMarks y=new inputMarks();
        System.out.println("Marks of 2nd object");
        y.Eng=95;
        y.computer=99;
        y.maths=94;
        System.out.print("Marks: "+y.Eng+" "+y.computer+" "+y.maths);
        
    }
}