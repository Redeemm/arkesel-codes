import java.util.Locale;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();
        String checker = text.toLowerCase(Locale.ROOT);

        boolean isPalindrome = true;
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (checker.charAt(i) != checker.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(isPalindrome);
    }
}
