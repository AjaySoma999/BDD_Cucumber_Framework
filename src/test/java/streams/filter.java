package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
// Create a list of integers
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example 1: filter()
    //   List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Filtered even numbers: " + evenNumbers);

        // Example 2: map()
        List<String> numberStrings = numbers.stream()
                .map(n -> "Number " + n)
                .collect(Collectors.toList());
        System.out.println("Mapped number strings: " + numberStrings);

        // Example 3: flatMap()
        List<String> words = Arrays.asList("hello", "world");
        List<Character> characters = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Flattened characters: " + characters);

        // Example 4: forEach()
        System.out.println("Squared numbers:");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        // Example 5: reduce()
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);

        // Example 6: collect()
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers);

        // Example 7: sorted()
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted numbers: " + sortedNumbers);

        // Example 8: distinct()
        List<Integer> distinctNumbers = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5);
        List<Integer> uniqueNumbers = distinctNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique numbers: " + uniqueNumbers);

    }
}
