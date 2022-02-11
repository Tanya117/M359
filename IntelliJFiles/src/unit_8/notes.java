package unit_8;

public class notes {

    public static void main(String[] args) {
        // Three initialized 1D arrays

        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = {3, 6, 9, 12, 15};
        int[] arr4 = {4, 8, 12, 16, 20};

        // 1. Create a 2D array called arr2D with arr2, arr3, and arr4
        int [] [] arr2d = {arr2,arr3,arr4};

        // 2. Create an int called last and save the last value of the first row
        //    in arr2D in this variable.  Print this value
        int numCol= arr2d[0].length;
        int last= arr2d[0][numCol-1];



        // 3.  Print the middle value of arr2D
        System.out.println(arr2d[1][2]);

        // 4.  Change the first value in the last row of arr2D to be equal to 0
        //     and then print its new value
        int numRow= arr2d.length;
        arr2d[numRow-1][0]=0;
        System.out.println(arr2d[numRow-1][0]);


        // BONUS challenge - see if you can figure out the way to use double for loops to
        // traverse a 2D array

        //Outer loop: This loop traverses each row of the 2d array
        // i value goes from 0 to numRows-1
        //Inner loop: This loop traverses each value of the 1d array located at index 1
        // j value goes from 0 to numCol-1;

        // Write a double loop to print all the values of the array arr2D.
        // Each row of the array should print on a new line


        // Create a 5 x 10 2D array called multiples


        /* Fill the multiples array using a for loop so that the values look like:
            2 4  6  8 10 12 14 16 18 20
            3 6  9 12 15 18 21 24 27 30
            4 8 12 16 20 24 28 32 36 40
            ..
            6 12 ...                 60
        */


        // Print all values in multiples using a for loop


    }
}