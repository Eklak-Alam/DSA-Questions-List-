import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Brute Force: " + findAllDuplicateBruteForce(arr));
        System.out.println("Using HashSet: " + usingHashSet(arr));
    }


    static List<Integer> findAllDuplicateBruteForce(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1 && !result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }

        return result;
    }

    static HashSet<Integer> usingHashSet(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.keySet()) {
            if (map.get(num) > 1) {
                result.add(num);
            }
        }
        return result;
    }
}
