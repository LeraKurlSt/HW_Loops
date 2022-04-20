import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        //        Равнобедренный треугольник:
//empty
        System.out.print("Give a height of the isosceles triangle: ");
        Scanner in = new Scanner(System.in);
        int Height = in.nextInt();
        System.out.println();
        for (int i = 0; i < Height; i++) {
            for (int k = 0; k <= Height * 2; k++) {
                if (k == Height - 1 - i || k == i + Height + 1){
                    System.out.print(" h ");
                }else if (i == Height - 1){
                    System.out.print(" l ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
