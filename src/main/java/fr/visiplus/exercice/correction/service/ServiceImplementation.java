package fr.visiplus.exercice.correction.service;

import java.util.List;

import fr.visiplus.exercice.correction.model.User;
import fr.visiplus.exercice.correction.repository.IRepository;

public class ServiceImplementation implements IService {

	IRepository repository;

	public ServiceImplementation(IRepository repository) {
		this.repository = repository;
	}

	public List<User> sortUsersByUsername(List<User> users) throws Exception {
		return repository.sortUsers(users);
	}

}
