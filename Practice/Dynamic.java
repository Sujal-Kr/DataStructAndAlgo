package Practice;

public class Dynamic {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("sdidfsdjfsldfsdlkf;sddfl;smf;sdf'md'f;sdfmsd;fms;dfm;sdf;sd");
        System.out.println(str.capacity());
        str.charAt(0);
        str.delete(0,str.length());
        System.out.println(str);
    }
}
