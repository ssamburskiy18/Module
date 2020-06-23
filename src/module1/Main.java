package module1;
import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите номер уровня от 1 до 3");
        int levelNumber = scan.nextInt();
        switch (levelNumber) {
            case 1:
                System.out.println("Выберите номер таска от 1 до 3");
                int taskNumber = scan.nextInt();
                switch (taskNumber) {
                    case 1:
                        System.out.println("Дан массив чисел. Вернуть число уникальных символов");
                        uniqueCharacters();
                        break;
                    default:
                        System.out.println("Укажите верный номер таска");
                        break;
                }
        }
    }

    public static void uniqueCharacters() {
        System.out.println("Введите размерность массива: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        int result;
        int countUnique = 0;
        int count = 0;
        System.out.println("Заполните массив");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Полученный массив");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            countUnique++;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] == arr[i])
                {
                    count++;
                    break;
                }
            }
        }
        result = countUnique - count;
        System.out.println("\nЧисло уникальных символов: " + result); }


}



