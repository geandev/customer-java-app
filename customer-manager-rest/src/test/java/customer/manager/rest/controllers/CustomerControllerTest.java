package customer.manager.rest.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import customer.manager.domain.services.CustomerService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Mock
  private CustomerService customerService;

  @Test
  public void getAllCustomerTest() throws Exception {
    this.mockMvc.perform(get("/customer")).andExpect(status().isOk());
  }

  public void addAllCustomerTest() throws Exception {
    this.mockMvc.perform(post("/customer")).andExpect(status().isOk());
  }
}
