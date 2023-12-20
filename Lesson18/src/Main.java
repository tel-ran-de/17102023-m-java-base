import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[6];
        System.out.println("Input value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input key value: ");
        Integer key = sc.nextInt();
        // output arr via Arrays.toString()
        System.out.println(Arrays.toString(arr));
        // output arr via System.out.print()
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        int index = linearSearch(arr, key);
        if (index != -1) {
            System.out.println("Элемент в " + index + "-индексе");
        } else {
            System.out.println("Элемент не найден.");
        }
    }

    public static int linearSearch(Integer[] arr, Integer key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

//Получить от пользователя набор данных ( 6 целочисленных значений)
//Сохранить полученные данные в массив
//Получить от пользователя ключевой элемент
//Реализовать метод линейного поиска ключевого элемента в массиве, метод должен вернуть
// индекс элемента или -1
//Если элемент существует, вывести на консоль: Элемент в n-индексе, иначе Элемент не найден.
//Проанализируйте написанный код используя режим Дебаггер
