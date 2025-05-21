public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 23, 42, 12, 11, 1, 6, 4, 87};
        int n = arr.length;

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (n < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        for(int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
