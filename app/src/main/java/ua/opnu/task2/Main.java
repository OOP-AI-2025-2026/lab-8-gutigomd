package ua.opnu.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BookData book1 = new BookData("Java Concurrency", "A. Author", 50, 450.0); // Рейтинг: 9.0
        BookData book2 = new BookData("OOP Basics", "B. Writer", 100, 700.0);       // Рейтинг: 7.0
        BookData book3 = new BookData("C++ Advanced", "C. Creator", 20, 180.0);     // Рейтинг: 9.0 (Оцінка як у book1, має сортуватися за назвою)
        BookData book4 = new BookData("Algorithms", "D. Expert", 10, 50.0);          // Рейтинг: 5.0 (Найнижчий)

        List<BookData> shelf = Arrays.asList(book1, book2, book3, book4);

        System.out.println("=== 📚 Книги до сортування ===");
        printBooks(shelf);

        Collections.sort(shelf);

        System.out.println("\n=== 🥇 Книги після сортування (Від кращого до гіршого) ===");
        System.out.println("Логіка: 'Менше' (йде першим) = Вищий рейтинг.");
        printBooks(shelf);

    }

    private static void printBooks(List<BookData> books) {
        for (BookData book : books) {
            System.out.printf("  %s | Рейтинг: %.2f%n", book.getTitle(), book.getRating());
        }
    }
}