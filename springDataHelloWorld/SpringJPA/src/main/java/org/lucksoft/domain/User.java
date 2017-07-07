package org.lucksoft.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User entity.
 */
@Entity
@Table(name = "USER", catalog = "webdb")
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String userName) {
		super(userName);
	}

}
