package br.com.embratel.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.embratel.springApp.model.User;
import br.com.embratel.springApp.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
	
	@Autowired
	private UserRepository repository;	
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setName("lucas");
		user.setUsername("lucasolasz");
		user.setPassword("lucas123");
		
		repository.save(user);
		
		for(User u: repository.findAll()) {
			System.out.println(u);
		}
	}

}
