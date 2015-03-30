package by.jd2.library.services;

import by.jd2.library.dao.IBookDao;
import by.jd2.library.pojos.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BookService implements IBookService {

    @Autowired
    IBookDao bookDao;

    @Override
    public List<Book> getBooks() {
        return bookDao.getBooks();
    }
}
