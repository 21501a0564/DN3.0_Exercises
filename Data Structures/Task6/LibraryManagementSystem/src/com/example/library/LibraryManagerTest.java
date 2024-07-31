package com.example.library;

public class LibraryManagerTest {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Book book1 = new Book("B001", "Java Programming", "John Doe");
        Book book2 = new Book("B002", "Data Structures", "Jane Smith");
        Book book3 = new Book("B003", "Algorithms", "Emily Johnson");

        manager.addBook(book1);
        manager.addBook(book2);
        manager.addBook(book3);

        System.out.println("Finding book by title (Linear Search):");
        Book foundLinear = manager.findBookByTitleLinear("Data Structures");
        System.out.println(foundLinear != null ? foundLinear : "Book not found.");

        manager.sortBooksByTitle();
        System.out.println("\nBooks after sorting:");
        manager.getBooks().forEach(System.out::println);

        System.out.println("\nFinding book by title (Binary Search):");
        Book foundBinary = manager.findBookByTitleBinary("Algorithms");
        System.out.println(foundBinary != null ? foundBinary : "Book not found.");
    }
}
