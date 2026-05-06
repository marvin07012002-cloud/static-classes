import java.util.Scanner;

public class FormattingFactory {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("whats your Full name?");
        String fullName = scanner.nextLine();
        fullName = NameFormatter.format(fullName);
        System.out.println(fullName);



    }
}
