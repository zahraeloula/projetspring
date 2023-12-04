package tn.esprit.se.springprojet.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
        @Before("execution(* tn.esprit.se.springprojet.service.Blocservice.*(..))")
        public void logMethodEntry(JoinPoint joinPoint) {
            String name = joinPoint.getSignature().getName();
            log.info("In method " + name + " : ");
        }


    @After("execution(* tn.esprit.se.springprojet.service.Blocservice.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("out of method " + name + " : ");
    }

    @AfterThrowing("execution(* tn.esprit.se.springprojet.service.Blocservice.*(..))")
    public void logMethodEntryAT(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");


    }

}
