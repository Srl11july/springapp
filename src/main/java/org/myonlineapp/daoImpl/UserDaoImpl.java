package org.myonlineapp.daoImpl;

import org.myonlineapp.dao.UserDao;
import org.myonlineapp.model.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

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
		User user = new User();
		user.setUserid("100");
		user.setUsername("Saral Sharma");
		user.setUseremail("srl@gmail.com");
		user.setUserrole("admin");
		return user;
	}

}
