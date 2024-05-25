package Task;

import java.util.Scanner;
import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double course = 3.25;
        String sum = scanner.nextLine();
        Consumer<String> conversion = x -> {
            double y = Double.parseDouble(sum.replace("BYN", ""));
            System.out.println(y / course + " $");
        };
        conversion.accept(sum);
    }
}
