package edu.graduate.util;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@Configuration
@Aspect
public class IndexInterceptor {
	@Pointcut("execution(* edu.graduate.web.controller.IndexController.*(..))")
	public void verify() {
	}
	@Before("verify()")
	public void doVerify() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		Cookie cookie = CookieUtil.getCookie(request, "username");
		if (cookie == null) {
			request.setAttribute("username", null);
			return;
		}
		String username = cookie.getValue();
		request.setAttribute("username", username);
	}
}
