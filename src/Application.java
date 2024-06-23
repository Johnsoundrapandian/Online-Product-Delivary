/*import java.util.*;
import java.util.Scanner;
public class Application {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Display dis = new Display();
        dis.display();
    }
    static class Display {
        static void display() {
            System.out.println("----------------WELCOME--------------");
            boolean flag = true;
            Scanner scanner = new Scanner(System.in);
            //List <Student> user = new ArrayList<>();
            // List<String>al = new LinkedList<>();

            flag = true;
            do {
                flag = false;
                System.out.println("1) Start Application ");
                System.out.println("2) Exit application ");
                int chooce = scanner.nextInt();
                switch (chooce) {
                    case 1:
                        User.addGuest();
                        System.out.println(Student.getStudent());
                        break;
                    case 2:
                        System.out.println("Exit");
                }
            } while (flag);

            User.getApply();

        }

    }
}*/


