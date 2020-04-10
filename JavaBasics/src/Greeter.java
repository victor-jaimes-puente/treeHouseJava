import java.util.Scanner;
public class Greeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO:  1. Create a new String named place and assign it a value of your choosing.

        // TODO:  2. Using the provided console object,
        //           prompt the user "What is your first name?" and store that in a variable

        // TODO:  3. Print out to the console "Hello <FIRST_NAME>!  Welcome to <PLACE>."

        String place = "Walmart";

        System.out.println("What is your first name? ");
        String firstName = sc.nextLine();

        System.out.printf("%s welcome to %s", firstName, place);
    }


}

