import java.util.Scanner;

public class PasswordChecker {
    private int minLength = 3;
    private int maxRepeats = 2;


    public void setMinLength() {
        System.out.print("Введите мин. длину пароля: ");
        Scanner scanner = new Scanner(System.in);
        int passwordLength = scanner.nextInt();
        if(passwordLength < 0){
            throw new IllegalArgumentException("Недопустимое значение длины пароля");
        }
        minLength = passwordLength;

    }

    public void setMaxRepeats() {
        System.out.print("Введите макс. допустимое количество повторений символа подряд: ");
        Scanner scanner = new Scanner(System.in);
        int passwordRepeats = scanner.nextInt();
        if(passwordRepeats <= 0){
            throw new IllegalArgumentException("Недопустимое значение");
        }
        maxRepeats = passwordRepeats;

    }

    public boolean verify(String password) {

        if (minLength < 0 && maxRepeats <= 0) {
            System.out.println("Программа завершена");
            throw new IllegalStateException("Недопустимое состояние");
        }
        if (password.length() < minLength) {
            return false;
        }

        int currentRepeats = 1;
        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                currentRepeats++;
                if (currentRepeats > maxRepeats) {
                    return false;
                }
            } else {
                currentRepeats = 1;
            }

        }
        return true;
    }

}
