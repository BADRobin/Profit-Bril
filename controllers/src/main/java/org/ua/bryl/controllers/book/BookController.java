package org.ua.bryl.controllers.book;

/**
 * Created by Sweet on 03.05.2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Sweet on 30.04.2017.
 */
@Controller (value = "/book")
public class BookController {

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ModelAndView getAuthor (){
        return new ModelAndView("/book/index");
    }
}
