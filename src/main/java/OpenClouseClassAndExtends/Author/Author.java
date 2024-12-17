package OpenClouseClassAndExtends.Author;

import OpenClouseClassAndExtends.Book.Book;

import java.util.ArrayList;


import java.util.ArrayList;

public class Author {
    private String name;                // Имя автора
    private ArrayList<Book> books;      // Список книг

    // Конструктор
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Сеттер для имени
    public void setName(String name) {
        this.name = name;
    }

    // Метод для добавления книги
    public void addBook(Book book) {
        books.add(book);
    }

    // Метод для получения списка книг
    public ArrayList<Book> getBooks() {

        return books;
    }
}

