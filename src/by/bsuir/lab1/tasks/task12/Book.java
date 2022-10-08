package by.bsuir.lab1.tasks.task12;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private String isbn;
    private static int edition;

    public Book() {
        this.title = "Cats book";
        this.author = "Cat Meow";
        this.price = 1;
        this.isbn = "978-2-266-11156-0";
    }

    public Book(String _title, String _author, int _price) {
        this.title = _title;
        this.author = _author;
        this.price = _price;
        this.isbn = "978-2-266-11156-0";
    }

    public Book(String _title, String _author, int _price, String _isbn) {
        this.title = _title;
        this.author = _author;
        this.price = _price;
        this.isbn = _isbn;
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
        return title.equals(book.title) && author.equals(book.author) && price == book.price && isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, isbn);
    }

    @Override
    public String toString() {
        return String.format("title=%s, author=%s, price=%d, ISBN=%s", title, author, price, isbn);
    }

    @Override
    public Object clone() {
        return new Book(title, author, price, isbn);
    }

    @Override
    public int compareTo(Book book){
        return this.isbn.compareTo(book.isbn);
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}

