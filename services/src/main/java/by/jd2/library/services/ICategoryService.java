//interface for CategoryService

package by.jd2.library.services;

import java.util.List;

public interface ICategoryService<T> extends IService<T> {
    List<String> getCategories();
}
