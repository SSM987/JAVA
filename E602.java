import java.util.Scanner;

public class E602 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many input do you have?");
        int lenghts = s.nextInt();
        int[] inputs = new int[lenghts];
        System.out.println("Please enter your inputs:");
    for(int i=0;i<inputs.length;i++) {
        inputs[i] = s.nextInt();
    }
        int largest = inputs[0];
        for (int j : inputs) {
            if (j > largest)
                largest = j;
        }
        int smallest = inputs[0];
        for (int j : inputs) {
            if (j < smallest)
                smallest = j;
        }
        int even = 0;
        int odd = 0;
        for (int j : inputs) {
            if (j % 2 == 0)
                even++;
            else
                odd++;
        }
        int cum=0;
        for (int input : inputs) {
            cum += input;
            System.out.print(cum + "\t");
        }
        int[]count= new int[1000000000];
        for (int input : inputs) count[input]++;
        System.out.println();
        System.out.print("adjacent duplicates are:");
        for(int i=0;i<count.length;i++)
            if(count[i]>1)
                System.out.print(i+"  ");
        System.out.println();
        System.out.println("largest input is: "+largest);
        System.out.println("smallest input is: "+smallest);
        System.out.println("number of even input: "+even);
        System.out.println("number of odd input: "+odd);
        s.close();
            }
    }
