package prog2.prelimgroup;
import java.util.Scanner;
public class FractionArithmetic {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
        boolean menu = true;
        int choice=0;
        int num, den;
        System.out.println("Whalecum to the fraction chuchu");
        System.out.println("\n\nNow accepting input for fraction 1");
        System.out.println("Please input the following values as needed.");
        System.out.print("Please enter the numerator: ");
        num = kbd.nextInt();
        System.out.print("Please enter the denominator: ");
        den = kbd.nextInt();
        Fraction uInput1 = new Fraction(num, den);
        System.out.println("\n\nNow accepting input for fraction 2");
        System.out.println("Please input the following values as needed.");
        System.out.print("Please enter the numerator: ");
        num = kbd.nextInt();
        System.out.print("Please enter the denominator: ");
        den = kbd.nextInt();
        Fraction uInput2 = new Fraction(num, den);

        System.out.println("Fraction 1:" + uInput1.getNumerator() +"/"+  uInput1.getDenominator());
        System.out.println("Fraction 2:" + uInput2.getNumerator() +"/"+  uInput2.getDenominator());

        for (;menu;){
            System.out.println("+------------------------------------------+\n" +
                    "| What do you want to do?                  |\n" +
                    "|      1. Enter value of fraction 1        |\n" +
                    "|      2. Enter value of fraction 2        |\n" +
                    "|      3. Add fractions                    |\n" +
                    "|      4. Subtract fractions               |\n" +
                    "|      5. Multiply fractions               |\n" +
                    "|      6. Divide fractions                 |\n" +
                    "|      7. Reduce a fraction                |\n" +
                    "|      8. Quit                             |\n" +
                    "+------------------------------------------+");
            System.out.print("Enter Choice: ");
            choice = kbd.nextInt();
            switch (choice){
                case 1:
                    System.out.println("\n\nNow changing data for fraction 1");
                    System.out.println("Please input the following values as needed.");
                    System.out.print("Please enter the numerator: ");
                    num = kbd.nextInt();
                    System.out.print("Please enter the denominator: ");
                    den = kbd.nextInt();
                    uInput1.setDenominator(den);
                    uInput1.setNumerator(num);
                break;
                case 2:
                    System.out.println("\n\nNow changing data for fraction 2");
                    System.out.println("Please input the following values as needed.");
                    System.out.print("Please enter the numerator: ");
                    num = kbd.nextInt();
                    System.out.print("Please enter the denominator: ");
                    den = kbd.nextInt();
                    uInput2.setDenominator(den);
                    uInput2.setNumerator(num);
                break;
                case 3:

                break;
                case 4:

                break;
                case 5:

                break;
                case 6:

                break;
                case 7:

                break;
                case 8:
                    System.exit(0);
                break;
                default:
                    System.out.println("Invalid input. Try again.");

            }

        }
    }

}
