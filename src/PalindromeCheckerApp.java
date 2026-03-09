public class PalindromeCheckerApp {
}import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        boolean isPalindrome = true;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is NOT a Palindrome");
    }
}
