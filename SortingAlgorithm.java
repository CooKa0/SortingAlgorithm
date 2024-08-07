public class SortingAlgorithm {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int previousIndex = i - 1;
            while (previousIndex >= 0 && array[previousIndex] > key) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex = previousIndex - 1;
            }
            array[previousIndex + 1] = key;
        }
    }
// check if the list is not empty
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a list of integers to sort.");
            return;
        }
//array for keeping correct numbers		
		int[] tempArray = new int[args.length];
		int validCount = 0;
//adding correct numbers to temporary array		
		for (String arg : args) {
			try{
				int number = Integer.parseInt(arg);
				tempArray[validCount] = number;
				validCount++;
			} catch (NumberFormatException e) {
				System.out.println("Ignoring non-integer argument: " + arg);
			}
		}
		
        int[] array = new int[validCount];
		System.arraycopy(tempArray, 0, array, 0, validCount);
		if (array.length == 0) {
			System.out.println("No valid integers provided to sort.");
			return;
		}
// sorting
        insertionSort(array);
// printing out array
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
