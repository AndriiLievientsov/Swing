package OpenClouseClassAndExtends.Book;

import OpenClouseClassAndExtends.Author.Author;

public class Book {
    private String title;         // Заголовок книги
    private Author author;        // Автор книги

    // Конструктор
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    // Геттер для заголовка
    public String getTitle() {
        return title;
    }

    // Сеттер для заголовка
    public void setTitle(String title) {
        this.title = title;
    }

    // Геттер для автора
    public Author getAuthor() {
        return author;
    }

    // Сеттер для автора
    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book title: " + title + ", Author: " + author.getName();
    }
}