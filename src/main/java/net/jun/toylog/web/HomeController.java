package net.jun.toylog.web;

import net.jun.toylog.domain.user.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

/**
 * Created by wayne on 2017. 7. 22..
 *
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		SecurityContext context = SecurityContextHolder.getContext();
		Optional.ofNullable(context)
			.map(SecurityContext::getAuthentication)
			.map(Authentication::getPrincipal)
			.filter(User.class::isInstance)
			.map(User.class::cast)
			.ifPresent(user -> model.addAttribute("username", user.getUsername()));

		return "home/index";
	}

}
