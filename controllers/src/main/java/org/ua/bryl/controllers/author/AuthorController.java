package org.ua.bryl.controllers.author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.ua.bryl.datalayer.author.AuthorDAO;
import org.ua.bryl.model.Author;

/**
 * Created by Sweet on 30.04.2017.
 */
@Controller
public class AuthorController {
    @Autowired
    private AuthorDAO authorDAO;

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public ModelAndView getAuthor() {
        Author author = new Author();
        author.setFirstName("Djigurda");
        author.setCodeNo(001);
        authorDAO.create(author);
        return new ModelAndView("/author/index");
    }

}
