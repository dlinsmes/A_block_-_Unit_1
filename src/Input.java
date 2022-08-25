//this line lets you use the built-in Scanner, which lets
// you get keyboard input

import java.util.Scanner;

public class Input {

    public static void main(String [] args) {

        //declare and instantiating (giving first value to) a String variable
        //called lunch
        String lunch = "sandwich";

        //print a concatenated (joined) String
        System.out.println("I have a " + lunch + " for lunch today");

        //similar to declaring the String variable,
        //we declare a Scanner that we're calling input

        //input is just a variable name - call it what you want
        Scanner input = new Scanner(System.in);

        //print out a prompt first
        System.out.println("What do you have for lunch today?");

        //wait for input from the user
        //when your program gets input, it pauses until the user enters
        //something
        String userLunch = input.nextLine();

        //save the input to variable in order to use it

        //this line won't run until after the user has entered something
        System.out.println("Cool, bro");

        System.out.println("I don't have a lunch. Do you have two " + userLunch + "s?");

    }
}
