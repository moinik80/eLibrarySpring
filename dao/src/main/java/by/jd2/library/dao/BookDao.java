package by.jd2.library.dao;

import by.jd2.library.pojos.Book;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao extends BaseDao<Book> implements IBookDao<Book> {

    @Autowired
    public BookDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }

    @Override
//    return list Book from database
    public List<Book> getBooks(String hql) {
        return getSession().createQuery(hql).list();
    }

    //    return list authors from entity Book from database
    @Override
    public List<String> getAuthors() {
        String hql = "SELECT DISTINCT bookAuthor FROM Book";
        return getSession().createQuery(hql).list();
    }
}
