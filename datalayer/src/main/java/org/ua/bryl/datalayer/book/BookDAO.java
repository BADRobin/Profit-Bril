package org.ua.bryl.datalayer.book;
import org.springframework.validation.annotation.Validated;
import org.ua.bryl.model.Book;

/**
 * Created by Sweet on 05.03.2017.
 */
public interface BookDAO {
    public Book createBook (@Validated Book book);
    public void getAllBooks(Book books);
    public Book getBook(int codeNo);
    public void updateBook(Book book);
    public void deleteBook(Book book);



}