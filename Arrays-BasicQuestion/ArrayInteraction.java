import java.util.ArrayList;
import java.util.List;

public class ArrayInteraction {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 5, 3, 7, 8, 9};

        List<Integer> common = new ArrayList<>();
        

        for(int i = 0; i < arr1.length; i++) {
            int element = arr1[i];

            for(int j = 0; j < arr2.length; j++) {
                if (element == arr2[j]) {
                    common.add(element);
                    arr2[j] = Integer.MIN_VALUE;
                    System.out.println("Element " + element + " found in both arrays at index " + j + " of arr2" + " index " + i + " of arr1.");
                    break; // Exit the inner loop once a match is found
                }
            }
        }
        System.out.println("Common elements: " + common);
    }
}