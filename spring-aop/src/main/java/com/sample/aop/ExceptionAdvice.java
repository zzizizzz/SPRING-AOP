package com.sample.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionAdvice {

	@AfterThrowing(pointcut = "execution(* com.sample.service.*.*(..))", throwing = "ex") // 오류가 발생햇을떄 공통되는기능 "ex"변수객체를 주는것
	public void handleExceprion(Exception ex) {
		System.out.println("예외가 발생하였습니다. 오류메세지 :" + ex.getMessage());
		
	}
}
