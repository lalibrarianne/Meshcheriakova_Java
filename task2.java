import java.util.Scanner;
public class task22 {
    public static void main(String[] args) {
        
        try (Scanner console = new Scanner(System.in)) {
            String a = console.nextLine();
            String b = new String(console.nextLine()).intern();
                
                if (a.equals(b)) 
                {
                    System.out.println("Строки идентичны");
                } 
                else 
                {
                    System.out.println("Строки неидентичны");
                }
        }}}
 