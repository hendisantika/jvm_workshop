package id.jvmdeveloper.belajar.demospringboot;

import id.jvmdeveloper.belajar.demospringboot.entity.Car;
import id.jvmdeveloper.belajar.demospringboot.repository.CarRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepo repository) {
		return (args) -> {
			repository.save(new Car("Ford", "Modeo", "Red", "Diesel", 2013));
			repository.save(new Car("Alfa Romeo", "Spider", "Black", "B98", 2016));
			repository.save(new Car("Mercedes-Benz", "180", "Silver", "Diesel", 2011));
			repository.save(new Car("Mercedes-Benz", "A", "Red", "A95", 2017));
			repository.save(new Car("Audi", "A3", "Black", "A95", 2014));
			repository.save(new Car("Toyota", "Auris", "Black", "A95", 2013));
			repository.save(new Car("Toyota", "Avensis", "White", "Diesel", 2015));
			repository.save(new Car("Nissan", "Micra", "", "A95", 2015));
			repository.save(new Car("Nissan", "X-Trail", "Blue", "Diesel", 2016));
		};
	}
}
