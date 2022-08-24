// Java classes are program files
// -class names need to start with a
// capital letter and have no spaces
// -a class name needs to match the file
// name exactly

//all code will go inside the curly braces
//for the class
public class StringIntro {

    //this is the main method
    //for now, all code we write will go in main()
    public static void main(String [] args) {

        //this is a print statement in java
        System.out.print("Hi");

        //"Hi" is a string
        //Strings are letters, numbers, and characters
        //that can be printed or saved as values
        //-the String value won't be interpreted as code

        //without quotes, java thinks Hi is a variable
        //but it isn't, so there's an error

//        System.out.print(Hi);

        //-print() prints on the same line as what's
        //already there
        //-println() will put in a line break AFTER
        //whatever you're printing
        System.out.println();

        //to declare a variable is to reference it for
        //the first time and give its initial value

        String name = "Cave Johnson";
        //the convention for variable names is
        // camelCase - lowercase first letter, any other
        //words have their first letter capitalized

        System.out.println(name);

        //concatenate (join) strings with +
        System.out.println("Hi, my name is " + name);



    }
}
