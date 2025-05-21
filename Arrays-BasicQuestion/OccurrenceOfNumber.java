import java.util.Scanner;

public class OccurrenceOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to find its occurrence: ");
        int number = scanner.nextInt();

        int count = 0;

        for(int i = 0; i < size; i++) {
            if (arr[i] == number) {
                count++;
            }
        }

        System.out.println("Occurrence of " + number + " in the array is: " + count);

        scanner.close();
    }
}
