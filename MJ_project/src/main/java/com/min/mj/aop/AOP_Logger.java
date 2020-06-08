package com.min.mj.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import oracle.net.aso.j;

/**
 * AOP에서 사용하는 Advice 메소드
 * @author nobrand
 *
 */
public class AOP_Logger {
	
	
	//pointcut 에서 @Before
	public void before(JoinPoint j) {
		Logger log = LoggerFactory.getLogger(j.getTarget()+"");
		log.debug("##########START##########");
		Object[] obj = j.getArgs();
		if(obj !=null || obj.length !=0) {
			log.debug("Method명 :"+j.getSignature().getName());
			for (int i = 0; i < obj.length; i++) {
				log.debug(i+"번째:\t"+obj[i]);
			}
			log.debug("Method명 :"+j.getSignature().getName());
		}
	}
	
	//pointcut에서 @afterReturning
	public void afterReturning(JoinPoint j) {
		Logger log = LoggerFactory.getLogger(j.getTarget()+"");
		log.debug("########## 반환 완료 ##########");
	}
	
	//pointcut에서 @afterThrowing
	public void daoError(JoinPoint j) {
		Logger log = LoggerFactory.getLogger(j.getTarget()+"");
		log.debug("Error:\t"+j.getArgs());
		log.debug("Error:\t"+j.toString());
	}
}
