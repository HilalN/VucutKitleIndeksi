import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //define variables
        int weight;
        double height, BMI;

        //get users weight and height
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height (in meter): ");
        height = input.nextDouble();
        System.out.println("Enter your weight: ");
        weight = input.nextInt();

        //do the math
        BMI = weight / (height * height) ;

        //print the result
        System.out.println("Your BMI: " + BMI);
    }
}