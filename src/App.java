import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of side x:");
        x = scanner.nextDouble();
        System.out.println("Enter the value of side y:");
        y = scanner.nextDouble();

        // The formula for calculating the hypotenuse of a right-angled triangle is
        // sqrt(x^2 + y^2)
        z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The hypotenuse of the right-angled triangle is: " + z);
        scanner.close();

    }
}
