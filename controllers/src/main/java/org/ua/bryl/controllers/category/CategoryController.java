package org.ua.bryl.controllers.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.ua.bryl.datalayer.category.CategoryDAO;
import org.ua.bryl.model.Category;

/**
 * Created by Sweet on 03.05.2017.
 */
@Controller
public class CategoryController {
    @Autowired
    private CategoryDAO categoryDAO;

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ModelAndView getCategory (){
        Category category = new Category();
        category.setCategoryName("Fantastika");
        category.setCodeNo(003);
        categoryDAO.create(category);
        return new ModelAndView("/category/index");
    }
}