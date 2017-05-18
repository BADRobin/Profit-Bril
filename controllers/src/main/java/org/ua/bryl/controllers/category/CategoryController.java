package org.ua.bryl.controllers.category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by Sweet on 03.05.2017.
 */




@Controller (value = "/category")
public class  CategoryController {

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ModelAndView getAuthor (){
        return new ModelAndView("/category/index");
    }
}