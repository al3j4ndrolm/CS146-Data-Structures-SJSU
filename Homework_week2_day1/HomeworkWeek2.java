package Homework_week2_day1;

public class HomeworkWeek2 {
    static void main() {
        /*TODO*/
    }

    protected static void quickSortWithHoarePartition(int low, int high, int[] arr){
        if (low < high) {
            int partition = hoarePartition(low, high, arr[low], arr);
            quickSortWithHoarePartition(low, partition, arr);
            quickSortWithHoarePartition(partition + 1, high, arr);
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
