import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Равнобедренный треугольник:
//заполненный
        System.out.println("Give a height of the isosceles triangle: ");
        Scanner in = new Scanner(System.in);
        int Height = in.nextInt();
        for (int i = 0; i <= Height; i ++){
            for (int j = 1; j <= Height - i; j++){
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
