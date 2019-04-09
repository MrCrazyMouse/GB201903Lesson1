package gbjavacore.lesson2;

import gbjavacore.lesson2.MyArrayDataException;
import gbjavacore.lesson2.MyArraySizeException;

import java.util.Random;
/**
 * 1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
 * при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 *
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
 *
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.
 *
 * Несколько комментариев.
 * 1. Для всех упомянутые в тексте задания исключений вам нужно будет самим создать классы
 * 2. Предлагаю сделать их checked, чтобы лучше разобраться с этой особенностью языка
 * 3. Для этого задания я не даю основы, как для прошлого.
 */
public class TestArray {
    public static void main (String[] args) throws MyArrayDataException, MyArraySizeException {
        try {
            int[][] arr = new int[4][4];
            int max, min;
            Random rnd = new Random();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = rnd.nextInt(10) + 1;
                }
            }
            for (int i = 0; i < arr.length; i++, System.out.println()) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            //summ
            int summMass;
            int x=arr.length;
            int summ=0;
            for (int i=0;i<x;i++){
                for(int j=0;j<x;j++){
                    summ+=arr[i][j];
                }
            }
            System.out.println("Общая сумма всех элементова массива равна: "+summ);
        }catch (ArrayIndexOutOfBoundsException| MyArraySizeException |MyArrayDataException ex) {
            System.out.println("Ошибка " + ex);
        }
    }
}