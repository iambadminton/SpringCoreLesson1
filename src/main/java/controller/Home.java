package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
    @RequestMapping(value = "/")
    public ModelAndView simple2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("simple");

        mav.addObject("message", "woohoooo1234");
        return mav;
    }
}