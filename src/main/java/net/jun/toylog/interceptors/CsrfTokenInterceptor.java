package net.jun.toylog.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wayne on 2017. 7. 23..
 * model에 csrf token 값을 셋팅한다.
 */
@Component("csrfTokenInterceptor")
public class CsrfTokenInterceptor extends HandlerInterceptorAdapter {

	private static final String CSRF_PARAMETER_NAME = "_csrf";

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		modelAndView.addObject(CSRF_PARAMETER_NAME, request.getAttribute(CSRF_PARAMETER_NAME));
	}

}
