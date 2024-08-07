public class SortingAlgorithm {
    public static void insertionSort(long[] array) {
// start from 2nd element and move it to the end of the array
        for (int i = 1; i < array.length; i++) {
            long key = array[i];
            int previousIndex = i - 1;
//shift elements of the sorted portion that are greater than the key to the right
            while (previousIndex >= 0 && array[previousIndex] > key) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex = previousIndex - 1;
            }
//insert the key into correct position
            array[previousIndex + 1] = key;
        }
    }
// check if the list is not empty
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a list of numbers to sort.");
            return;
        }
// array for keeping correct numbers		
		long[] tempArray = new long[args.length];
		int validCount = 0;
// adding correct numbers to temporary array		
		for (String arg : args) {
			try{
				long number = Long.parseLong(arg);
				tempArray[validCount] = number;
				validCount++;
			} catch (NumberFormatException e) {
				System.out.println("Ignoring invalid number: " + arg);
			}
		}
// create array of the correct size for valid numbers
        long[] array = new long[validCount];
		System.arraycopy(tempArray, 0, array, 0, validCount);
		
		if (array.length == 0) {
			System.out.println("No valid numbers provided to sort.");
			return;
		}
// sorting
        insertionSort(array);
// printing out array
        System.out.println("Sorted array:");
        for (long i : array) {
            System.out.print(i + " ");
        }
    }
}
