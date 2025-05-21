public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;

        // Reverse the array
        //Method 1
        for(int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.print("Method 1 ");
        System.out.println("Array after reversing: ");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("----------------------------");

        //Method 2
        int left = 0;
        int right = n - 1;

        for(int i = 0; i < n; i++) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("Method 2");
        System.out.println("Array after reversing: ");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
