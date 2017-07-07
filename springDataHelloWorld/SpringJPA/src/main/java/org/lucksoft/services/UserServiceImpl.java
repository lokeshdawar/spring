package org.lucksoft.services;

import org.lucksoft.data.UserDao;
import org.lucksoft.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao uDao;
	
	public void sayHello(int id){
		User user = getUser(id);
		if(null!=user){
			System.out.println("Hello "+user.getUserName()+" !!!");
		}
	}

	public User getUser(int id) {
		return uDao.findOne(id); 
	}

}
