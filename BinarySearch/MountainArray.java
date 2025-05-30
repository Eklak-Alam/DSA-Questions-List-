package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 4, 3, 2, 1};
        int ans = findMountain(arr);
        System.out.println("Mountain Peak Index: " + ans);
    }

    static int findMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid  = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
