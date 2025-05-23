public class FindMissingNumber1to10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10}; // missing number is 6
        int n = 10;

        int actualSum = (n * (n + 1) / 2); // sum from 1 to 10 = 55
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Correctly summing all elements
        }

        int missingNumber = actualSum - sum;

        System.out.println("The missing number is: " + missingNumber);
    }
}
