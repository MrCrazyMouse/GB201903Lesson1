package gbjavacore.lesson2;

class MyArrayDataException extends Exception {
    MyArrayDataException(int i, int j, String x) {
        System.out.println("В ячейке " + (i + 1) + " " + (j + 1) + " не корректное значение: " + x);
    }
}
