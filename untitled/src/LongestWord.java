public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language"; // Assume input
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }
}
