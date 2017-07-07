package org.lucksoft.services;

import javax.annotation.Resource;

import org.lucksoft.data.UserDao;
import org.lucksoft.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao uDao;
	
	@Override
	public void sayHello(int id){
		User user = getUser(id);
		if(null!=user){
			System.out.println("Hello "+user.getUserName()+" !!!");
		}
	}

	@Override
	public User getUser(int id) {
		return uDao.findOne(id); 
	}

}
