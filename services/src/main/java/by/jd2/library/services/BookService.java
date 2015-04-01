package by.jd2.library.services;

import by.jd2.library.dao.BaseDao;
import by.jd2.library.dao.IBookDao;
import by.jd2.library.pojos.Book;
import by.jd2.library.selectHqlEnum.SelectHql;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BookService extends BaseService<Book> implements IBookService<Book> {

    @Autowired
    IBookDao bookDao;

//    return list Book, use BookDao
    @Override
    public List<Book> getBooks(String parametersSort) {
        String hql = SelectHql.valueOf(parametersSort).getHql();
        return bookDao.getBooks(hql);
    }

//    return list authors from class Book, use BookDao
    @Override
    public List<String> getAuthors() {
        return bookDao.getAuthors();
    }
}
