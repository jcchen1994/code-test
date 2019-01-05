package com.aspect;

import org.springframework.stereotype.Component;

@Component("hcc")
public class Method {
  public void method() throws Exception {
    throw new Exception("this is a exception");
  }
}
