import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите строку: ");
                String aInput = scanner.nextLine();
                System.out.print("Введите строку: ");
                String bInput = scanner.nextLine();
        
        int a = Integer.parseInt(aInput);
        int b = Integer.parseInt(bInput);

		if (a.equals(b)) 
		{
            System.out.println("Строки идентичны");
        } 
		else 
		{
            System.out.println("Строки неидентичны");
        }
	}
}}}

