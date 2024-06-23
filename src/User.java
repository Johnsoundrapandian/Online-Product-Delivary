/*import java.util.*;
import java.util.List;
import java.util.Scanner;
public class User{
    static Scanner scanner =new Scanner(System.in);
    static List <Student> user = new ArrayList<>();

        public static void addGuest() {
            System.out.print("Enter the User name : ");
            String name = scanner.nextLine();
            System.out.print("Enter your password : ");
            String p_word = scanner.nextLine();
            char[] pword = p_word.toCharArray();
            if (pword.length >= 8 && pword.length <= 15) {
                int count = 0;
                for (int i = 0; i < pword.length; i++) {
                    if (pword[i] == '@' || pword[i] == '#' || pword[i] == '$') {
                        count += 1;
                    }
                }
                if (count == 1) {
                    user.add(new Student(name, p_word));
                } else {
                    System.out.println("Special characters are allowed for only 1 time :");
                    addGuest();
                }
            } else {
                System.out.println("password length are 8 characters to 15 characters are allowed.Special allowed characters are use only 1 time ");
                addGuest();
            }
        }
    public static void getApply(){
        boolean flag = true;
        do {
            flag = false;
            System.out.println("1) Again Start Application ");
            System.out.println("2) Exit application ");
            int chooce = scanner.nextInt();
            switch (chooce) {
                case 1:
                    Application.Display.display();
                    break;
                case 2:
                    System.out.println("---------Thank You---------");
                    break;
                case 3:
                    System.out.println("re-enter the option");
                    flag = true;
            }
        } while (flag);
    }
}*/



