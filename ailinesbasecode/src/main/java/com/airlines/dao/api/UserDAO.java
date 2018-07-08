package com.airlines.dao.api;

import java.util.List;

import com.airlines.entity.User;

public interface UserDAO {
	public User saveUser(User users);

	public boolean deleteUser(User users);

	public List<User> getAllUser();

	public User getUserByUserName(String username);

	public User getUserByEmail(String email);

}
