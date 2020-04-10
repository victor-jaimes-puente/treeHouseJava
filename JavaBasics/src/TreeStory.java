import java.util.Scanner;
public class TreeStory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = scanner.nextLine();
        System.out.printf("%s is learning Java", firstName);
    }

}