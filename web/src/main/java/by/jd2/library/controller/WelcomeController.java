//controller for page after authorisation

package by.jd2.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller

//redirect to page after authorisation
public class WelcomeController {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcomePage(ModelMap model, Principal principal){
        String userEmail = principal.getName();
        model.put("userEmail", userEmail);
        return "welcome";
    }
}
