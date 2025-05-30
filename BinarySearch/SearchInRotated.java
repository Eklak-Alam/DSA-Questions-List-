package BinarySearch;

public class SearchInRotated {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = searchInRotatedArray(arr, target);
        System.out.println("Index of target " + target + " is : " + result);
    }

    static int searchInRotatedArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[start] <= arr[mid]) {
                // Left half is sorted
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                // Right half is sorted
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                }
                else { 
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
