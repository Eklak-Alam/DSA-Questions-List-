import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 1 };
        int duplicate = findDuplicate(arr);

        System.out.println("Finding duplicate using brute force approach");
        if (duplicate != -1) {
            System.out.println("Duplicate element found: " + duplicate);
        } else {
            System.out.println("No duplicate element found.");
        }

        System.out.println();
        System.out.println("======================================================");
        System.out.println();

        System.out.println("finding duplicate using optimized approach");
        int duplicateOptimized = findDuplicateOptimized(arr);
        if (duplicateOptimized != -1) {
            System.out.println("Duplicate element found (Optimized): " + duplicateOptimized);
        } else {
            System.out.println("No duplicate element found (Optimized).");
        }
    }

    static int findDuplicate(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1; // Return -1 if no duplicate is found
    }

    static int findDuplicateOptimized(int[] arr) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            } else {
                seen.add(num);
            }
        }

        return -1;
    }

    static int findDuplicateUsingSorting(int[] arr) {
        int n = arr.length;
        java.util.Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }

        return -1; // Return -1 if no duplicate is found
    }

    static int findDuplicateUsingFloydAlgorithm(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        // Finding the intersection point
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Finding the entrance to the cycle
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow; // The duplicate number
    }
}