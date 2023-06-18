import java.util.HashMap;

public class findnonuniqueduplicate {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 2, 5, 4 }; // Example array with a non-unique duplicate

        int nonUniqueDuplicate = findNonUniqueDuplicate(numbers);
        System.out.println("Non-unique duplicate number: " + nonUniqueDuplicate);
    }

    public static int findNonUniqueDuplicate(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (countMap.get(num) > 1) {
                return num; // Found the non-unique duplicate number
            }
        }

        return -1; // No non-unique duplicate found
    }
}
