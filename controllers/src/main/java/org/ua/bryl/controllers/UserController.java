package org.ua.bryl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Sweet on 09.03.2017.
 */
@Controller

public class UserController {
    @RequestMapping(method = RequestMethod.GET, value = "/" )

    public ModelAndView start() {

        return new ModelAndView("index");
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/book")
//    public ModelAndView knigi() {
//
//        return new ModelAndView("book");
//    }
//    @RequestMapping(method = RequestMethod.GET, value = "/author")
//    public ModelAndView avtor() {
//
//        return new ModelAndView("author");
//    }
//    @RequestMapping(method = RequestMethod.GET, value = "/category")
//    public ModelAndView hall() {
//
//        return new ModelAndView("category");
//    }
}