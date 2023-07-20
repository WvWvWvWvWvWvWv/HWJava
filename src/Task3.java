import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        System.out.println("Что хотите сделать с числом? Введите знак +,-,*,/");
        String deistvie = scanner.next();
        System.out.println("Введите число: ");
        int n2 = scanner.nextInt();
        switch (deistvie) {
            case "+" -> System.out.println(n + n2);
            case "-" -> System.out.println(n - n2);
            case "*" -> System.out.println(n * n2);
            case "/" -> System.out.println(n / n2);
        }



    }
}
