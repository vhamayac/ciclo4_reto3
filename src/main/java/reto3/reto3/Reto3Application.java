package reto3.reto3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reto3.reto3.model.Gadget;
import reto3.reto3.model.User;
import reto3.reto3.repository.crud.GadgetCrudRepository;
import reto3.reto3.repository.crud.OrderCrudRepository;
import reto3.reto3.repository.crud.UserCrudRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Reto3Application implements CommandLineRunner {
	@Autowired
	private UserCrudRepository userCrudRepository;
	@Autowired
	private GadgetCrudRepository gadgetCrudRepository;
	@Autowired
	private OrderCrudRepository orderCrudRepository;

	public static void main(String[] args) {

		SpringApplication.run(Reto3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/**
		userRepo.deleteAll();

		userRepo.saveAll(List.of(
				new User(1, "123123", "CARLOS ALBERTO GARCIA", 1996-11-15,"11","CR 34-45", "311222222", "cgarcia@gmail.com", "Demo123.", "ZONA 2", "ADM")
		));
		System.out.println("Listado de Usuarios");
		userRepo.findAll().forEach(System.out::println);

		Optional<User> usuario = userRepo.findByEmail("cgarcia@gmail.com");

		if (usuario.isPresent()){
			System.out.println("Datos del Usuario" + usuario.get());
		}
		Optional<User> usuarioDos = userRepo.findByEmailAndPassword("cgarcia@gmail.com","Demo123");

		if (usuarioDos.isPresent()){
			System.out.println("Datos del Usuario" + usuarioDos.get());
		}
*/
	}

}