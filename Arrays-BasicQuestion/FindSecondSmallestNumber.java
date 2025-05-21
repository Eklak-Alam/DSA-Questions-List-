public class FindSecondSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;

        if (n < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if (arr[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] > firstSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element");
        } else {
            System.out.println("The second smallest element is " + secondSmallest);
        }
    }
}
