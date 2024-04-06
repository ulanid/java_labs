public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {23, 101, 99, 25, 4, 63, 0};
        System.out.println("Original Array:");
        printArray(array);
        bubbleSort(array);
        System.out.println("Sorted Array:");
        printArray(array);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
