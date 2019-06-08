package edu.graduate.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class LoginExceptionHandler {
	@ExceptionHandler(value=LoginException.class)
	public void handlerException(HttpServletResponse response) throws IOException{
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print("<script>alert('您还没有登录，请登录...'); window.location='/pageIndex' </script>");
	}
}
