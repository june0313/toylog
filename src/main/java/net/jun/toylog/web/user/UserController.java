package net.jun.toylog.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by wayne on 2017. 7. 22..
 *
 */
@Controller
public class UserController {

	@GetMapping("/signUp")
	public String signUpForm() {
		return "user/signUpForm";
	}

	@PostMapping("/signUp")
	public String signUp(SignUpRequestDto dto) {
		return "redirect:/";
	}

}
