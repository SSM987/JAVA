import java.util.Scanner;

public class E515 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your income:");
        double i = s.nextDouble();
        if (i >= 0 && i <= 50_000)
            i *= 0.01;
        else if (i > 50_000 && i <= 75_000)
            i *= 0.02;
        else if (i > 75_000 && i <= 100_000)
            i *= 0.03;
        else if (i > 100_000 && i <= 250_000)
            i *= 0.04;
        else if (i > 250_000 && i <= 500_000)
            i *= 0.05;
        else if (i > 500_000)
            i*=0.06;
        else
            System.out.println("Please enter your income correctly");
        System.out.println("your income tax is " +i);
    }
}
