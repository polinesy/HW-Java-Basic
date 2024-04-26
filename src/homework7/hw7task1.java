package homework7;

public class hw7task1 {
    /*1) Написати метод, який приймає як параметр масив цілих чисел.
    І виводить на екран усі парні числа списком, а також непарні числа списком.*/

    public void printNumbers (int [] arr){

        System.out.println("Парні: ");

        for (int num : arr) {
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Непарні: ");

        for (int num : arr) {
            if (num % 2 != 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void main(String[] args) {
        int[] arr = {7, 10, 18, 3, 66, 90};
        printNumbers(arr);
    }
    }



