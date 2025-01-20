package com.tka.ascp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspect {
//	@Before("execution (public void recharge())")
//	public void beforeMSg() {
//		System.out.println("UR recharge is expiring soon ... plz recharge...! ");
//	}
//
//	@After("execution (public void recharge())")
//	public void afterMSg() {
//		System.out.println("enjoy UR data pack");
//	}
//}

	@Around("execution (* com.tka.entity.MobileRecharge.*())")
	public void aroundMSG(ProceedingJoinPoint pj) {
		System.out.println("UR recharge is expiring soon ... plz recharge...! ");

		try {
			pj.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("enjoy UR data pack");

	}
}