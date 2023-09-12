package Vit.Java;
import java.util.*;
class Constitution {
    public List<String> rules;
    Constitution(){
        this.rules = new ArrayList<String>();
    }
    List<String> getRules(){
        return this.rules;
    }
    void setRules(String rule){
        this.rules.add(rule);
    }
}
class CentralGovt extends Constitution {
    private int MPs;
    protected String exam_rule;
    void conductNdaExams() {
        System.out.println("Conduction of Exams under central Gov");
    } 
    void getDetails(){
        System.out.println(this.MPs);
    }

}
class StateGov extends Constitution{
    public String gov_name;
    void implementRule(){
        System.out.println("Rules implemented");
    }
}
class ArmedForce extends CentralGovt {
    public int strength;
    void getExamRules(){
        System.out.println(exam_rule);
    }
}

class police extends StateGov{
    private int batchId ;
    public String name;
    police(int id,String name){
        this.batchId = id;
        this.name = name;
    }
    void maitainLawandOrder(){
        System.out.println("Maintained");
    }
    
}
public class HybridClass{
    public static void main(String[] args) {
        Constitution x=new Constitution();
        x.setRules("Ipc 420 "); 
        System.out.println(x.rules);
        police police =new police(232, " Mr Roy");
        police.maitainLawandOrder();
    }
}
