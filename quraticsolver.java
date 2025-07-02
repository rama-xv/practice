
public class quraticsolver {
    public static void main(String[] args) {
       int a = 2;
int b = 5;
int c = -3;

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2.0 * a);
            System.out.println("One real root: " + root);
        } else {
            System.out.println("No real roots. Discriminant is negative.");
        }
    }
}

