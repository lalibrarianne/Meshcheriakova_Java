import java.util.Scanner;

public class test {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static Double divide(int x, int y) {
        if (y == 0) {
            return null;
        }
        return (double) x / y;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите число a: ");
                String aInput = scanner.nextLine();
                System.out.print("Введите число b: ");
                String bInput = scanner.nextLine();
                    
                if (!isNumeric(aInput) && !(aInput.startsWith("-") && isNumeric(aInput.substring(1)))) {
                    System.out.println("ошибка введи число");
                    continue;
                }
                if (!isNumeric(bInput) && !(bInput.startsWith("-") && isNumeric(bInput.substring(1)))) {
                    System.out.println("ошибка введи число");
                    continue;
                }

                int a = Integer.parseInt(aInput);
                int b = Integer.parseInt(bInput);

                if (a > b) {
                    System.out.println("a>b");
                }
                if (a < b) {
                    System.out.println("a<b");
                } else if (a == b) {
                    System.out.println("a=b");
                }

                System.out.print("Какое действие нужно выполнить (+-/*)? ");
                String operator = scanner.nextLine();

                Double result = null;
                switch (operator) {
                    case "+":
                        result = (double) add(a, b);
                        break;
                    case "-":
                        result = (double) subtract(a, b);
                        break;
                    case "*":
                        result = (double) multiply(a, b);
                        break;
                    case "/":
                        result = divide(a, b);
                        if (result == null) {
                            System.out.println("Ошибка деления на 0");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("неверная операция");
                        continue;
                }
                System.out.println(result);
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("-?\\d+(\\.\\d+)?");
    }
}
    

