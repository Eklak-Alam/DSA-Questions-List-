package BinarySearch;

public class FindFirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9};
        int target = 4;
        int[] result = findFirstLastIndex(arr, target);
        System.out.println("Number: " + target + " First Index: " + result[0] + ", Last Index: " + result[1]);
    }

    static int[] findFirstLastIndex(int[] arr, int target) {
        int first = firstIndex(arr, 0, arr.length - 1, target);
        int last = lastIndex(arr, 0, arr.length - 1, target);
        return new int[]{first, last};
    }

    static int firstIndex(int[] arr, int start, int end, int target) {
        int first = -1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return first;
    }

    static int lastIndex(int[] arr, int start, int end, int target) {
        int last = -1;

        while (start <= end) {
            int mid  = start + (end - start) / 2;

            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else { 
                end = mid - 1;
            }
        }

        return last;
    }

}
