import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PasswordChecker passCheck = new PasswordChecker();
        passCheck.setMinLength();
        passCheck.setMaxRepeats();
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите пароль или end:");
            String password = scanner.next();
            if(password.equals("end")){
                System.out.println("Программа завершена");
                break;
            }

            if(passCheck.verify(password)){
                System.out.println("Подходит!");
                System.out.println();
            }
            else {
                System.out.println("Не подходит!");
                System.out.println();
            }
        }


        //System.out.println("Введите пароль или end:");
        //Scanner scanner = new Scanner(System.in);
        //String pass = scanner.toString();
        //if(pass.equals("end")){
        //    break;
        //}

    }

}