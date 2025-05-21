public class FindMinElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 23, 45, 43, 67, 76, 34, 87, 45, 99, 23};
        int n = arr.length;

        int min = arr[0];

        for(int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The minimum element in the array is: " + min);
    }
}
