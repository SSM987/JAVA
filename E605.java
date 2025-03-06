import java.util.Scanner;

public class E605 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        double y;
        System.out.print("How many number do you have?");
        int lenghts = s.nextInt();
        System.out.println("Please enter your numbers:");
        double[] inputs = new double[lenghts];
        for (int i = 0; i < inputs.length; i++)
            inputs[i] = s.nextDouble();
        x=getlargest(inputs,lenghts);
        y=getSmallest(inputs,lenghts);
        System.out.println("The largest number is: "+x);
        System.out.println("The smallest number is: "+y);
        System.out.println("The average is: "+getAverage(inputs,lenghts));
        System.out.println("The range is: "+getRange(x,y));
    }

    public static double getAverage(double[] inputs, int lenghts) {
        double sum = 0;
        for (int i = 0; i < lenghts; i++)
            sum += inputs[i];
        return sum / lenghts;
    }

    public static double getSmallest(double[] inputs, int lenghts) {
        double smallest = inputs[0];
        for (int i = 0; i < lenghts; i++)
            if (inputs[i] < smallest)
                smallest = inputs[i];
        return smallest;
    }

    public static double getlargest(double[] inputs, int lenghts) {
        double largest = inputs[0];
        for (int i = 0; i < lenghts; i++)
            if (inputs[i] > largest)
                largest = inputs[i];
        return largest;
    }
    public static double getRange(double x,double y){
        return x-y;
    }
}
