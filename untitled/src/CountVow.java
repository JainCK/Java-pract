public class CountVow {
    public static void main(String[] args) {
        String str = "hello world"; // Assume input
        int count = 0;

        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
