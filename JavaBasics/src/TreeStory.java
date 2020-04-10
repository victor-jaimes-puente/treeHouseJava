import java.util.Scanner;
public class TreeStory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter firstName");
//        String firstName = scanner.nextLine();
//        System.out.printf("%s is learning Java", firstName);
        System.out.println();
        System.out.println("Enter a noun");
        String noun = scanner.nextLine();
        System.out.println();
        System.out.println("Enter an adjective");
        String adjective = scanner.nextLine();

        System.out.printf("A %s %s", adjective, noun);

    }

}