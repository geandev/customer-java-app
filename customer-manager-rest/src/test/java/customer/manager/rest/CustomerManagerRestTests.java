package customer.manager.rest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import customer.manager.rest.controllers.CustomerController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerManagerRestTests {

  @Autowired
  private CustomerController controller;

  @Test
  public void contextLoads() throws Exception {
    Assert.assertNotNull(controller);
  }

}
