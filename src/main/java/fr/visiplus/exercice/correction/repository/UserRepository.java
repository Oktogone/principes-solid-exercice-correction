package fr.visiplus.exercice.correction.repository;

import java.util.Collections;
import java.util.List;

import fr.visiplus.exercice.correction.model.User;
import fr.visiplus.exercice.correction.model.UserComparator;

public class UserRepository implements IRepository {

	public List<User> sortUsers(List<User> users) throws Exception {
		Collections.sort(users, new UserComparator());
		return users;
	}

}
