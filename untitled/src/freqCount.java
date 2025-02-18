import java.util.HashMap;

public class freqCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4}; // Assume input
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int key : freq.keySet()) {
            System.out.println(key + " appears " + freq.get(key) + " times");
        }
    }
}
