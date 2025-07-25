package streamapi;

import java.util.Map;

public class MapStream {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 11, "B", 2);
        map.entrySet().stream()
                .filter(e -> e.getValue() > 10)
                .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

    }
}
