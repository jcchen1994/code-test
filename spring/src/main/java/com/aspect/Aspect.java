package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;

@org.aspectj.lang.annotation.Aspect
public class Aspect {
  /*第一个“*”符号	表示返回值的类型任意
  * 包名后面的“..”	表示当前包及子包
  * 第二个“*”	表示类名，*即所有类
  * .*(..)	表示任何方法名，括号表示参数，两个点表示任何参数类型*/
  @Before("execution(* com..*.*(..))")
  public void beforeMethod()  {
    System.out.println("this is a before method");
  }

  @After("execution(* com..*.*(..))")
  public void afterMethod()  {
    System.out.println("this is a after method");
  }

  @AfterThrowing(pointcut = "execution(* com..*.*(..))", throwing = "ex")
  public void afterThrow(JoinPoint jp, Exception ex) {
    System.out.println("aop handle the exception");
  }


}
