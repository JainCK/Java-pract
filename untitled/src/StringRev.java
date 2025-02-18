public class StringRev {
    public static void main(String[] args) {
        String str = "hello"; // Assume this is the input
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println(reversed);
    }
}
