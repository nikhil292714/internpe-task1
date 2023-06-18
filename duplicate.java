import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 2, 5 }; // Example array with a duplicate

        int duplicate = findDuplicate(numbers);
        System.out.println("Duplicate number: " + duplicate);
    }

    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num; // Found the duplicate number
            }
            set.add(num);
        }
        return -1; // No duplicate found
    }
}
