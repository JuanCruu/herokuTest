package requiero.paz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import requiero.paz.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
	

}
