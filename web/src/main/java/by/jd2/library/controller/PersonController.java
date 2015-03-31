package by.jd2.library.controller;

import by.jd2.library.pojos.Person;
import by.jd2.library.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PersonController {
    @Autowired(required = true)
    private IPersonService personService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String usersController(ModelMap model)
    {
        fillModel(model);
        return "users";
    }

    private void fillModel(ModelMap model) {
        List<Person> list = personService.getPersons();
        model.put("users", list);
    }
}
