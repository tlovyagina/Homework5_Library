package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>();

    public void printAllBooks() {
        System.out.println(bookList);
    }

    public int addBook(Book newBook) {
        if (bookList.isEmpty())
            newBook.setId(1);
        else {
            Book lastBook = bookList.get(bookList.size() - 1);
            newBook.setId(lastBook.getId() + 1);
        }
        bookList.add(newBook);
        return newBook.getId();
    }

    public Book findById(int bookId) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == bookId)
                return bookList.get(i);
        }
        System.out.println("Книга не найдена");
        return null;
    }

    public List<Book> findByName(String bookName) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getName().startsWith(bookName))
                result.add(bookList.get(i));
        }
        return result;
    }

    public List<Book> findByGenre(String bookGenre) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getGenre().startsWith(bookGenre))
                result.add(bookList.get(i));
        }
        return result;
    }

    public List<Book> findByAuthorSurname(String bookAuthorSurname) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthorSurname().startsWith(bookAuthorSurname))
                result.add(bookList.get(i));
        }
        return result;
    }

    public boolean deleteById(int bookId) {
        Book book = findById(bookId);

        if (book == null)
            return false;

        bookList.remove(book);
        return true;
    }
}