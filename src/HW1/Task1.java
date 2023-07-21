package HW1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        System.out.println("Треугольник: " + treugolnik(n));
        System.out.println("Произведение: "+ proizvedenie((n)) );
    }
    static int treugolnik(int n){
        int res=0;
        for (int i = 1; i <= n; i++) {
            res+=i;

        }
        return res;
    }

    static  int proizvedenie(int n){
        int res=1;
        for (int i = 1; i <=n ; i++) {
            res*=i;

        }
        return res;
    }
}
