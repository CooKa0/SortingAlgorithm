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

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a list of integers to sort.");
            return;
        }

        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        insertionSort(array);

        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
