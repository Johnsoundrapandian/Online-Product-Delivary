package comNeed;
class Hello {
    public int soundar(Bank bank, int a) {
        int amt = 0;
        try {
            amt = bank.john(a);
        } catch (Exception e) {
            System.err.println("Zero or negative value is not allowed.......  ");
            //return amt;
        }
        return amt;
    }
}

    interface Bank {
        int john(int a) throws Exception;
        // int john(int a) ;
    }

    class SBI implements Bank {
       // @Override
        public int john(int a) throws johnExeption {
            if (a <= 0) {
                throw new johnExeption();
            }
            return a;
        }
    }

    class IOB implements Bank {
        @Override
        public int john(int b) throws ArithmeticException {
            if (b <= 0) {
                throw new ArithmeticException();
            }
            return b;
        }
    }

    class HDFC implements Bank {
        @Override
        public int john(int c) throws RuntimeException {
            if (c <= 0) {
                throw new RuntimeException();
            }
            return c;
        }
    }

    class johnExeption extends Exception {
        johnExeption() {
            super();
        }
    }

    public class Transaction {
        public static void main(String[] args) throws Exception {
            Hello hello = new Hello();
            Bank bank = new HDFC();
            int amt = hello.soundar(bank, 20);
            if(amt != 0){
                System.out.println(amt+".Rs transaction is Successfully completed..... ");
            }
            else  System.out.println("invalid amount.. money transaction is failed.... ");
        }
    }

