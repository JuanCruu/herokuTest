package requiero.paz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import requiero.paz.model.User;
import requiero.paz.repository.UserRepository;

@SpringBootApplication
public class VolviendoAlRuedoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VolviendoAlRuedoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepos;

	@Override
	public void run(String... args) throws Exception {

		this.userRepos.save(new User("juan", "cruz", "nava@gmail"));
	}

}
