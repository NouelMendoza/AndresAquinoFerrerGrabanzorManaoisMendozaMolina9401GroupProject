package prog2.prelimgroup;
import java.util.Scanner;
public class Fraction {
    private int numerator;
    private int denominator;
    static Scanner kbd = new Scanner(System.in);
    public Fraction(){
        numerator=0;
        denominator=0;
    }
    public Fraction(int wholeNumVal){
        numerator=wholeNumVal;
        denominator=1;
    }
    public Fraction(int num, int den){
        for (;den==0;){
            System.out.println("Denominator cannot be 0. Please input another number.");
            den=kbd.nextInt();
        }
        numerator=num;
        denominator=den;
    }

    public void setNumerator(int num){
        numerator=num;
    }
    public int getNumerator(){
        return numerator;
    }
    public void setDenominator(int den){
        denominator=den;
    }
    public int getDenominator(){
        return denominator;
    }
    public String toString(){
        return "Numerator: " + numerator + "\nDenominator: " + denominator;
    }
    public double toDouble(){
        return numerator/denominator;
    }


}
