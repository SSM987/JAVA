import java.util.Scanner;

public class E502 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        float n =s.nextFloat();
        if(n==0)
            System.out.print("ZERO");
        else if (n>0)
            System.out.print("positive");
            else
            System.out.print("negative");
            if(Math.abs(n)<1)
                System.out.print("\tsmall");
            else if (n>1_000_000)
                System.out.print("\tlarge");
            else
                System.out.print(" ");
    }
}
