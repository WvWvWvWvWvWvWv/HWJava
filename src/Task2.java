public class Task2 {
    public static void main(String[] args) {
        for (int i = 2; i <1000; i++) {
            for (int j = 2; j <i; j++) {
                if(i%j==0)
                    i+=1;
        }
                System.out.println(i);

    }
}}
