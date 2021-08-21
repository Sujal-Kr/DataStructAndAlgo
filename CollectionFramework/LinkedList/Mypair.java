package CollectionFramework.LinkedList;
//use of generics..
public class Mypair<X,Y,Z> {
    private X type1;
    private Y type2;
    private Z type3;
    //setter and getter methods...
    void setType(X type1, Y type2, Z type3){
        this.type1=type1;
        this.type2=type2;
        this.type3=type3;
    }
    void getType(){
        System.out.println("Your outputs are");
        System.out.println(this.type1);
        System.out.println(this.type2);
        System.out.println(this.type3);
    }
}

