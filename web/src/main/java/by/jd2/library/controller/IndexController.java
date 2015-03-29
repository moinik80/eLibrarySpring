package by.jd2.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Иван on 29.03.2015.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String indexPage() {
        return "index";
    }
}
