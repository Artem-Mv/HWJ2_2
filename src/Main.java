import java.util.Scanner;

// немного не по схеме, но так интереснее и задачу выполняет :)
public class Main {
    public static void main(String[] args) {

        System.out.print("Введите ваш баланс: ");
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();

        System.out.print("На сколько хотите пополнить?: ");
        Scanner scanner1 = new Scanner(System.in);
        int sum = scanner.nextInt();
        System.out.println("Ваш баланс: " + (sum + balance));
        if (sum > 1000) {
            System.out.print("Бонусов за пополнение начислино: " + (sum / 100));
        }

    }
}