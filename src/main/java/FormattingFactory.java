import java.util.Scanner;

public class FormattingFactory {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String fullName = scanner.nextLine();
        fullName = NameFormatter.format();
        System.out.println(fullName);

    }
}
