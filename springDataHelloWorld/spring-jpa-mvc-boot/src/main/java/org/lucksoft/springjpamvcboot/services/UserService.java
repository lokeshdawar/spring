package org.lucksoft.springjpamvcboot.services;

import org.lucksoft.springjpamvcboot.domain.User;

public interface UserService {
	
	public User getUser(int id);
	public void sayHello(int id);

}
