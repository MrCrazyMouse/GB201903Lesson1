package gbjavacore.lesson2;

import java.util.Scanner;

public class CalcApplication {
    public CalcApplication() {
    }

    private static void calc(int num1, int num2, String operation) throws WrongOperationException {
        byte var4 = -1;
        switch(operation.hashCode()) {
            case 42:
                if (operation.equals("*")) {
                    var4 = 2;
                }
                break;
            case 43:
                if (operation.equals("+")) {
                    var4 = 0;
                }
            case 44:
            case 46:
            default:
                break;
            case 45:
                if (operation.equals("-")) {
                    var4 = 1;
                }
                break;
            case 47:
                if (operation.equals("/")) {
                    var4 = 3;
                }
        }

        switch(var4) {
            case 0:
                System.out.println(String.format("%d%s%d=%d", num1, operation, num2, num1 + num2));
                break;
            case 1:
                System.out.println(String.format("%d%s%d=%d", num1, operation, num2, num1 - num2));
                break;
            case 2:
                System.out.println(String.format("%d%s%d=%d", num1, operation, num2, num1 * num2));
                break;
            case 3:
                System.out.println(String.format("%d%s%d=%d", num1, operation, num2, num1 / num2));
                break;
            default:
                throw new WrongOperationException("Неизвестная операция " + operation);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Throwable var2 = null;

        try {
            while(true) {
                while(true) {
                    try {
                        System.out.println("Введите первое число:");
                        int num1 = Integer.valueOf(scn.nextLine());
                        System.out.println("Введите второе число:");
                        int num2 = Integer.valueOf(scn.nextLine());
                        System.out.println("Введите операцию:");
                        String operation = scn.nextLine();
                        calc(num1, num2, operation);
                    } catch (NumberFormatException var16) {
                        System.out.println("Ошибка преобразования числа " + var16);
                    } catch (ArithmeticException var17) {
                        System.out.println("Арифметическая ошибка " + var17);
                    } catch (WrongOperationException var18) {
                        System.out.println("Ошибка " + var18);
                    } catch (Exception var19) {
                        System.out.println("Неизвестная ошибка: " + var19);
                    }
                }
            }
        } catch (Throwable var20) {
            var2 = var20;
            throw var20;
        } finally {
            if (scn != null) {
                if (var2 != null) {
                    try {
                        scn.close();
                    } catch (Throwable var15) {
                        var2.addSuppressed(var15);
                    }
                } else {
                    scn.close();
                }
            }

        }
    }
}
