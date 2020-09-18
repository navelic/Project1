package Proj.service;

import Proj.entity.User;

public interface UserService {

	public User getUser(String email,String pass);
}
