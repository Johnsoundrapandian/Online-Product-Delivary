package com.ProductDelivary;
import java.util.Scanner;
import java.util.*;
public class ManagementController {
    static Scanner scanner = new Scanner(System.in);
    static Products products = new Products();
    static ArrayList<Things>al = new ArrayList<>();
    public static void main(String[] args){
        managementController();

    }
    static void managementController(){
        boolean flag;
        products.productList();
        do{
            flag=false;
            System.out.println("1) add product ");
            System.out.println("2) remove product ");
            System.out.println("3) exit  ");
            System.out.print("Enter option : ");
            int option = scanner.nextInt();
            switch(option){
                case 1:
                    String mty = scanner.nextLine();
                    System.out.print("Enter thing name : ");
                    String thingName = scanner.nextLine();
                    System.out.print("Enter thing brand : ");
                    String thingBrand = scanner.nextLine();
                    System.out.print("Enter thing price : ");
                    double thingPrice = scanner.nextDouble();
                    products.product.add(new Things(thingName,thingBrand,thingPrice));
                    for(Things s:products.product){
                        System.out.println(s.getProduct());
                    }
                    do{
                        flag = false;
                        System.out.println("1) one more thing add or think remove");
                        System.out.println("2) Exit ");
                        System.out.print("Enter option : ");
                        int option1 = scanner.nextInt();
                        switch(option1){
                            case 1:
                                managementController();
                                break;
                            case 2:
                                System.out.println("Thank you... ");
                                break;
                            default:
                                System.out.println("in-valid option ");
                                flag = true;
                        }
                    }while(flag);
                    break;
                case 2:
                    String empty = scanner.nextLine();
                    System.out.print("Enter thing name : ");
                    String thingName1 = scanner.nextLine();
                    System.out.print("Enter thing product : ");
                    String thingBrand1 = scanner.nextLine();
                    System.out.print("Enter thing price : ");
                    double thingPrice1 = scanner.nextDouble();
                    al.add(new Things(thingName1,thingBrand1,thingPrice1));
                    boolean check=true;
                    for(Things i:al){
                        for(Things s:products.product) {
                            if (s.getProduct().equals(i.getProduct())) {
                                products.product.remove(i);
                                check=false;
                                break;
                            }
                        }
                        al.remove(i);
                    }
                    if(check) System.out.println("in-valid remove Thing :");
                    for(Things s:products.product){
                        System.out.println(s.getProduct());
                    }
                    do{
                        flag = false;
                        System.out.println("1) one more thing add or think remove");
                        System.out.println("2) Exit ");
                        System.out.print("Enter option : ");
                        int option1 = scanner.nextInt();
                        switch(option1){
                            case 1:

                                managementController();
                                break;
                            case 2:
                                System.out.println("Thank you... ");
                                break;
                            default:
                                System.out.println("in-valid option ");
                                flag = true;
                        }
                    }while(flag);

                    break;
                case 3:
                    System.out.print("Thank you ");
                    break;
                default:
                    System.out.print("in-valid option ");
                    flag =true;

            }

        }while(flag);
    }
}
