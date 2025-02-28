import java.util.Scanner;

public class E601e {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int b;
        int c=0;
        System.out.print("Enter a positive number:");
        int a = s.nextInt();
        while(a!=0){
            b =a%10;
           if(b%2==1)
               c+=b;
           a/=10;
        }
        System.out.println("the sum of all odd digit is "+c);
    }
}
