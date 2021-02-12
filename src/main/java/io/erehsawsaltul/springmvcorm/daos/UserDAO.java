package io.erehsawsaltul.springmvcorm.daos;

import java.util.List;

import io.erehsawsaltul.springmvcorm.entities.User;

public interface UserDAO {
	int create(User user);
	List<User> findUsers();
}
