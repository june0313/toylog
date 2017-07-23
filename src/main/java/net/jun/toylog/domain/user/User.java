package net.jun.toylog.domain.user;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by wayne on 2017. 7. 23..
 *
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String password;

	private User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public static User createNewUser(String name, String email, String password) {
		return new User(name, email, password);
	}
}
