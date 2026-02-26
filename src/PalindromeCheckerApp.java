public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker System   ");
        System.out.println("==========================================");
        System.out.println("Version: 1.0");
        System.out.println();
        System.out.println("Application started successfully.");
        System.out.println("Ready for palindrome operations...");
        System.out.println("========================================");

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i <= input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

}