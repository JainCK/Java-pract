public class binary {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11}; // Assume input
        int target = 5;
        int left = 0, right = arr.length - 1, found = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                found = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(found != -1 ? "Found at index " + found : "Not Found");
    }
}
