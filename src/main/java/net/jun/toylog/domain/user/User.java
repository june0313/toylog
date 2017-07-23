package net.jun.toylog.domain.user;

import com.google.common.collect.ImmutableList;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

/**
 * Created by wayne on 2017. 7. 23..
 *
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class User implements UserDetails {

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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return ImmutableList.of(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.name;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
