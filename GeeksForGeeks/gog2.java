package GeeksForGeeks;
public class gog2 {
    public static void main(String[] args){
        String name="Geeks For Geeks";
        String[] names =name.split(" ");
        for(int i=0;i<3;i++){
            System.out.print(names[i].charAt(0));
        }
    }
}
