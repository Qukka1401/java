import java.util.Random;
import java.util.Scanner;
public class java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int c = random.nextInt(100);
            System.out.println("Хотите сыграть??");
            String a = sc.next();
            if ("yes".equals(a)) {
                System.out.println("ведите чсило от 1 до 100");
                int n = sc.nextInt();
                while (n != 0) {
                    if (n < c) {
                        System.out.println("Ваше число меньше!");
                        n = sc.nextInt();
                    }
                    if (n > c) {
                        System.out.println("Ваше число больше!");
                        n = sc.nextInt();
                    }
                    if (n == c) {
                        System.out.println("Вы выграли!");
                        break;
                    }
                }
            } else {
                System.out.println("Ну и ладно! Пока!");
                break;
            }
        }
    }
}