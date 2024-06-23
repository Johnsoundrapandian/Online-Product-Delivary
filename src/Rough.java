import java.util.*;
public class Rough {
    public static void main(String args[]){
        List<Integer>a = new LinkedList<>();
        a.add(2);
        a.add(4);
        a.add(3);
        List<Integer>b = new LinkedList<>();
        List<Integer>c = new LinkedList<>();
        b.add(5);
        b.add(6);
        b.add(4);
        a.reversed();
        b.reversed();
        int temp1 = 0,temp2 =0;
        for(int i :a){
             temp1 = temp1*10+i;
        }
        for(int i :b){
            temp2 = temp2*10+i;
        }
        int temp = 0;
        temp = temp1+temp2;
        for(int i  =0 ; temp!= 0; i++){
            int rev = temp%10;
            temp = temp/10;
            c.add(rev);
        }
        System.out.println(c);
    }
}
