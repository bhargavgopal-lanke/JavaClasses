import java.util.Arrays;

public class StreamJava {
    public static void main(String[] args) {
        String[] arrayObj = { "test@gmail.com", "test@gmail.com", "orange", "apple", "banana", "pine", "poland" };
        Arrays.stream(arrayObj)
                .map(item -> item.toUpperCase())
                .forEach(System.out::println);
        Arrays.stream(arrayObj)
                .filter(filterItem -> filterItem.charAt(0) == 'p')
                .map(filteredItems -> filteredItems.toUpperCase())
                .forEach(System.out::println);
    }
}
