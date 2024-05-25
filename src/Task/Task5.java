package Task;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            return new StringBuilder(line).reverse().toString();
        };
        System.out.println(supplier.get());
    }
}
