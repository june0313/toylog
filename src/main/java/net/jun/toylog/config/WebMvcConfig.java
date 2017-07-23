package net.jun.toylog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wayne on 2017. 7. 23..
 *
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	private HandlerInterceptor csrfTokenInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(csrfTokenInterceptor).addPathPatterns("/**");
	}

	@Autowired
	public void setCsrfTokenInterceptor(HandlerInterceptor csrfTokenInterceptor) {
		this.csrfTokenInterceptor = csrfTokenInterceptor;
	}
}
