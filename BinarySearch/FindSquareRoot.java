package BinarySearch;

public class FindSquareRoot {
    public static void main(String[] args) {
        int number = 50;
        int result = findSquareRoot(number);
        System.out.println("The square root of " + number + " is: " + result);
    }

    static int findSquareRoot(int num) {
        int start = 0;
        int end = num;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            long square = (long) mid * mid; // Use long to prevent overflow
            if (square == num) {
                return mid;
            }

            if (square < num) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return ans;
    }
}
