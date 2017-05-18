package org.ua.bryl.controllers.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.ua.bryl.datalayer.author.AuthorDAO;

/**
 * Created by Sweet on 30.04.2017.
 */
@Controller(value = "/author")
public class AuthorController {
    @Autowired
    private AuthorDAO authorDAO;


    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public ModelAndView getAuthor() {
        System.out.println(authorDAO.createAuthor());
        return new ModelAndView("/author/index");
    }
}
