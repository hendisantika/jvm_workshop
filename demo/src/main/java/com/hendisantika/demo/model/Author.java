package com.hendisantika.demo.model;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/12/17
 * Time: 23.27
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Author {
    private Long id;
    private String authorName;
    private String authorAddress;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", length = 11)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "AUTHOR_NAME", length = 100,nullable = false)
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Column(name = "AUTHOR_ADDRESS", length = 255,nullable = true)
    public String getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(String authorAddress) {
        this.authorAddress = authorAddress;
    }

    @Override
    public String toString() {
        return "AuthorRepo{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", authorAddress='" + authorAddress + '\'' +
                '}';
    }
}
