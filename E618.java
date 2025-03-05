import java.util.Scanner;

public class E618 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to create diamond shape:");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= num - i - 1; j++)
                System.out.print(" ");
            for(int j=0;j<2*i+1;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=num-1;i>0;i--){
            for(int j = 0;j<=num-i;j++)
                System.out.print(" ");
            for(int j=0;j<2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
