package fr.visiplus.exercice.correction;

import java.util.ArrayList;
import java.util.List;

import fr.visiplus.exercice.correction.model.User;
import fr.visiplus.exercice.correction.repository.IRepository;
import fr.visiplus.exercice.correction.repository.UserRepository;
import fr.visiplus.exercice.correction.service.IService;
import fr.visiplus.exercice.correction.service.ServiceImplementation;

public class Main {

	public static void main(String[] args) throws Exception {

		IRepository repository = new UserRepository();
		IService service = new ServiceImplementation(repository);

		List<User> list = new ArrayList<User>();
		list.add(new User("albert", "martin", "martina", "noidea"));
		list.add(new User("gerard", "charles", "charlesg", "idea"));

		service.sortUsersByUsername(list).forEach(System.out::println);

	}

}
