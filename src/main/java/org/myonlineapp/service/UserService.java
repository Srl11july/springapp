package org.myonlineapp.service;

import java.io.Serializable;

import org.myonlineapp.model.User;

public interface UserService {
	public void addUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public User getUserById(Serializable id);
}
