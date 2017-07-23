package net.jun.toylog.web.user;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by wayne on 2017. 7. 23..
 *
 */
@Getter
@Setter
public class SignUpRequestDto {
	private String userId;
	private String email;
	private String password;
}
