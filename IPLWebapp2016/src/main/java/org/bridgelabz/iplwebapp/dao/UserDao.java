package org.bridgelabz.iplwebapp.dao;

import org.bridgelabz.iplwebapp.model.User;

public interface UserDao {

	public void addUser(User user);

	public User authUser(String email, String password);

}
