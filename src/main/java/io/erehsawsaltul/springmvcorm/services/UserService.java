package io.erehsawsaltul.springmvcorm.services;

import java.util.List;

import io.erehsawsaltul.springmvcorm.entities.User;

public interface UserService {
	int save(User user);
	List<User> getUsers();
}
