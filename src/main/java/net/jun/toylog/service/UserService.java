package net.jun.toylog.service;

import net.jun.toylog.domain.user.User;
import net.jun.toylog.repository.user.UserRepository;
import net.jun.toylog.web.user.SignUpRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wayne on 2017. 7. 23..
 *
 */
@Service
public class UserService {

	private UserRepository userRepository;

	public void signUp(SignUpRequestDto dto) {
		User user = User.createNewUser(dto.getName(), dto.getEmail(), dto.getPassword());
		userRepository.save(user);
	}

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
