package org.lucksoft.springjpamvcboot.web;


import org.lucksoft.springjpamvcboot.domain.User;
import org.lucksoft.springjpamvcboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SpringJPARestController {

	@Autowired
	private UserService uService;
	
	@GetMapping("/user/{id}")
	public ResponseEntity getUser(@PathVariable("id") int id) {
		//return uService.getUser(id);
		User user = uService.getUser(id);
		if (user == null) {
			return new ResponseEntity("No user found for ID " + id, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(user, HttpStatus.OK);
	}
}
