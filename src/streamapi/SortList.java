package streamapi;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

        public static void main(String[] args) {
            List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");

            // Sorting the list in natural order
            List<String> sortedNames = names.stream()
                    .sorted()
                    .collect(Collectors.toList());

            //sort in reverse order
            List<String> sortedDesc = names.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());


            System.out.println("Sorted List: " + sortedNames);
        }
}
