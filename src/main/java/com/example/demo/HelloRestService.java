/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018年7月9日<br/>
 * Author: Zhuang YiHang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestService {

  @GetMapping("/hello")
  public String sayHello() {
    return "222";
  }

}
