public class dupChars {
    public static void main(String[] args) {
        String str = "programming"; // Assume input
        int[] freq = new int[256];

        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " appears " + freq[i] + " times");
            }
        }
    }
}
