import java.util.Scanner;

public class E603 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int co=0;
        System.out.print("Enter a line of string:");
        String inputs= s.nextLine();
        System.out.print("uppercase letters are:");
        for(char c:inputs.toCharArray())
            if(Character.isUpperCase(c))
                System.out.print(c);
        System.out.println();
        System.out.print("Second letters of string:");
    for(int i=1;i<inputs.length();i+=2) {
        System.out.print(inputs.charAt(i) + " ");
    }
        System.out.println();
    String inputs_without_vowels=inputs.replaceAll("[AaEeIiOoUu]","_");
        System.out.println("String without vowels is:"+inputs_without_vowels);
        for(char st:inputs.toCharArray())
            if("AaEeIiOoUu".indexOf(st)!=-1)
                co++;
        System.out.println("number of vowels are: "+co);
        System.out.print("positions of all vowels are:");
        for(int i=0;i<inputs.length();i++)
            if("AaEeIiOoUu".indexOf(inputs.charAt(i))!=-1)
                System.out.print(i+"\t");
        s.close();
    }
}
