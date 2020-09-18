package Proj.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Proj.dao.UserRepository;
import Proj.entity.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userrep;
	
	@Override
	@Transactional
	public User getUser(String email,String pass) {
		return userrep.getUser(email,pass);
	}
}