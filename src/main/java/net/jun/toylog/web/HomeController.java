package net.jun.toylog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wayne on 2017. 7. 22..
 *
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home/index";
	}

}
