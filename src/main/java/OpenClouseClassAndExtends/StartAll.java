package OpenClouseClassAndExtends;

import OpenClouseClassAndExtends.Author.Author;
import OpenClouseClassAndExtends.Book.Book;

public class StartAll {
    public static void main(String[] args) {
        // Создание авторов
        Author author1 = new Author("Джордж Оруэлл");
        Author author2 = new Author("Лев Толстой");

        // Создание книг
        Book book1 = new Book("1984", author1);
        Book book2 = new Book("Скотный двор", author1);
        Book book3 = new Book("Война и мир", author2);
        Book book4 = new Book("Анна Каренина", author2);

        // Добавление книг в список авторов
        author1.addBook(book1);
        author1.addBook(book2);
        author2.addBook(book3);
        author2.addBook(book4);

        // Отображение информации о книгах и авторах
        System.out.println("Информация о книгах и авторах:");
        System.out.println("Автор: " + author1.getName());
        for (Book book : author1.getBooks()) {
            System.out.println(book);
        }

        System.out.println();

        System.out.println("Автор: " + author2.getName());
        for (Book book : author2.getBooks()) {
            System.out.println(book);
        }
    }
}
