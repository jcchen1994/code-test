package com.controller;

import com.aspect.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@org.springframework.stereotype.Controller
@Component
@RequestMapping("/")
public class Controller {
  @Autowired
  private Method method;
  @RequestMapping(value = "/{para}",method = RequestMethod.GET)
  public String hello(@PathVariable("para") String para)  {
    System.out.println(para);
    try {
      method.method();
    } catch (Exception e) {
      System.out.println("self handle");
    }
    return "hello";
  }
}
