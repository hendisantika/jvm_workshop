package id.jvmdeveloper.belajar.demospringboot.repository;

import id.jvmdeveloper.belajar.demospringboot.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-spring-boot
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/12/17
 * Time: 11.16
 * To change this template use File | Settings | File Templates.
 */
public interface CarRepo extends CrudRepository<Car, Long> {
    List<Car> findByBrand(String brand);
}
