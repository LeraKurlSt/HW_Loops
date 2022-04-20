import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give a width of the parallelogram: ");
        int Width = in.nextInt();
        for (int j = 1; j <= Width; j++) {
            System.out.print(" * ");
        }
        System.out.println();
        for (int i = 1; i <= Width - 2; i++) {
            for (int j = 0; j < Width + i; j++) {
                if (j == i || j == (Width + i - 1)){
                    System.out.print(" * ");
                }else if (j > i){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int k = 0; k <= (Width * 2 - 2); k++) {
            if (k < Width - 1){
                System.out.print("   ");
            }else {
                System.out.print(" * ");
            }
        }
        System.out.println();
    }
}
