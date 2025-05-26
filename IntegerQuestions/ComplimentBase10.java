package IntegerQuestions;

public class ComplimentBase10 {
    public static void main(String[] args) {
        int number = 5; // Example number
        int complement = printComplement(number);
        System.out.println("The complement of " + number + " is: " + complement);
    }

    static int printComplement(int n) {
        int mask = 0;
        int temp = n;

        while (temp != 0) {
            mask = mask << 1 | 1;
            temp = temp >> 1;
        }

        return n ^ mask;
    }
}
