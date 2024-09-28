import java.util.Scanner;

public class TayoVan {
    public static void TayoVan (String[] args) {
        // Створюємо сканер для введення даних
        Scanner scanner = new Scanner(System.in);
        
        // вводим разные типы данных :)
        System.out.print("Введіть ціле число: ");
        int intValue = scanner.nextInt();
        
        System.out.print("Введіть число з плаваючою точкою: ");
        double doubleValue = scanner.nextDouble();
        
        System.out.print("Введіть строку: ");
        scanner.nextLine(); 
        String stringValue = scanner.nextLine();
        
        System.out.print("Введіть логічне значення (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        
        // Виведение данных в разных видоизменениях (умное чот )
        // Стандарт вывода дене..тоесть данных System.out.println()
        System.out.println("Введені дані:");
        System.out.println("Ціле число: " + intValue);
        System.out.println("Число з плаваючою точкою: " + doubleValue);
        System.out.println("Строка: " + stringValue);
        System.out.println("Логічне значення: " + booleanValue);
        
        // Виведение через форматирование (опять чтото на умном не забываем) String.format()
        System.out.println("\nФорматоване виведення через String.format():");
        System.out.println(String.format("Ціле число: %d", intValue));
        System.out.println(String.format("Число з плаваючою точкою: %.2f", doubleValue));
        System.out.println(String.format("Строка: %s", stringValue));
        System.out.println(String.format("Логічне значення: %b", booleanValue));
        
        // снова умное выведение данных через System.out.printf()
        System.out.println("\nФорматоване виведення через System.out.printf():");
        System.out.printf("Ціле число: %d%n", intValue);
        System.out.printf("Число з плаваючою точкою: %.2f%n", doubleValue);
        System.out.printf("Строка: %s%n", stringValue);
        System.out.printf("Логічне значення: %b%n", booleanValue);
    }
}
