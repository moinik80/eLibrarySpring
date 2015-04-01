//controller for page after authorisation

package by.jd2.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

//redirect to page after authorisation
public class WelcomeController {
    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public String welcomePage(){
        return "welcome";
    }
}
