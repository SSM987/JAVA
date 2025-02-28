import java.util.Arrays;
import java.util.Scanner;

public class E518 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first string:");
        String str1 = s.next();
        System.out.print("Enter second string:");
        String str2 = s.next();
        System.out.print("Enter third string:");
        String str3 = s.next();
        String[] str={str1,str2,str3};
        Arrays.sort(str);
       for(String so:str)
           System.out.println(so);
    }
}
