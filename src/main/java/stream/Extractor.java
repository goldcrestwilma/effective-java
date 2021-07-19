package stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Extractor {

    private Map<String, Long> frequency = new HashMap<>();

    public void createWords(String input) {
        try (Stream<String> words = new Scanner(input).tokens()) {
            frequency = words.collect(groupingBy(String::toLowerCase, counting()));
        }
    }

    public List<String> getTopTen() {
        return frequency.keySet().stream()
                        .sorted(comparing(frequency::get).reversed())
                        .limit(10)
                        .collect(toList());
    }
}
