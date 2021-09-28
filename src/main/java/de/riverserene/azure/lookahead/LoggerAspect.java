package de.riverserene.azure.lookahead;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

/**
 * @author Madhuri Ramachandran
 * with help from
 * https://dzone.com/articles/implementing-aop-with-spring-boot-and-aspectj
 * https://mvnrepository.com/artifact/org.aspectj/aspectjweaver
 * https://howtodoinjava.com/spring-aop/aspectj-pointcut-expressions/
 * https://www.baeldung.com/aspectj
 * https://stackoverflow.com/questions/12732069/how-to-automatically-log-the-entry-exit-of-methods-in-java
 * and an aspirational
 * https://camel.apache.org/components/latest/eips/intercept.html
 */
@Aspect
@Configuration
public class LoggerAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..))
    //Weaving & Weaver
//    @Before("execution(* de.riverserene.azure.lookahead.*.*(..))")
//    public void before(JoinPoint joinPoint) {
//        //Advice
//        logger.info(" Before {}", joinPoint.toLongString());
//    }
//
//    @After("execution(* de.riverserene.azure.lookahead.*.*(..))")
//    public void after(JoinPoint joinPoint) {
//        //Advice
//        logger.info("After {} ", joinPoint.toLongString());
//    }

//    @Around("execution(* de.riverserene.azure.lookahead.*.*(..))")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        //Advice
//        logger.info(" Calling '{}' with '{}'", joinPoint.toShortString(), joinPoint.getArgs());
//        Optional<Object> output = Optional.of(joinPoint.proceed());
//        logger.info("Method '{}' returns '{}' ", joinPoint.getKind(), output.orElse("<NULL>"));
//    }

//    @Before("within(de.riverserene.azure.lookahead..*))")
//    public void beforeMethod(JoinPoint joinPoint) {
//        //Advice
//        logger.info(" Before {}", joinPoint.toLongString());
//    }
//
//    @After("within(de.riverserene.azure.lookahead..*))")
//    public void afterMethod(JoinPoint joinPoint) {
//        //Advice
//        logger.info("After {} ", joinPoint.toLongString());
//    }

    @Around("within(de.riverserene.azure.lookahead..*)")
    public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        //Advice
        logger.info(" Calling '{}' with '{}'", joinPoint.toShortString(), joinPoint.getArgs());
        Optional<Object> output = Optional.of(joinPoint.proceed());
        logger.info("Method '{}' returns '{}' ", joinPoint.toShortString(), output.orElse("<NULL>"));
    }

}