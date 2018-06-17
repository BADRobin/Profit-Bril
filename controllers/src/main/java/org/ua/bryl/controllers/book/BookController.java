package org.ua.bryl.controllers.book;

/**
 * Created by Sweet on 03.05.2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.ua.bryl.datalayer.book.BookDAO;
import org.ua.bryl.model.Book;

/**
 * Created by Sweet on 30.04.2017.
 */
@Controller
public class BookController {
     @Autowired
    private BookDAO bookDAO;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ModelAndView getBook (){
        Book book = new Book();
        book.setBookName("Hernya");
        book.setCodeNo(002);
        bookDAO.create(book);
        return new ModelAndView("/book/index");
    }
}
