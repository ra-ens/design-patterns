package com.abdelhakimrafik.designpatterns.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LockAspect {

    @Around("@annotation(Lock)")
    public Object log(ProceedingJoinPoint joinPoint) {
        throw new RuntimeException(String.format("Function \"%s\" is locked!!", joinPoint.getSignature().getName()));
    }
}
