package org.myonlineapp.dao;

import org.myonlineapp.model.User;

public interface UserDao {
	public void addUser(User user);
	public void deleteUser(String userid);
	public void updateUser(User user);
	public User getUserById(String userid);
}
