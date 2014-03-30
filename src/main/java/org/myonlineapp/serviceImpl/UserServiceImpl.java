package org.myonlineapp.serviceImpl;

import java.io.Serializable;

import org.myonlineapp.dao.IUserDao;
import org.myonlineapp.model.User;
import org.myonlineapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

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
