package fr.visiplus.exercice.correction.service;

import java.util.List;

import fr.visiplus.exercice.correction.model.User;

public interface IService {

	public List<User> sortUsersByUsername(List<User> users) throws Exception;

}
