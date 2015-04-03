//interface for BookService

package by.jd2.library.services;

import java.io.Serializable;
import java.util.List;

public interface IBookService<T> extends IService<T> {
    List<T> getBooks(String sortRow, String sortFlag, String countResult, String pageNumber);
    String[] getPageNumber(String pageNumber, String countResult, String btnNav);
    List<String> getAuthors();
}
