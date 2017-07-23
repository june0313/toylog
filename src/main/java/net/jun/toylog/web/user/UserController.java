package net.jun.toylog.web.user;

import net.jun.toylog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by wayne on 2017. 7. 22..
 *
 */
@Controller
public class UserController {

	private UserService userService;

	@GetMapping("/signUp")
	public String signUpForm() {
		return "user/signUpForm";
	}

	@PostMapping("/signUp")
	public String signUp(SignUpRequestDto dto) {
		userService.signUp(dto);
		return "redirect:/";
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
