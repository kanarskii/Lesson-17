package Task;

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate dateB = LocalDate.parse(scanner.nextLine());
        LocalDate dateNew = dateB.plusYears(100);
        System.out.println(dateNew);
    }
}
