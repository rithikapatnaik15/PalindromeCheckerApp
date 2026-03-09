public class PalindromeCheckerApp {
}import java.util.*;

public class PalindromeQueueStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);      // enqueue
            stack.push(ch);     // push
        }

        boolean isPalindrome = true;

        while(!queue.isEmpty()) {
            if(queue.remove() != stack.pop()) {
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
