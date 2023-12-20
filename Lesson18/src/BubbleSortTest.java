import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        Integer[] arr = {22, 3, 4, 2, 50};
        System.out.println("Original array");
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        bubbleSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(Integer[] arr) {
        boolean isSorted = false;
        Integer temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
//Дан массив {22, 3, 4, 2, 50} -> {2, 3, 4, 22, 50}
//Реализуйте метод bubbleSort(int[] array)
//Выведите на консоль массив до и после сортировки
//Проанализируйте код
