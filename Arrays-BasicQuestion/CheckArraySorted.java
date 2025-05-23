public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = checkArraySorted(arr);
        System.out.println("Is the array sorted? " + isSorted);
    }

    static boolean checkArraySorted(int[] arr) {

        if (arr.length == 0) {
            return false;
        }

        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        
        return true;
    }
}
