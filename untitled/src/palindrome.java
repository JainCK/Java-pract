public class palindrome {
    public static void main(String[] args) {
        String str = "madam"; // Assume input
        int n = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "YES" : "NO");
    }
}
