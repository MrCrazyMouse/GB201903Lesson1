package gbjavacore.lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileApplication {
    public ReadFileApplication() {
    }

    private static Scanner openFile(String name) {
        Scanner var2;
        try {
            FileReader fileReader = new FileReader(name);
            var2 = new Scanner(fileReader);
        } catch (FileNotFoundException var6) {
            throw new IllegalArgumentException(var6);
        } finally {
            System.out.println("Блок finally выполнен");
        }

        return var2;
    }

    public static void main(String[] args) {
        String fileName = "/Users/macbook/IdeaProjects/GeekBrainsJavaCore2-201804/src/ru/geekbrains/lesson2/ReadFileApplication.java";
        Scanner scanner = openFile(fileName);
        Throwable var3 = null;

        try {
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Throwable var12) {
            var3 = var12;
            throw var12;
        } finally {
            if (scanner != null) {
                if (var3 != null) {
                    try {
                        scanner.close();
                    } catch (Throwable var11) {
                        var3.addSuppressed(var11);
                    }
                } else {
                    scanner.close();
                }
            }

        }

    }
}
