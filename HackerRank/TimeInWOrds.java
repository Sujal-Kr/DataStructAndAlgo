package HackerRank;
import java.util.*;
public class TimeInWOrds {
    public static void main(String[] args) {
        int hr=5;
        int min=45;
        String words;
        words=solution(hr,min);
        System.out.println(words);
    }

    private static String solution(int hr, int min) {
        Map<Integer,String> m=new HashMap<>();
        String words;
        m.put(1,"one");m.put(2,"two");m.put(3,"three");m.put(4,"four");m.put(5,"five");
        m.put(6,"six");m.put(7,"seven");m.put(8,"eight");m.put(9,"nine");m.put(10,"ten");
        m.put(11,"eleven");m.put(12,"twelve");m.put(13,"thirteen");m.put(14,"fourteen");
        m.put(15,"quarter");m.put(16,"sixteen");m.put(17,"seventeen");m.put(18,"eighteen");m.put(19,"ninghteen");m.put(20,"twenty");m.put(21,"twenty one");
        m.put(22,"twenty two");m.put(23,"twenty three");m.put(24,"twenty four");m.put(25,"twenty five");m.put(26,"twenty six");m.put(27,"twenty seven");m.put(28,"twenty eight");m.put(29,"twenty nine");m.put(30,"half");
        String mins;
        if(min==1||min==59){
            mins="minute";
        }
        else{
            mins="minutes";
        }
        if(min==0){
            words=m.get(hr)+" "+"o' clock";
        }
       else if(min<=30){
           if(min==30)
           words=m.get(min)+" "+"past"+" "+m.get(hr);
           else if(min==15)
                words=m.get(min)+" "+"past"+" "+m.get(hr);
           else
                words=m.get(min)+" "+mins+" "+"past"+" "+m.get(hr);
       }
       else{
           if(hr==12){
               if(60-min==15)
                    words=m.get(60-min)+" "+"to one";
               else
                    words=m.get(60-min)+" "+mins+" "+"to"+" "+"one";
           }
           else{
                if(60-min==15)
                    words=m.get(min)+" "+"to "+m.get(hr+1);
                else
                    words=m.get(60-min)+" "+mins+" "+"to"+" "+m.get(hr+1);
           }
       }
        return words;
    }
}
