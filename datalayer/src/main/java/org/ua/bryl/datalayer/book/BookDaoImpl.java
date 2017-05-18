package org.ua.bryl.datalayer.book;

import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Book;

/**
 * Created by Sweet on 05.03.2017.
 */
@Repository
public class BookDaoImpl  extends AbstractDAO<Book> implements BookDAO{
    public BookDaoImpl(Class<Book> type) {
        super(type);
    }

    public Book createBook() {
        return new Book ();
    }

    @Override
    public Book createBook(@Validated Book book) {
        return null;
    }

    @Override
    public void getAllBooks(Book books) {

    }


    @Override
    public Book getBook(int codeNo) { return null; }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public void deleteBook(Book book) {

    }


}
