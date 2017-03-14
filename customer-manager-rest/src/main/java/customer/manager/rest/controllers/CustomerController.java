package customer.manager.rest.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import customer.manager.domain.commands.CustomerRegisterCommandImp;
import customer.manager.domain.model.Customer;
import customer.manager.domain.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

  @RequestMapping(method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<CustomerRegisterCommandImp> registerCustomer(@RequestBody CustomerRegisterCommandImp command) {
    try {
      this.customerService.execute(command);
      return ResponseEntity.ok().body(command);
    } catch (Exception e) {
      logger.info(e.getMessage(), e);
      return ResponseEntity.badRequest().body(command);
    }
  }

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<List<Customer>> getAll() {
    try {
      List<Customer> model = this.customerService.getAll();
      return ResponseEntity.ok().body(model);
    } catch (Exception e) {
      logger.info(e.getMessage(), e);
      return ResponseEntity.badRequest().body(null);
    }

  }
}
