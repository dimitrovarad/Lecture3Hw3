import java.util.Scanner;

//Задача 1:  Да се прочете масив от екрана и да се намери най-малкото число кратно на 3 от масива. Ако няма такова число, да се изведе подходящо съобщение.

public class Zadacha1 {
    public static void main(String[] args) {
        zadacha1();
    }

    public static void zadacha1() {
        //Зад.1 - Да се прочете масив от екрана и да се намери най-малкото число кратно на 3 от масива. Ако няма такова число, да се изведе подходящо съобщение.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the massive: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the" + "" + (i + 1) + "-st element");
            arr[i] = sc.nextInt();
        }
        int result = arr[0];
        for (int z = 1; z < size; z++) {
            if (arr[z] % 3 == 0) {
                if (result % 3 == 0) {
                    if (arr[z] < result) {
                        result = arr[z];
                    }
                } else {
                    result = arr[z];
                }
            }
        }
        if (result % 3 == 0) {
            System.out.println("The smallest divided into 3 is: " + result);
        } else {
            System.out.println("No such element");
        }

    }

    public static void zadacha2() {

    }
}
