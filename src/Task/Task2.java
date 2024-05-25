package Task;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, -1, 2, -2, 3, -3};
        Predicate<Integer> predicate = x -> x > 0;
        for (int x : array) {
            if (predicate.test(x)) {
                System.out.print(x + " ");
            }
        }
    }
}
