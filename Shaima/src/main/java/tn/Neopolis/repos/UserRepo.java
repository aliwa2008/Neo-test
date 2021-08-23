package tn.Neopolis.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.Neopolis.models.User;

public interface UserRepo extends CrudRepository<User, Long> {

	@Query("SELECT m FROM User m WHERE m.email LIKE ?1%")
	User findByEmail(String email);

}