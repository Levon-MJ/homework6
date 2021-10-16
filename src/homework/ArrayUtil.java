package homework;

import java.sql.SQLOutput;

public class ArrayUtil {
    public static void main(String[] args) {

        //все элементы

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        //самая большая цифра

        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        int max = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }
        }
        System.out.println(max);

        // самая маленькая цифра

        int array3[] = {10, 20, 30, 40, 50};
        int min = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < min) {
                min = array3[i];
            }
        }
        System.out.println(min);

        // четное число

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // нечетное число

        int arr2[] = {11, 12, 13, 14, 15, 16, 17};
        for (int i = 0; i <= arr2.length; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

            //среднее орефматическое

            int array4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
            int total = 0;
            for (int k = 0; k < array4.length; k++) {
                total = total + array4[k];
            }
            int result = total / array4.length;
            System.out.println(result);

        }
    }

}











