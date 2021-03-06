package io.erehsawsaltul.springmvcorm.daos.Impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import io.erehsawsaltul.springmvcorm.daos.UserDAO;
import io.erehsawsaltul.springmvcorm.entities.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(User user) {
		return (Integer) hibernateTemplate.save(user);
	}

	@Override
	public List<User> findUsers() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public User findUser(Integer id) {
		return hibernateTemplate.get(User.class, id);
	}
	
}
