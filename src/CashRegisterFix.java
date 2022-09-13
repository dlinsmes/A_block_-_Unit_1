import java.util.Scanner;

public class CashRegisterFix {
    public static void main(String [] args) {
        System.out.println("Enter a money amount");
        Scanner s = new Scanner(System.in);
        double amt = s.nextDouble();

        System.out.println("amt is " + amt);

        double cents = amt % 1;
        cents *= 100;
        //this is the same as saying cents = cents * 100
        //can also do this for +=, -=, /=
        //cents++ is the same as cents = cents + 1 or cents+= 1
        //this also works for cents-- (but not ** or //)
        System.out.println("cents: " + cents);

        int roundedCents =(int)(cents + .5);
        System.out.println("rounded cents: " + roundedCents);



    }
}
