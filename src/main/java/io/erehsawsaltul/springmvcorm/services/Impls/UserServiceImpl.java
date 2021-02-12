package io.erehsawsaltul.springmvcorm.services.Impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.erehsawsaltul.springmvcorm.daos.UserDAO;
import io.erehsawsaltul.springmvcorm.entities.User;
import io.erehsawsaltul.springmvcorm.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public int save(User user) {
		//Business Logic
		return userDAO.create(user);
	}
}
