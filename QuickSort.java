public class QuickSort {

    public static void QuickSort(int[] arr, int low, int high) {

        if(low < high) {

            int pivotIndex = partition(arr, low, high);

            QuickSort(arr, low, pivotIndex - 1);
            QuickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] thisArray = {21, 59, 64, 99, 72, 31, 43, 76, 10};

        System.out.print("Original Array: ");
        for (int num : thisArray) {
            System.out.print(num + ", ");
        }

        QuickSort(thisArray, 0, thisArray.length - 1);

        System.out.print("\nSorted Array: ");
        for (int num : thisArray) {
            System.out.print(num + ", ");
        }
    }
}