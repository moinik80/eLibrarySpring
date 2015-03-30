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
    public List<Book> getBooks() {
        String hql = "FROM Book";
        Query query = getSession().createQuery(hql);

        return query.list();
    }
}
