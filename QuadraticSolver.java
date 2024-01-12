import java.util.*;
public class QuadraticSolver{

    public static void main(String[] args) {
        System.out.println("Welcome to the Quadratic Solver.");
        System.out.println("The Quadratic Formula is: (-b\u00B1sqrt(b^2-4(a)(c)))/(2a)");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'a': ");
        double a = input.nextDouble();
        System.out.println("Enter 'b': ");
        double b = input.nextDouble();
        System.out.println("Enter 'c': ");
        double c = input.nextDouble();

        double posAnswer = ((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        double negAnswer = ((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a);

        System.out.println();
        System.out.println("Positive answer = " + posAnswer);
        System.out.println("Negative answer = " + negAnswer);
        System.out.println();
        System.out.println("The solver will display 'NaN' if roots are imaginary.");

        input.close();

        System.out.println("Forcing a merge conflict.");
    }

}
