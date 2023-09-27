package numbers;

import java.util.Arrays;

public class Remove_Element {

	public static void main(String[] args)
	{
		
		        int[] originalArray = {1, 2, 3, 4, 5, 6,7,8,9};
		        int[] newArray = removeElements(originalArray, 4, 6); // Removing elements at indexes 2 and 4
		        
		        // Print the new array
		        for (int num : newArray) {
		            System.out.print(num + " ");
		        }
		    }
		    
		    public static int[] removeElements(int[] array, int index1, int index2) {
		        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
		            throw new IllegalArgumentException("Invalid index");
		        }
		        
		        int newSize = array.length - 2;
		        int[] newArray = new int[newSize];
		        
		        for (int i = 0, newIndex = 0; i < array.length; i++) {
		            if (i != index1 && i != index2) {
		                newArray[newIndex] = array[i];
		                newIndex++;
		            }
		        }
		        
		        return newArray;
		    }
		
	}

