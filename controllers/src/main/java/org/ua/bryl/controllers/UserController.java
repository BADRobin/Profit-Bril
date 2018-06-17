package org.ua.bryl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.ua.bryl.datalayer.Security.SecuritService;
import org.ua.bryl.datalayer.service.UserService;
import org.ua.bryl.datalayer.validator.UserValidator;
import org.ua.bryl.model.User;

/**
 * Created by Sweet on 09.03.2017.
 */
@Controller

public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private SecuritService securitService;
    @Autowired
    private UserValidator userValidator;
    @RequestMapping(value = "/reqistration", method = RequestMethod.GET)
    public String reqistration(Model model){
        model.addAttribute("userForm", new User());
        return "registration";
    }
    @RequestMapping (value = "/reqistration", method = RequestMethod.POST)
    public String reqistration (@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model){
        userValidator.validate(userForm, bindingResult);
        if (bindingResult.hasErrors()){
            return "reqistration";
        }
        userService.save(userForm);
        securitService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());
        return "redirect:/welcome";
    }
    @RequestMapping (value = "/login", method = RequestMethod.GET)
    public String login (Model model, String error, String logout){
        if (error!=null){
            model.addAttribute("error", "Username or password is incorrect.");
        }
        if (logout!=null){
            model.addAttribute("message", "Logged out successfully.");
        }
        return "login";
    }
    @RequestMapping (value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome (Model model){
        return "welcome";
    }
    @RequestMapping (value = "/admin", method = RequestMethod.GET)
    public String admin (Model model){
        return "admin";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/" )

    public ModelAndView start() {

        return new ModelAndView("index");
    }

    @RequestMapping(method = RequestMethod.GET, value = "book/book")
    public ModelAndView knigi() {

        return new ModelAndView("book");
    }
    @RequestMapping(method = RequestMethod.GET, value = "author/author")
    public ModelAndView avtor() {

        return new ModelAndView("author");
    }
    @RequestMapping(method = RequestMethod.GET, value = "category/category")
    public ModelAndView hall() {

        return new ModelAndView("category");
    }
}