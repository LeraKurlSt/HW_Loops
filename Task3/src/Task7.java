import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        while (x > 0){
            System.out.print(x % 10);
            x = x / 10;
        }
    }
}
