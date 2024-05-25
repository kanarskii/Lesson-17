package Task;

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        double course = 3.25;
        Function<String, Double> conversion = x -> Double.parseDouble(x.replace("BYN",""))/course;
        System.out.println((conversion.apply(line)) + " $");

    }
}
