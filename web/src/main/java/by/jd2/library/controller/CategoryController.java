package by.jd2.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {
    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public String categoriesPage() {
        return "categories";
    }
}
