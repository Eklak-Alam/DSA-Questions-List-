import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UniqueNumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};

        System.out.println("Brute Force Approach:");
        if (isUniqueBruteForce(arr)) {
            System.out.println("All elements have unique occurrences.");
        } else {
            System.out.println("Not all elements have unique occurrences.");
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println();

        System.out.println("Optimized Approach:");
        if (isUniqueOptimized(arr)) {
            System.out.println("All elements have unique occurrences.");
        } else {
            System.out.println("Not all elements have unique occurrences.");
        }
    }

    // ✅ Brute Force using List and nested loop - O(n^2)
    static boolean isUniqueBruteForce(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());

        for (int i = 0; i < frequencies.size(); i++) {
            for (int j = i + 1; j < frequencies.size(); j++) {
                if (frequencies.get(i).equals(frequencies.get(j))) {
                    return false;
                }
            }
        }

        return true;
    }

    // ✅ Optimized using HashSet - O(n)
    static boolean isUniqueOptimized(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> seenFrequencies = new HashSet<>();
        for (int freq : frequencyMap.values()) {
            if (!seenFrequencies.add(freq)) {
                return false; // duplicate frequency found
            }
        }

        return true;
    }
}
