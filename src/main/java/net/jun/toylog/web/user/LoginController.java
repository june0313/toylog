package net.jun.toylog.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wayne on 2017. 7. 24..
 *
 */
@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginForm() {
		return "user/loginForm";
	}

}
