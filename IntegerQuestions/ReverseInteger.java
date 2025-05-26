package IntegerQuestions;

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 1234;
        int ans = 0;

        while (n != 0) {
            int digit = n % 10;

            if ((ans > Integer.MAX_VALUE / 10) || (ans < Integer.MIN_VALUE / 10)) {
                System.out.println("Overflow occurred while reversing the integer.");
                return;
                
            }

            ans = ans * 10 + digit;

            n = n / 10;
        }

        System.out.println(n + " reversed is: " + ans);
    }
}
