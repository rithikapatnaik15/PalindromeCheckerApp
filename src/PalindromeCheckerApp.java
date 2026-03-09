public class PalindromeCheckerApp {
}import java.util.*;

/* Strategy Interface */
interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

/* Stack Strategy */
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray())
            stack.push(c);

        for(char c : str.toCharArray())
            if(c != stack.pop())
                return false;

        return true;
    }
}

/* Deque Strategy */
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : str.toCharArray())
            deque.addLast(c);

        while(deque.size() > 1)
            if(deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }
}

/* Context Class */
class PalindromeContext {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String str) {
        return strategy.checkPalindrome(str);
    }
}

/* Main Application */
public class PalindromeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        PalindromeContext context = new PalindromeContext();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();

        if(choice == 1)
            context.setStrategy(new StackStrategy());
        else
            context.setStrategy(new DequeStrategy());

        if(context.execute(str))
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is NOT a Palindrome");
    }
}
