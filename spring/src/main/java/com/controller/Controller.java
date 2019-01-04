package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
  @RequestMapping(value = "/{para}",method = RequestMethod.GET)
  public String hello(@PathVariable("para") String para) {
    System.out.println(para);
    return "hello";
  }
}
