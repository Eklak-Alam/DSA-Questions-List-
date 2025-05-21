public class CheckArrayContainNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int target = 4;

        for(int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Yes! Array contains the number " + target);
                break;
            }
        }
    }
}
