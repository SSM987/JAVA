import java.util.Scanner;

public class E609 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word:");
        String word = s.nextLine();
        for(int i = word.length()-1;i>=0;i--)
            System.out.print(word.charAt(i));
    }
}
