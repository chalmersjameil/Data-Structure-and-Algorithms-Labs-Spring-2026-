import java.util.Scanner;

// The name of the public class defined
public class TwoSumProblem {

    // Method to find two indices that add up to target
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        // If no solution is found, return [-1, -1]
        result[0] = -1;
        result[1] = -1;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter number of elements
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        // Validate number of elements
        while (n < 2) {
            System.out.println("Invalid input. Number of elements must be >= 2.");
            System.out.print("Re-enter the number of elements: ");
            n = input.nextInt();
        }

        int[] nums = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = input.nextInt();

            while (nums[i] < 0) {
                System.out.println("Invalid value. Element must be >= 0.");
                System.out.print("Re-enter element " + (i + 1) + ": ");
                nums[i] = input.nextInt();
            }
        }

        // Enter target value
        System.out.print("Enter target value: ");
        int target = input.nextInt();

        while (target < 0) {
            System.out.println("Invalid value. Target must be >= 0.");
            System.out.print("Re-enter the target value: ");
            target = input.nextInt();
        }

        // Call Two Sum
        int[] answer = twoSum(nums, target);

        // Output result
        if (answer[0] != -1) {
            System.out.println("Output: [" + answer[0] + ", " + answer[1] + "]");
            System.out.println(
                    "Explanation: nums[" + answer[0] + "] + nums[" + answer[1] + "] = "
                            + nums[answer[0]] + " + " + nums[answer[1]] + " = " + target
            );
        } else {
            System.out.println("There is no match between the sum of two values.");
        }

        input.close();
    }
}
