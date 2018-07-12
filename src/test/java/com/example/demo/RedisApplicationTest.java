package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTest {

  @Autowired
  private RedisDao dao;

  @Test
  public void test() {
    dao.setKey("test", "a");
    System.out.println(dao.getKey("test"));
  }
}
