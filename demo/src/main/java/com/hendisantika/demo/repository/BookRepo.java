package com.hendisantika.demo.repository;

import com.hendisantika.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/12/17
 * Time: 23.29
 * To change this template use File | Settings | File Templates.
 */
public interface BookRepo extends CrudRepository<Book, Long> {
}
