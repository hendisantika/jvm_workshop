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
public class Publisher {
    private Long id;
    private String publisherName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", length = 11)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "PUBLISHER_NAME", length = 100,nullable = false)
    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "PublisherRepo{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}
