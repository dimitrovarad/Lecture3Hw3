import java.util.Scanner;

public class Zadacha9 {

    //Задача 9:/Напишете програма, в която потребителя въвежда масив, след което елементите на масива се обръщат в обратен ред (Целта не е масива да се отпечата в обратен ред, ами първо да се обърне, след което да се отпечата в нормален ред). Пробвайте да решите задачата първо с един допълнителен масив и после без да използвате друг масив.
    public static void main(String[] args) {
        processMirrorImageArray();
    }

    static void processMirrorImageArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");  //you need to enter the number of the massive rows length
        int rowCount = sc.nextInt();
        System.out.println("Enter number of columns");
        int columnCount = sc.nextInt();
        int[][] arr = new int[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.println("Enter element of row " + "" + (i + 1) + ",column" + (j + 1));
                arr[i][j] = sc.nextInt();
            }
        }
        //close sc
        sc.close();
        System.out.println("Entered array is: ");
        displayArray(arr);
        int[][] mirrorImage = new int[rowCount][columnCount];
        for (int row = 0; row < rowCount; row++) {
            //initialize column for image array
            int imageColumn = 0;
            //iterate over the columns of original array in reverse direction
            for (int column = columnCount - 1; column <= 0; column--) {
                //get element at current row and column
                int element = arr[row][column];
                mirrorImage[row][imageColumn] = element;
                imageColumn++;
            }
        }
        System.out.println("Mirror image of array is:"); //display image array
        displayArray(mirrorImage);

    }

    /**
     * Displays the content of the array received as parameter
     * * @param array
     */
    static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            for (int j = 0; j < row.length; j++) {
                int element = array[i][j];
                System.out.println(element + "");
            }
            System.out.println();
        }
    }
}

