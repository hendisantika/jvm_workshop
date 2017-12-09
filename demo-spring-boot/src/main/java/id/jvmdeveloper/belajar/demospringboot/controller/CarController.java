package id.jvmdeveloper.belajar.demospringboot.controller;

import id.jvmdeveloper.belajar.demospringboot.entity.Car;
import id.jvmdeveloper.belajar.demospringboot.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-spring-boot
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/12/17
 * Time: 11.18
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/cars/")
public class CarController {

    @Autowired
    CarRepo carRepo;

    @GetMapping("")
    public Iterable<Car> getAllCars(){
        return carRepo.findAll();
    }

    @PostMapping("")
    public Car saveCar(@RequestBody Car car){
        return carRepo.save(car);
    }

    @GetMapping("{id}/findById")
    public Car findById(@PathVariable(value = "id") String id){
        return carRepo.findOne(Long.parseLong(id));

    }

    @DeleteMapping("{id}/delete")
    public void deleteCar(@PathVariable(value = "id") String id){
        carRepo.delete(Long.parseLong(id));
    }


    @GetMapping("/findByBrand")
    public List<Car> findByBrand(@RequestParam(value = "brand") String brand){
        return carRepo.findByBrand(brand);
    }
}
