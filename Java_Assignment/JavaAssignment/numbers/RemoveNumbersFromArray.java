package numbers;

import java.util.Arrays;

public class RemoveNumbersFromArray {

	public static void main(String[] args)
	{
		double[] array = {1, 3, 4, 5, 6, 7.9, 8, 9.9, 10};

        // Indices to remove
        int indexToRemove1 = 5; // 6th index
        int indexToRemove2 = 4; // 5th index

        // Create a new array with the desired elements removed
        double[] newArray = removeElements(array, indexToRemove1, indexToRemove2);

        // Print the new array
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after removal: " + Arrays.toString(newArray));
    }

    public static double[] removeElements(double[] originalArray, int... indices) {
        Arrays.sort(indices);

        int newSize = originalArray.length - indices.length;
        double[] newArray = new double[newSize];

        int newArrayIndex = 0;
        int oldArrayIndex = 0;

        for (int i = 0; i < originalArray.length; i++) {
            if (oldArrayIndex < indices.length && i == indices[oldArrayIndex]) {
                oldArrayIndex++;
            } else {
                newArray[newArrayIndex++] = originalArray[i];
            }
        }

        return newArray;
    }
}

