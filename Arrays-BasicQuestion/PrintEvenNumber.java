public class PrintEvenNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 23, 45, 43, 67, 76, 34, 87, 45, 99, 23};
        int n = arr.length;
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                System.out.println("Even number: " + arr[i]);
            }
        }
        System.out.println("Total even number is: " + count);
    }
}
