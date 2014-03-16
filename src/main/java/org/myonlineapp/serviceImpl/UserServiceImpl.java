package org.myonlineapp.serviceImpl;

import java.io.Serializable;

import org.myonlineapp.dao.UserDao;
import org.myonlineapp.model.User;
import org.myonlineapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(User user) {
		userDao.createNew(user);
	}

	@Override
	public void deleteUser(User user) {
		userDao.delete(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.merge(user);
	}

	@Override

	public User getUserById(Serializable id) {
		return userDao.get(id);
	}

}
