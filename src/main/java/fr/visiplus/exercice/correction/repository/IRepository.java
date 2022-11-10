package fr.visiplus.exercice.correction.repository;

import java.util.List;

import fr.visiplus.exercice.correction.model.User;

public interface IRepository {

	public List<User> sortUsers(List<User> users) throws Exception;

}
