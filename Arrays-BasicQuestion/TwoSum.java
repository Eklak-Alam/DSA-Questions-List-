import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int target = 10; // Example target sum

        System.out.println("Using brute force approach");
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }

        System.out.println();
        System.out.println("==========================");
        System.out.println();

        // Using HashMap for better performance

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int target2 = 10; // Example target sum
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Using HashMap approach");
        for(int i = 0; i < arr2.length; i++) {
            int complement = target2 - arr2[i];
            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + arr2[i] + " + " + complement + " = " + target2);
            }
            map.put(arr2[i], i);
        }
        
    }
}
