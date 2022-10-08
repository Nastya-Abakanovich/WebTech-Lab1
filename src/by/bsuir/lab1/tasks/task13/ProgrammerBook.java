package by.bsuir.lab1.tasks.task13;
import by.bsuir.lab1.tasks.task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook() {
        super();
        language = "Java";
        level = 1;
    }

    public ProgrammerBook(String _title, String _author, int _price, String _language, int _level) {
        super(_title, _author, _price);
        language = _language;
        level = _level;
    }

    public ProgrammerBook(String _language, int _level) {
        super();
        language = _language;
        level = _level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ProgrammerBook prBook = (ProgrammerBook) obj;
        return super.equals(obj) && language.equals(prBook.language) && level == prBook.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return String.format("%s, language=%s, level=%d", super.toString(), language, level);
    }
}
