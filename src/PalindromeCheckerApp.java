public class PalindromeCheckerApp {

    public static void main(String[] args) {
        //USE CASE 1
        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker System   ");
        System.out.println("==========================================");
        System.out.println("Version: 1.0");
        System.out.println();
        System.out.println("Application started successfully.");
        System.out.println("Ready for palindrome operations...");
        System.out.println("========================================");


        //USE CASE 2
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


        //USE CASE 3
        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

}