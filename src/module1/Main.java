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
                int taskNumber1 = scan.nextInt();
                switch (taskNumber1) {
                    case 1:
                        System.out.println("Дан массив чисел. Вернуть число уникальных символов");
                        uniqueCharacters();
                        break;
                    case 2:
                        System.out.println("Ход коня по бесконечной шахматной доске. Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход. Программа должна проверить, возможно ли это сделать.");
                        chess();
                        break;
                    case 3:
                        System.out.println("Даны точки A,B,C  на плоскости.  Вычислить площадь  треугольника ABC.");
                        triangle();
                        break;
                    default:
                        System.out.println("Укажите верный номер таска");
                        break;
                }
            case 2:
                System.out.println("Выберите номер таска от 1 до 2");
                int taskNumber2 = scan.nextInt();
                switch (taskNumber2){
                    case 1:
                        System.out.println("1.Учитывая строку, содержащую символы '(', ')', '{', '}', '[' и ']', определите, является ли входная строка допустимой.\n" +
                                "Входная строка действительна, если:\n" +
                                "Открытые скобки должны быть закрыты скобками того же типа.\n" +
                                "Открытые скобки должны быть закрыты в правильном порядке.\n" +
                                "Обратите внимание, что пустая строка также считается допустимой.");
                        System.out.println("Введите строку :");
                        String str = scan.next();
                        correctInput(str);
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

    public static void chess(){
        System.out.println("Введите номер строки коня: ");
        int x1 = scan.nextInt();
        System.out.println("Введите номер стобца коня: ");
        int y1 = scan.nextInt();
        System.out.println("Введите номер строки на которую ходите походить: ");
        int x2 = scan.nextInt();
        System.out.println("Введите номер стобца на который хотите походить: ");
        int y2 = scan.nextInt();
        int dx = abs(x1-x2);
        int dy = abs(y1 - y2);
        if (dx == 1 & dy == 2 || dx == 2 & dy == 1)
            System.out.println("YES");
        else
            System.out.println("NO"); }

    public static void triangle(){
        System.out.println("Введите координаты точки А,через пробел (х,у): ");
        int xA = scan.nextInt();
        int yA = scan.nextInt();
        System.out.println("Введите координаты точки B,через пробел (х,у): ");
        int xB = scan.nextInt();
        int yB = scan.nextInt();
        System.out.println("Введите координаты точки C,через пробел (х,у): ");
        int xC = scan.nextInt();
        int yC = scan.nextInt();
        double S = abs(0.5 * ((xB - xA) * (yC - yA) - (xC - xA) * (yB - yA)));
        System.out.println("Площадь треугольника = " + (int)S);
    }

    public static void correctInput(String str){

        int checkBrackets = 0;
        for (int i = 0;i < str.length();i++){
            if (checkBrackets < 0){
                System.out.println("Строка не валидна"); }
        String oneSymbol =  str.substring(i, i + 1);
            if (oneSymbol.equals("(")){
                checkBrackets ++; }
            else {
                checkBrackets--; }

        }
        for (int i = 0;i < str.length();i++){
            String oneSymbol =  str.substring(i, i + 1);
            if (oneSymbol.equals("{")){
                checkBrackets ++; }
            else {
                checkBrackets--; }
        }
        for (int i = 0;i < str.length();i++){
            String oneSymbol =  str.substring(i, i + 1);
            if (oneSymbol.equals("[")){
                checkBrackets ++; }
            else {
                checkBrackets--; }

        }
        if (checkBrackets == 0){
            System.out.println("Строка валидна"); }
        else {
            System.out.println("Строка не валидна"); }

    }

}









