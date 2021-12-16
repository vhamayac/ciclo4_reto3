package reto3.reto3.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;
import reto3.reto3.model.User;

import java.util.Optional;

public interface UserCrudRepository extends MongoRepository<User,Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    Optional<User> findByNameOrEmail(String name, String email);
}
