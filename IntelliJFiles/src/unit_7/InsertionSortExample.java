package unit_7;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] unsorted = {-5,10,-100,8000,47,0,22};
        for(int temp: unsorted){
            System.out.print(temp + " ");
        }
        System.out.println();
        int[] sorted = insertionSort(unsorted);
        for(int temp: sorted){
            System.out.print(temp + " ");
        }
    }

    public static int[] insertionSort(int[] nums){
        for(int i=1; i<nums.length;i++){ //grabs the i'th index to insert in sub array
            int valueToInsert = nums[i];
            int position = i;
            while(position > 0 && valueToInsert < nums[position-1]){
                nums[position]=nums[position-1]; //"scooting" down (copying to the right)
                position--;
            }
            nums[position]= valueToInsert;
        }
        return nums;
    }
//use for arrayLists and prices sorting
}
