package com.jvmworkshop.contactwebapp.repository;

import com.jvmworkshop.contactwebapp.entity.Contact;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : contact-web-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/12/17
 * Time: 09.54
 * To change this template use File | Settings | File Templates.
 */
public interface ContactRepo extends PagingAndSortingRepository<Contact, Long> { }
