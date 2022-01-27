package unit_7;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] unsorted = {8247, 47, 100, -5, 82, 17, 22};
        for (int tempNum : unsorted) {
            System.out.print(tempNum+",");
        }
        System.out.println();

        for (int tempNum : selectionSortLH(unsorted)) {
            System.out.print(tempNum+",");
        }

    }

    public static int[] selectionSortLH(int[] nums) {
        for (int i = 0; i < nums.length; i++) {//controls the index to get smallest value
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {//iterates over all remaining indices after i
                if (nums[j] < nums[minIndex]) {//test to find smaller value
                    minIndex = j;
                }
                //need to swap index i and index minIndex
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
       return nums;
    }
}
