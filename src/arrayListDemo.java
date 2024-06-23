import java.util.*;
public class arrayListDemo {
    public static void main(String[] args){
        Students student1  = new Students("john","john1045@");
        Students student2  = new Students("arunkumer","arun2201@");
        Students student3  = new Students("buvanesh","buvi1029@");
        Map<Integer ,Students>al = new HashMap<>();
        al.put(56,student1);
        //System.out.println(al.contains("John"));
        //al.add(String.valueOf('g'));
        al.put(70,student2);
        al.put(67,student3);
        System.out.println(al.get(70));
        al.remove(56);
        System.out.println(al.containsKey(71));
        /*Iterator itr = al.iterator();
        while(itr.hasNext()){
            Students st = (Students)itr.next();
            System.out.println( st.usernames + " "+st.passwords );
        }*/
        for(Map.Entry i :al.entrySet() ){
            if(al.containsKey(70)){
            System.out.println(i.getKey() + "  "+ i.getValue());}
        }
    }
}
