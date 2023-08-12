

public class AppConfig {
    private AppConfig(){

    }
    //cant create multiple objects....
    private static AppConfig obj=new AppConfig();
    //can called to create multiple obj.
    static AppConfig getInstance(){
        return obj;
    }
}//its an example of singltion class
