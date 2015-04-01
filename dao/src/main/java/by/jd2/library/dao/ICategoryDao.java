//interface for categoryDao

package by.jd2.library.dao;

import java.util.List;

public interface ICategoryDao<T> extends  Dao<T> {
    List<String> getAuthors();
}
