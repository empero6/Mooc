
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        while (!value.isEmpty()) {
            String[] check = value.split(" ");
            for (String s : check) {
                System.out.println(s);
            }

            value = scanner.nextLine();
        }

    }
}
