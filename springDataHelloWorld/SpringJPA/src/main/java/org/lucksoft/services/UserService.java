package org.lucksoft.services;

import org.lucksoft.domain.User;

public interface UserService {
	
	public User getUser(int id);
	public void sayHello(int id);

}
