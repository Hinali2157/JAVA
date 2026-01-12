
import java.util.Scanner;

public class Pr5_Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of triangle !! ");
        System.out.println("enter a: ");
        double a = sc.nextDouble();
        System.out.println("enter b: ");
        double b = sc.nextDouble();
        System.out.println("enter c: ");
        double c = sc.nextDouble();
        double s = ((a + b + c) / 2);
        double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        if ((a + b) > c || (a + c) > b || (b + c) > a) {
            System.out.println("the Area of Triangle Is : " + Area);
        } else {
            System.out.println("the sum of any two side ia must be greater than the third side !! ");
        }
    }
}
