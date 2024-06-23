import java.util.*;

 class heli{
     List<Hell>list = new ArrayList<>();
     public void hello () {
         list.add(new Hell("john", 10, "jki"));
         list.add(new Hell("hilton", 01, "jhjd"));
         list.add(new Hell("jsing",12,"dsfd"));
         list.add(new Hell("sadhu",17,"vhvd"));
         list.add(new Hell("jeb",8,"erwer"));
     }
 }
class Hell{
    String h;
    int j;
    String l;
    Hell(String s,int i,String s1) {
        h = s;
        j = i;
        l = s1;
    }
    public int getId(){
        return j;
    }

    public String getHell() {
        return "name  :" + h + "\n id  :"+j+"\n String  :"+l;
    }

}
public class Comparators {

    public static void main(String args[]){
        heli hi = new heli() ;
        // heli hii = new heli();
        List<Integer>lists = new ArrayList<>();

        hi.hello();
        for(int i = 0; i < hi.list.size();i++){
            int s = hi.list.get(i).getId();

           lists.add(s);

        }
        //System.out.println(lists.size());
        //int s1 = hi.list.get(0).getId();

        Comparator<Integer>ReverseComparator = (j1,j2) -> j1.compareTo(j2);
         lists.sort(ReverseComparator);
        for(int s:lists){
            System.out.println(s);
        }
    }

}
