public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Map to store number and its index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution"); // Should never happen per the constraints
    }

    public static void main(String[] args) {
        int[] result1 = twoSum(new int[] {2, 7, 11, 15}, 9);
        int[] result2 = twoSum(new int[] {3, 2, 4}, 6);
        int[] result3 = twoSum(new int[] {3, 3}, 6);

        printResult(result1);
        printResult(result2);
        printResult(result3);
    }

    private static void printResult(int[] result) {
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
