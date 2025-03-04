import java.util.Scanner;

public class E608 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word:");
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++)
            System.out.println(str.charAt(i));
    }
}
