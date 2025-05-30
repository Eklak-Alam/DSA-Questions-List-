package BinarySearch;

public class FindTheNumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8, 9};
        int target = 4;
        int[] result = findOccurrence(arr, target);
        System.out.println("Number: " + target + " First Occurrence: " + result[0] + ", Last Occurrence: " + result[1]);

        System.out.println("Number of occurrences: " + (result[1] - result[0] + 1));
    }

    static int[] findOccurrence(int[] arr, int target) {
        int first = firstOccurrence(arr, 0, arr.length - 1, target);
        int last = lastOccurrence(arr, 0, arr.length - 1, target);
        return new int[]{first, last};
    }

    static int firstOccurrence(int[] arr, int start, int end, int target) {
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            }
            else if (arr[mid] < target) { 
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return first;
    }

    static int lastOccurrence(int[] arr, int start, int end, int target) {
        int last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return last;
    }
}
