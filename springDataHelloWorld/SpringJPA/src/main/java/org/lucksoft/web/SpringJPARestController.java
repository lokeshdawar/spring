package org.lucksoft.web;

import org.lucksoft.domain.User;
import org.lucksoft.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SpringJPARestController {

	@Autowired
	private UserService uService;
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") int id) {
		return uService.getUser(id);
	}
}
