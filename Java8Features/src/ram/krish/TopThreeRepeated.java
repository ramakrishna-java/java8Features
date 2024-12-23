package ram.krish;

import java.util.*;
import java.util.stream.Collectors;

public class TopThreeRepeated {
    public static void main(String[] args) {
        // Example ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 3, 2, 4, 1, 5, 3, 2, 1));

        // Count frequencies of each number using a map
        Map<Integer, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        // Sort the map by frequency in descending order and handle ties by order of appearance
        List<Map.Entry<Integer, Long>> sortedList = frequencyMap.entrySet().stream()
                .sorted((entry1, entry2) -> {
                    int compareByCount = entry2.getValue().compareTo(entry1.getValue());  // Compare by count
                    if (compareByCount == 0) {
                        return list.indexOf(entry1.getKey()) - list.indexOf(entry2.getKey());  // Resolve ties by first appearance
                    }
                    return compareByCount;
                })
                .limit(3)  // Take top 3
                .collect(Collectors.toList());

        // Print top 3 repeated integers
        System.out.println("Top 3 repeated integers:");
        sortedList.forEach(entry -> System.out.println(entry.getKey() + " with count " + entry.getValue()));
    }
}
