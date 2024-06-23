import comException.johnException;

public class ExceptionHandling {
    public static void main(String[] args)throws johnException{
        int account = 1000;
        int withdraw  =0;
        int bal = account- withdraw;
        try{
           int i = account /withdraw;
//           if(account < withdraw){
//              throw new johnException("hi");
//           }
        }
        catch(ArithmeticException e){
            System.out.println("Error coming");
        }

        //System.out.println("Error coming");
//        catch(Exception e) {
//            System.out.println(e);
//          }
//        System.out.println(b.length());
        }
    }

