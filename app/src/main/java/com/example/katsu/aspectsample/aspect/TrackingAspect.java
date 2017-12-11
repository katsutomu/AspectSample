package com.example.katsu.aspectsample.aspect;

import com.example.katsu.aspectsample.Tracker;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class TrackingAspect {
    @Pointcut("execution(@com.example.katsu.aspectsample.aspect.SendEvent * *(..))")
    public void pointcutOnSendEventMethod() {
    }

    @Before("pointcutOnSendEventMethod()")
    public void adviceOnSendScreenView(JoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        SendEvent sendScreenView = method.getAnnotation(SendEvent.class);

        String eventParam = sendScreenView.eventParam();
        if (eventParam != null) {
            Tracker.Companion.sendEvent(eventParam);
        }
    }
}
