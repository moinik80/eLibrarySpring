//controller for page with list books

package by.jd2.library.controller;

import by.jd2.library.pojos.Book;
import by.jd2.library.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookController {
    @Autowired(required = true)
    private IBookService bookService;

//    redirect to page with list books
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String booksPage(ModelMap model) {
        fillModel(model);
        return "books";
    }

// write in model list books
    private void fillModel(ModelMap model) {
        List<Book> list = bookService.getBooks();
        model.put("books", list);
    }
}
