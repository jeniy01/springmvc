package kr.co.tjoeun.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor5 implements HandlerInterceptor{
	//Controller의 메서드가 호출되기 전에 자동으로 호출되는 메서드로 이 메서드가 false를 반환하면 code의 흐름이 중단됨
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("TestInterceptor5 - preHandle");
		return true;
	}
	
	//Controller의 메서드의 수행이 완료되고 View 처리를 수행하기 전에 자동으로 호출되는 메서드
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("TestInterceptor5 - postHandle");
	}
	
	//View 처리까지 완료되고 응답결과(response)가 Client의 browser로 전달되기 전에 자동으로 호출되는 메서드
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("TestInterceptor5 - afterCompletion");
	}
}
