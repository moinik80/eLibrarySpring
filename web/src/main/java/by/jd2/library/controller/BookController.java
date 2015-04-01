//controller for page with list books

package by.jd2.library.controller;

import by.jd2.library.pojos.Book;
import by.jd2.library.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookController {
    @Autowired(required = true)
    private IBookService bookService;

//    redirect to page with list books
    @RequestMapping(value = "/books/{sortRow}/{sortFlag}", method = RequestMethod.GET)
    public String booksPage(@PathVariable String sortRow, @PathVariable String sortFlag, ModelMap model) {
        String parametersSort = sortRow.toUpperCase() + "_" + sortFlag.toUpperCase();
        fillModel(model, parametersSort);
//        request parameters for sorts
        sortFlag = ("up".equals(sortFlag))?"down":"up";
        model.put("sortFlag", sortFlag);

        sortRow = ("books".equals(sortRow))?"authors":"books";
        model.put("sortRow", sortRow);
//      select links for sorts
        if ("authors".equals(sortRow)) {
            model.put("linkBooks", "/books/books/" + sortFlag + ".form");
            model.put("linkAuthors", "/books/authors/up.form");
        } else {
            model.put("linkBooks", "/books/books/up.form");
            model.put("linkAuthors", "/books/authors/" + sortFlag + ".form");
        }
        return "books";
    }

//    redirect to form "add book"
    @RequestMapping(value = "/books/add", method = RequestMethod.GET)
    public String addBookPage() {
        return "addBook";
    }

//    redirect to page edit book
    @RequestMapping(value = "books/edit/{bookId}", method = RequestMethod.GET)
    public String editBookPage(@PathVariable String bookId, ModelMap model) {
        model.put("bookId", bookId);
        return "editBook";
    }

// write in model list books
    private void fillModel(ModelMap model, String parametersSort) {
        List<Book> list = bookService.getBooks(parametersSort);
        model.put("books", list);
    }
}
