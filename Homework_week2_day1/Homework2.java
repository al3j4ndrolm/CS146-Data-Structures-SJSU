package Homework_week2_day1;

public class Homework2 {
    static void main() {
        int[] array1 = {8, 3, 1, 7, 0, 10, 2};
        int[] array2 = {8, 3, 1, 7, 0, 10, 2};
        quickSortWithHoarePartition(0, 6, array1[0], array1);
        quickSortWithLomutoPartition(array2, 0, 6);
    }

    protected static void quickSortWithHoarePartition(int low, int high,int pivot, int[] arr){
        if (low < high) {
            int partition = hoarePartition(low, high, pivot, arr);
            quickSortWithHoarePartition(low, partition, arr[0], arr);
            quickSortWithHoarePartition(partition + 1, high, arr[partition + 1], arr);
        }
    }

    protected static int hoarePartition(int low, int high, int pivot, int[] arr){
        int i = low;
        int j = high;

        while (true) {
            while (arr[i] < pivot) { i++; }
            while (arr[j] > pivot) { j--; }
            if (i >= j) { return j; }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    protected static void quickSortWithLomutoPartition(int[] array, int low, int high) {
        if (low < high) {
            int p = lomutoPartition(array, low, high);
            quickSortWithLomutoPartition(array, low, p - 1);
            quickSortWithLomutoPartition(array, p + 1, high);
        }
    }

    protected static int lomutoPartition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
