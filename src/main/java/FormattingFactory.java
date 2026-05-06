import java.util.Scanner;

public class FormattingFactory {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("whats your Full name?");
        String fullName = scanner.nextLine();
        fullName = NameFormatter.format(fullName);
        System.out.println(fullName);

        System.out.println("whats your first name and last name?");
        String firstAndLastName = scanner.nextLine();
        firstAndLastName = NameFormatter.format(firstAndLastName);
        System.out.println(firstAndLastName);

        System.out.println("whats your prefix, full name and suffix ?");
        String completeName = scanner.nextLine();
        completeName = NameFormatter.format(completeName);
        System.out.println(completeName);


    }
}
