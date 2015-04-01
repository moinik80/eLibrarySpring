//interface for BookService

package by.jd2.library.services;

import java.util.List;

public interface IBookService<T> extends IService<T>{
    List<T> getBooks();
    List<String> getAuthors();
}
