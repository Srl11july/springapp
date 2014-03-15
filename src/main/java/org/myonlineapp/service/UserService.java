package org.myonlineapp.service;

import org.myonlineapp.model.User;

public interface UserService {
	public void addUser(User user);
	public void deleteUser(String userid);
	public void updateUser(User user);
	public User getUserById(String userid);
}
