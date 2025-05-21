public class PrintOddNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 23, 45, 43, 67, 76, 34, 87, 45, 99, 23};
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i] + " is an odd number.");
                count++;
            }
        }
        System.out.println("Total odd numbers: " + count);
    }
}
