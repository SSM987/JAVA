import java.util.Scanner;

public class E617 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = s.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++)
                System.out.print("*");
            System.out.print("  ");
            for (int j = 0; j < number; j++) {
                if (i == 0 || j == 0 || i == number - 1 || j == number - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}