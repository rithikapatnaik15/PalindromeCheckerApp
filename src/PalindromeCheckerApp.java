public class PalindromeCheckerApp {
}import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String str) {

        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            if(arr[start] != arr[end])
                return false;

            start++;
            end--;
        }
        return true;
    }
}

public class PalindromeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        if(checker.checkPalindrome(str))
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is NOT a Palindrome");
    }
}
