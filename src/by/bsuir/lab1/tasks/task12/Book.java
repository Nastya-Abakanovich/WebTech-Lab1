package by.bsuir.lab1.tasks.task12;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book() {
        this.title = "Cats book";
        this.author = "Cat Meow";
        this.price = 1;
    }

    public Book(String _title, String _author, int _price) {
        this.title = _title;
        this.author = _author;
        this.price = _price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author) && price == book.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return String.format("title=%s, author=%s, price=%d", title, author, price);
    }

    @Override
    public Object clone() {
        return new Book(title, author, price);
    }
}

