package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Sanya on 02.12.2018.
 */
@Controller
@RequestMapping("/movie")
public class MovieController {
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String getMovie(@PathVariable String name, ModelMap model) {
        System.out.println("111");
        model.addAttribute("movie", name);
        return "list";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getDefaultMovie(ModelMap model) {
        System.out.println("222");
        model.addAttribute("movie", "this is default movie");
        return "list";
    }

}
