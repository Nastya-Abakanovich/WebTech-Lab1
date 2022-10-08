package by.bsuir.lab1.tasks.task15;

import by.bsuir.lab1.tasks.task12.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

    public int compare(Book a, Book b){
        return a.getTitle().compareTo(b.getTitle());
    }
}
