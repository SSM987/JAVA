import java.util.Scanner;

public class E613 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = s.nextInt();
        System.out.println("binary code of this number is:");
        while(number!=0){
            System.out.println(number%2);
            number/=2;
        }
    }
}
