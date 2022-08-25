import java.util.Scanner;

public class Numbers {

    public static void main(String [] args) {
        //to represent numbers as data, we'll use the data
        //types int and double

        //int - integer values (whole numbers)
        int num = 8;

        // = is an assignment operator -
        //evaluate (solve) what's on the right
        //then assign to the left
        num = num + 4;
        // - subtraction
        // * multiplication
        // / division
        // % modulo (mod) - remainder after division

        num = 5 * 3;
        System.out.println("5 * 3 is " + num);

        num = 10/2;
        System.out.println("10 / 2 is " + num);

        //integer division only evaluates the
        //integer part of the operation
        //it truncates (cuts off) any decimals
        num = 7/2;
        System.out.println("7 / 2 is " + num);

        //the decimal gets truncated regardless of
        //rounding rules
        num = 99/100;
        System.out.println("99 / 100 is " + num);

        //doubles have decimal points
        double numnum = 7.0;

        //division with doubles will evaluate as expected
        double quotient = numnum/2;
        System.out.println("7.0 / 2 is " + quotient);

        //since 7 and 2 are both ints (no decimal),
        //it evaluates as int division first
        double a = 7/2;
        System.out.println("a is " + a);

        double b = 7/2.0;
        System.out.println("b is " + b);

        double c = 7.0/2.0;
        System.out.println("c is " + c);

        //to cast (convert) from double to int,
        //any decimals get truncated (not rounded)
        int casted = (int)(3.5);
        System.out.println("3.5 casted to an int is " + casted);

        double toRound = 6.9999999;

        //regular rounding rules:
        //if the decimal is .5 or greater, round to the next
        //whole number, otherwise keep the current whole number
        //and truncate the decimal

        //add the rounding threshold before casting
        int rounded = (int)(toRound + .5);
        System.out.println(toRound + " rounded is " + rounded);

        Scanner input = new Scanner(System.in);
        //prompt the user for input
        System.out.println("Enter a number to round");

        //get and save a double input
        double numInput = input.nextDouble();

        //do the same thing as earlier - calculate the
        //rounded int and output the original number
        //and the rounded number

        int inputRounded = (int)(numInput + 0.5);
        System.out.println(numInput + " rounded is " + inputRounded);
    }
}
