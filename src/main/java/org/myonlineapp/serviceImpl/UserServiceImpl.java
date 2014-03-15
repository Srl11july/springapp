package org.myonlineapp.serviceImpl;

import org.myonlineapp.dao.UserDao;
import org.myonlineapp.model.User;
import org.myonlineapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}// TODO Aut

	@Override
	public void deleteUser(String userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(String userid) {
		
		return userDao.getUserById(userid);
	}

}
