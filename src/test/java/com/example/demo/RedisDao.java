/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018年7月12日<br/>
 * Author: Zhuang YiHang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

@Repository
public class RedisDao {

  @Autowired
  private StringRedisTemplate template;

  public String getKey(String key) {
    ValueOperations<String, String> ops = template.opsForValue();
    return ops.get(key);
  }

  public void setKey(String key, String value) {
    ValueOperations<String, String> ops = template.opsForValue();
    ops.set(key, value);
  }
}
