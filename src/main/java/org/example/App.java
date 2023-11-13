package org.example;

import java.util.List;
import java.util.Scanner;

public class App {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в библиотеку!");
        System.out.println("[+] - добавить книгу");
        System.out.println("[-] - удалить книгу");
        System.out.println("[*] - вывести список всех книг");
        System.out.println("[?] - найти книгу");
        System.out.println("[!] - выйти из библиотеки");
        System.out.println();

        while (true) {
            System.out.println("Введите команду: ");
            String command = scanner.nextLine();
            if (command.equals("!"))
                break;
            switch (command) {
                case "+":
                    addBook();
                    break;
                case "-":
                    deleteBook();
                    break;
                case "*":
                    getAllBook();
                    break;
                case "?":
                    System.out.println(" по [автор | название | жанр]");
                    switch (scanner.nextLine()) {
                        case "автор":
                            findByAuthorSurname();
                            break;
                        case "название":
                            findByName();
                            break;
                        case "жанр":
                            findByGenre();
                            break;
                        default:
                            System.out.println("Неизвестное поле поиска");
                            break;
                    }
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        }

        System.out.println("До встречи! Приходите еще.");
    }

    public static void addBook() {
        Book book = new Book();

        System.out.println("Название: ");
        book.setName(scanner.nextLine());

        System.out.println("Жанр: ");
        book.setGenre(scanner.nextLine());

        System.out.println("Фамилия автора: ");
        book.setAuthorSurname(scanner.nextLine());

        System.out.println("Имя автора: ");
        book.setAuthorName(scanner.nextLine());

        System.out.println("Краткое описание: ");
        book.setDescription(scanner.nextLine());

        System.out.println("Год издания: ");
        String string = scanner.nextLine();

        while (!string.matches("[0-9]+") || Integer.parseInt(string) > 2023 ) {
            System.out.println("Введите корректный год издания: ");
            string = scanner.nextLine();
        }
        book.setPublishingYear(Integer.parseInt(string));

        System.out.println("Добавлена книга с id: " + library.addBook(book));
        System.out.println();
    }

    public static void deleteBook() {
        System.out.print("Введите id книги: ");
        String string = scanner.nextLine();

        while (!string.matches("[0-9]+") ) {
            System.out.println("Введите корректный id книги: ");
            string = scanner.nextLine();
        }

        if (library.deleteById(Integer.parseInt(string))) {
            System.out.println("Книга удалена");
        }
        System.out.println();
    }

    public static void getAllBook() {
        System.out.println("Список всех книг библиотеки: ");
        library.printAllBooks();
        System.out.println();
    }

    public static void findByAuthorSurname() {
        List<Book> bookList = library.findByAuthorSurname(scanner.nextLine());
        System.out.println(bookList);
        System.out.println();
    }

    public static void findByName() {
        List<Book> bookList = library.findByName(scanner.nextLine());
        System.out.println(bookList);
        System.out.println();
    }

    public static void findByGenre() {
        List<Book> bookList = library.findByGenre(scanner.nextLine());
        System.out.println(bookList);
        System.out.println();
    }
}