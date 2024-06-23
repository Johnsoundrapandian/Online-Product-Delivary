import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Methods {
    List<String> customerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void addCustomer(){
         System.out.println("Enter the customer name :");
         String customer = scanner.nextLine();
         customerList.add(customer);
         System.out.println("add customer Successfully");
     }
     public void removecustomer(){
          String customer = scanner.nextLine();
          int position = findCustomer(customer);
          if(position == -1){
              System.out.println("does not match customer name.");
          }
          else{
              customerList.remove(position);
              System.out.println("cutomer name remove successfully. ");
          }
     }
     public int findCustomer(String customer){
         if(customerList.contains(customer)){
             System.out.println(customerList.indexOf(customer));

         }
         else{
             return -1;
         }
         return 0;
     }
     public void printArray(){
        for(int i = 0 ; i < customerList.size();i++){
            System.out.println(customerList.get(i));
        }
     }
}
